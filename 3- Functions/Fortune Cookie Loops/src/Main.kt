import java.time.LocalDate

fun main(args: Array<String>) {
    //Loop to run the program until the "You will die tomorrow" result is selected because it's spooky and 100% real
    var fortune: String

    //Change your fortune cookie program to use a while loop, which is the better choice when you are looping until a condition is met
    do {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    } while (fortune != "You will die tomorrow.")

    println("Oh no... Well, too bad. Bye!")
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
        "You will die tomorrow."
    )

    val birthday = getBirthday()

    //Instead of calculating the fortune based on the birthday, now we use a when
    return when(birthday){
        28, 31 -> "You will have a bad day."
        in 1..7 -> "Money is coming your way."
        else -> fortunes[birthday % fortunes.size]
        //Divide the birthday by the number of fortunes (fortune.size)
    }
}

fun getBirthday(): Int {
    //Print is for input, println to just print stuff
    print("Enter your birthday: ")

    //If there is no valid input, set birthday to 1
    return readLine()?.toIntOrNull() ?: 1
}
