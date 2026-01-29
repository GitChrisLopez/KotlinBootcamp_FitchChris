import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    feedTheFish()
}

fun feedTheFish() {
    //Basic structure
    //val day = "Tuesday"
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day, and the fish eat $food")
}

//Choose a random day each time the program runs
fun randomDay() : String {
    //List of week days as string
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //Return a value at a randomly chosen index inside the list "week"
    return week.random() //Random number between 1 and 7
}

fun fishFood(day : String) : String {
    var food = "fasting"

    //Picks the food depending on the day selected, "when" automatically breaks
    //Unless we put the return statment along with "when", where we need an else branch at the end
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "ceviche"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "starve"
    }

}