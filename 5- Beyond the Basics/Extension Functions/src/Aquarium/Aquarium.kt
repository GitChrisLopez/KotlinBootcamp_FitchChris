package Aquarium

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces() // true
}

open class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nulleableExample() {
    val plant: AquariumPlant? = null
    plant.pull() // ok
}