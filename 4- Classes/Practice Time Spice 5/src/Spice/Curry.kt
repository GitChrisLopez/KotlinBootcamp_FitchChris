package Spice

// New subclass curry
class Curry(
    spiciness: String,
    color: String = YellowSpiceColor
) : Spice("Curry", spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
        println("Sautéing the curry base to release the $spiciness flavors.")
    }

    override fun grind() {
        println("Grinding the curry ingredients into a fine powder.")
    }
}