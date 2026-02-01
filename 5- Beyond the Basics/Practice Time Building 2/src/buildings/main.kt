package buildings

fun main() {
    // Wood building
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
        if (building.actualMaterialsNeeded < 500) println("Small building")
        else println("large building")
    }
    isSmallBuilding(Building(Brick()))
}