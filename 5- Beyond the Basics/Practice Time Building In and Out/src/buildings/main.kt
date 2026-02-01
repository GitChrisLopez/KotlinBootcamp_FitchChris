package buildings

fun main() {
    // Wood building
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T)
}