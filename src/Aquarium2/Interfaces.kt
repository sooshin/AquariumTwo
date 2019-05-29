//package Aquarium2
//
//import Aquarium.FishAction
//
//interface AquariumAction {
//    fun eat()
//    fun jump()
//    fun clean()
//    fun catchFish()
//    fun swim() {
//        println("swim")
//    }
//}
//
//interface FishAction {
//    fun eat()
//}
//
//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}
//
//// Interface delegation lets you add features to a class via composition.
//// Composition is when you use an instance of another class as opposed to inheriting from it.