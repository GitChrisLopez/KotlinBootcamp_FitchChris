package Spices

fun main() {
    val mySpice = SimpleSpice()

    println("The spice name is ${mySpice.name},")
    println(" and the heat level is ${mySpice.heat}")

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("habanero", "very spicy"),
        Spice("black pepper", "medium"),
        makeSalt()
    )

    val mildSpices = spices.filter { it.heat <= 15 }
    mildSpices.forEach { println("${it.name} (${it.spiciness})") }
 }