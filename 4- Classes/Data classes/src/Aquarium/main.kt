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

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small aquarium volume: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small aquarium 2: ${myAquarium2.volume} liters with " +
            "length ${myAquarium2.length}, " +
            "width ${myAquarium2.width}, " +
            "height ${myAquarium2.height}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun MakeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Pleco: ${pleco.color}")

    shark.eat()
    pleco.eat()

}