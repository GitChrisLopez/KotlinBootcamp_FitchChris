fun main(args: Array<String>) {
    print("How are you feeling today?: ")
    val mood = readLine() ?: "neutral"

    print("How's the weather today?: ")
    val weather = readLine() ?: "sunny"

    print("What's today's temperature?: ")
    val temperature = readLine()?.toIntOrNull() ?: 0

    val activity = whatShouldIDoToday(mood, weather, temperature)
    println("You should... $activity")
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" && temperature == 0 -> "Go to the beach"
        mood == "sad" && weather == "rainy" && temperature <= 15 -> "stay in bed"
        mood == "angry " && weather == "sunny" && temperature <= 20 -> "Go to eat"
        mood == "happy" && weather == "snow" && temperature <= 30 -> "Make a snowman"
        mood == "angry" && weather == "rainy" && temperature <= 30 -> "Play League of Legends"
        mood == "anxious" && weather == "rainy" && temperature <= 30 -> "Make yourself a tea"
        temperature > 35 -> "go swimming"
        mood == "neutral" -> "I don't know man."
        else -> "Stay home and play video games."
    }
}