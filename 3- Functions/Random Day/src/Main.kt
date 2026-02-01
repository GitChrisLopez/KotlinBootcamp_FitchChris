import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    feedTheFish()
}

fun feedTheFish() {
    //Basic structure
    //val day = "Tuesday"
    val day = randomDay()
    val food = "pellets"
    println("Today is $day, and the fish eat $food")
}

//Choose a random day each time the program runs
fun randomDay() : String {
    //List of week days as string
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    //Return a value at a randomly chosen index inside the list "week"
    return week[Random().nextInt(7)] //Random number between 1 and 6
}