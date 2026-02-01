//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Int array of numbers from 11 to 15
    val numbers = intArrayOf(11, 12, 13, 14, 15)

    //empty mutable list for Strings
    val list = mutableListOf<String>()

    //for loop that loops over the array and adds the string rep of each numbe
    for (n in numbers) {
        list.add(n.toString())
    }
    println(list)

    //challenge, list of numbers between 0 and 100 divisible by 7
    val challenge = mutableListOf<Int>()
    for(i in 0..100 step 7) challenge.add(i)
    println(challenge)
}