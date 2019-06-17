package Practice.Buildings

// 11.Quiz: Practice Time - Generics
fun main(args:Array<String>) {
    val building = Building(Wood())
    building.build()
    // 16. Quiz
    isSmallBuilding(building)
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

// 14. Quiz:Practice Time - Generic In and Out
class Building<out T:BaseBuildingMaterial> (val buildingMaterials: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterials.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterials::class.simpleName} required")
    }
}

// 16.Quiz: Practice Time - Generic function
fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("small building") else println("large building")
}

