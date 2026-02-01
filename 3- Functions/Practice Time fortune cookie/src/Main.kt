fun main(args: Array<String>) {
    //Extra Practice
    //Loop to run the program until the "You will die tomorrow" result is selected because it's spooky and 100% real
    var fortune: String

    do {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    } while (fortune != "You will die tomorrow.")

    println("Oh no. Well, too bad. Bye!")
}

fun getFortuneCookie(): String {
    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
        "You will die tomorrow."
    )

    //Print is for input, println to just print stuff
    print("Enter your birthday: ")

    //If there is no valid input, set birthday to 1
    val birthday = readLine()?.toIntOrNull() ?: 1

    //Divide the birthday by the number of fortunes (fortune.size) and we will use the remainder
    // as the index for the fortune to return
    val remainder = birthday.rem(fortune.size)

    //Return the fortune
    val fortuneResult = fortune[remainder]
    return fortuneResult
}
