fun main(args: Array<String>) {
    print("How are you feeling today?: ")
    //Instead of passing in the mood, get a mood string from the user
    val mood = readLine()!!

    print("How's the weather today?: ")
    val weather = readLine() ?: "sunny"

    print("What's today's temperature?: ")
    val temperature = readLine()?.toIntOrNull() ?: 20

    println("You should... ${whatShouldIDoToday(mood, weather, temperature)}")
}


//Create a single-expression function for each condition and then use it in your when expression.
fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainy(mood: String, weather: String) = mood == "sad" && weather == "rainy"
fun isTooHot(temperature: Int) = temperature > 35
fun isProductiveCloudy(mood: String, weather: String) = mood == "productive" && weather == "cloudy"
fun isTiredSunny(mood: String, weather: String) = mood == "tired" && weather == "sunny"
fun isCreativeRainy(mood: String, weather: String) = mood == "creative" && weather == "rainy"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappySunny(mood, weather) && temperature == 0 -> "Go to the beach"
        isSadRainy(mood, weather) && temperature <= 15 -> "stay in bed"
        isProductiveCloudy(mood, weather) && temperature in 15..25 -> "Clean the house"
        isTiredSunny(mood, weather) && temperature > 25 -> "Take a nap"
        isCreativeRainy(mood, weather) && temperature > 20 -> "Paint a picture"
        isTooHot(temperature) -> "go swimming"
        mood == "angry" && weather == "rainy" -> "Play League of Legends"
        else -> "Stay home and play video games."
    }
}