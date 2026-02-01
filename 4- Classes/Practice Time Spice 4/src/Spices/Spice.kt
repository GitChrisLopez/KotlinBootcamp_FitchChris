package Spices

class Spice(val name: String, val spiciness: String = "mild") {

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
}

fun makeSalt() = Spice("Salt", "mild")