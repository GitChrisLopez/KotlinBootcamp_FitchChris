package buildings

import kotlin.reflect.KClass

// Create a class BaseBuildingMaterial with a property numberNeeded
open class BaseBuildingMaterial(val numberNeeded: Int = 1)

// Create two subclasses, Wood and Brick
class Wood : BaseBuildingMaterial(numberNeeded = 4)
class Brick : BaseBuildingMaterial(numberNeeded = 8)

// Hierarchy and generic class
class Building<T : BaseBuildingMaterial>(val material: T) {
    // A building always requires 100 base materials
    val baseMaterialsNeeded = 100

    // Calculate materials
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    // Add a method build() that prints the type and number
    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}
