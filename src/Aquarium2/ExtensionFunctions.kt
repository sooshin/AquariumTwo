package Aquarium2

fun main(args:Array<String>) {
    staticExample()
}

fun String.hasSpaces(): Boolean {
    val found: Char? = this.find { it == ' ' }
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces() // true
}


class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "Red"

//fun AquariumPlant.isBig() = size > 50 // gives an error saying "Size is private"


open class AquariumPlant2(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant2("Green", size)

fun AquariumPlant2.isRed() = color == "Red"

// Declare two extension functions as free functions outside of the class
fun AquariumPlant2.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant2 = plant
    aquariumPlant.print() // AquariumPlant <-- This is because the extension
                                      // function is resolved statically
}


// You can define extension properties.
class AquariumPlant3(val color: String, private val size: Int)

val AquariumPlant3.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant3("Green", 50)
    plant.isGreen // true
}


// You can also make the class you're extending, which is sometimes called
// the receiver nullable.
class AquariumPlant4(val color: String, private val size: Int)

fun AquariumPlant4?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant: AquariumPlant4? = null
    plant.pull() // ok
}