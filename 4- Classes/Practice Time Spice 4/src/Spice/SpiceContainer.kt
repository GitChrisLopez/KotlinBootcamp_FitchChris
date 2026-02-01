package Spice

// Create a simple data class
data class SpiceContainer(val spice: Spice) {

    // Property and label
    val label: String
        get() = spice.name
}

fun main() {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))
    val salt = object : Spice("Salt", "mild") {
        override fun prepareSpice() {
            println("Preparing salt.")
        }
    }

    val saltContainer = SpiceContainer(salt)

    println("Container 1 label: ${spiceCabinet.size}")
    println("Container 2 label: ${saltContainer.label}")
}