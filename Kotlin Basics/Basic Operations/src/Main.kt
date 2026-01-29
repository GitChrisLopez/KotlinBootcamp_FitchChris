import java.awt.Color.black
import java.awt.Color.blue
import java.awt.Color.green
import java.awt.Color.red
import java.awt.Color.white
import kotlin.time.Duration.Companion.minutes

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Task list 1")

    println(
        "We have ${2.plus(71).plus(233).minus(13)} fish left. And we need ${
            2.plus(71).plus(233).minus(13).div(30)} aquariums."
    )

    //println("Task list 2")

    var rainbowColor = red
    rainbowColor = blue
    val blackColor = black
    //blackColor = white //ERROR!!!! :0

    //println("Task list 3")
    rainbowColor = null
    var greenColor = null
    var blueColor: Int? = null

    println("Task list 4")
    val list1 = listOf(null, null)
    println(list1)

    var list2: List<String>? = null
    println(list2)

    println("Task list 5")
    var nullTest: Int? = null
    val result = nullTest?.plus(1) ?: 0
    println(result)
}