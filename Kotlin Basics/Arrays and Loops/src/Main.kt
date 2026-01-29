import java.util.*

fun main() {
    // Lists
    val myList = mutableListOf("tune", "salmon", "shark")
    println(myList)
    myList.remove("shark")
    println(myList)

    // Loop
    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants)

    // Arrays

    //String Array
    val school = arrayOf("sketchbook", "pencil", "book")

    //Number Array
    val numbers = intArrayOf(1, 2, 3)

    //Print the Array
    val mix: Array<Any> = arrayOf("fish", 2)
    println(Arrays.toString(mix))

    //Nest Arrays
    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "wale", "orka"))
    println(Arrays.toString(bigSwarm))

    //Initialize them w dynamic code
    val array = Array(5) { it * 2 }
    println(array.asList())

    //Loop
    for (element in swarm) println(element)

    //Loop over the index and elements
    for ((index, element) in swarm.withIndex()) {
        println("Fish at $index at $element")
    }

    //Ranges
    for (i in 'b'..'g') println(i)

    for(i in 1..5) println(i)

    for(i in 5 downTo 1) println(i)

    for(i in 3..6 step 2) println(i)
}