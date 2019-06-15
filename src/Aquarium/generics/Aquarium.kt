package Aquarium.generics

fun main(args:Array<String>) {
   genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {

    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<out T: WaterSupply> (val waterSupply: T) {

    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }

        println("adding water from $waterSupply")
    }

//    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

// star projection
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

// T is a type parameter to isWaterClean that is being used to specify the
// generic type of aquarium.
fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}


// Define an extension function on WaterSupply
inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample() {

    val aquarium = Aquarium(TapWater())
    isWaterClean(aquarium) // isWaterClean<TapWater>(aquarium)

    // Call generic method by using angle brackets after the function name
    aquarium.hasWaterSupplyOfType<TapWater>() // true
    aquarium.waterSupply.isOfType<LakeWater>() // false
}