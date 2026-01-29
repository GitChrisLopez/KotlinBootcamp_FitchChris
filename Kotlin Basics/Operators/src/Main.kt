//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    println("Operators\n")

    println(1 + 1)

    println(53 - 3)

    println(50 / 10)

    println(1 / 2)

    println(1.0 / 2.0)

    println(6 * 50)

    println("\nDefine your own fish\n")

    val fish = 2
    println(fish.times(6))
    println(fish.div(10))
    println(fish.plus(3))

    println("\nVariables\n")

    val aquarium = 1 //unchangeable
    var shark = 2 //unchangeable

    shark = 50
    println(shark)

    val plants = 5
    println(plants+fish)

    println("No pointer exception")
    var marbles : Int? = null

}