package Spice

// Abstract
abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 10
                "spicy" -> 15
                "very spicy" -> 20
                else -> 0
            }
        }

    init {
        println("Created spice: $name with spiciness level: $spiciness (Heat: $heat)")
    }

    // Abstract method
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind() {
        println("Grinding...")
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}