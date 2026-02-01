package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

internal fun buildAquarium() {
    val myAquarium = Aquarium()

    println("My aquarium length is ${myAquarium.length} ," +
            " width ${myAquarium.width} ," +
            " and height ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")
}