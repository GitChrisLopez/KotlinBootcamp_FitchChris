//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    //convert the argument to string
    val hour = args[0].toInt()

    //check the time and print the message
    if (hour < 12) {
        println("Good morning, Kotlin")
    } else {
        println("Good night, Kotlin")
    }
}
