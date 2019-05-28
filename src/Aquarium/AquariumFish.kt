package Aquarium

// One is abstract classes, one is interfaces.
// Both are classes that cannot be instantiated on their own, which means you cannot create objects of those types yet.
// The difference is that abstract classes have constructors while Interfaces can't have any constructor logic.
abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {

    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {

    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

interface FishAction {
    fun eat()
}