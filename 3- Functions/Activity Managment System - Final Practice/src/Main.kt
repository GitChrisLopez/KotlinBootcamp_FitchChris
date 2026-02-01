import java.time.LocalTime

fun main(args: Array<String>) {
    println("Ready to see what will you do today?")
    print("How are you feeling today?")
    val mood = readLine() ?: "neutral"

    print("Do you have any homework?")
    val homework = readLine() ?: "no"

    print("Are you hungry?")
    val hungry = readLine() ?: "no"

    print("Have you showered yet?")
    val shower = readLine() ?: "no"

    print("From 1 to 10, how dirty is the house?")
    val dirty = readLine()?.toIntOrNull() ?: 0

    val activity = activityForToday(mood, homework, hungry, shower, dirty)
    println("You should... $activity")

    println("Let's check now if the time is right for your activity!") //Lambda
    val whatTimeIsIt = { h: Int -> h > 22 || h < 6 }

    verifyActivity(activity, whatTimeIsIt)
}

//Parameters
fun activityForToday(mood: String, homework: String, hungry: String, shower: String, dirty: Int): String{
    return when{
        mood == "happy" && homework == "no" && hungry == "no" && shower == "yes" && dirty <5 -> "Then play video games!"
        mood == "happy" && homework == "yes" -> "Finish your homework first and then you can have fun!"
        mood == "sad" && homework == "yes" -> "Maybe relax a bit and then do your homework"
        mood == "sad" && homework == "no" -> "Watch some funny videos to cheer you up!"
        mood == "angry" && homework == "yes" -> "Maybe a cold shower might help?"
        mood == "bored" && homework == "yes" -> "Well, doing your homework can be entertaining!"
        mood == "bored" && homework == "no" -> "Play League of Legends"
        dirty > 5 -> "Clean the house first"
        shower == "no" -> "Take a shower, stinky!"
        mood == "depressed" -> "Are you ok? maybe talk to someone"
        mood == "sick" -> "Visit the doctor!"
        mood =="hungry" -> "Before anything, you should eat!"
        else -> "Take a nap maybe"
    }
}

//Function
fun verifyActivity(activity: String, timeValidator: (Int) -> Boolean) {
    val currentHour = LocalTime.now().hour

    if (timeValidator(currentHour)) {
        println("It's $currentHour:00. A bit too late, don't you think? Maybe you should sleep instead of: $activity !")
    } else {
        println("It's $currentHour:00. Perfect time to: $activity !")
    }
}

