package Spice

// Abstract
sealed class Spice(
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

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}