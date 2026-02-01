import java.util.*

fun main(args: Array<String>) {
    println("Hello Kotlin")
    feedTheFish()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }

    repeat(2) {
        println("Fish are swimming!!!")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

//fun makeNewAquarium() = println("Building a new aquarium...")
//fun aquariumStatusReport(aquarium: Any = makeNewAquarium()): Int { }

fun isTooHot(temperature: Int): Boolean = temperature > 30
fun isDirty(dirty: Int): Boolean = dirty > 30
fun isSunday(day: String): Boolean = day == "Sunday"

fun feedTheFish() {
    //Basic structure
    //val day = "Tuesday"
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day, and the fish eat $food")

    swim(50, speed = "slow")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 100)
    shouldChangeWater(day = "Monday")

    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun swim(time: Int, speed: String) {
    println("Swimming $speed")
}

//Choose a random day each time the program runs
fun randomDay(): String {
    //List of week days as string
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //Return a value at a randomly chosen index inside the list "week"
    return week.random() //Random number between 1 and 7
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    //Calculate the limit depending on whether the tank has decorations or not
    val capacityLimit = if (hasDecorations) tankSize * 0.8 else tankSize

    //We check and verify that we can indeed add the fishes and check the capacity limit
    return (currentFish.sum() + fishSize) <= capacityLimit
}

fun fishFood(day: String): String {
    val food = "fasting"

    //Picks the food depending on the day selected, "when" automatically breaks
    //Unless we put the return statement along with "when", where we need an else branch at the end
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "ceviche"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "starve"
    }
}