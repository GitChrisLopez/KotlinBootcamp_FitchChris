package List

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = numbers.divisibleBy { it % 3 }

    println(result)
}