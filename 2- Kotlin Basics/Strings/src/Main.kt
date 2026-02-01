//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello Fish!")
    println("hello " + "fish")

    var numberOfFish = 5
    var numberOfPlants = 12

    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    //Conditions

    val fish = "fish"
    val plant = "plant"

    fish == plant
    fish ==  fish
    fish != plant

    numberOfFish = 50
    numberOfPlants = 23

    if(numberOfFish > numberOfPlants) println("Good ratio!")
    else println("Bad ratio!")

    var shark = 50
    if (shark in 1..100) println(shark)

    when(numberOfFish){
        0 -> println("Empty tank")
        50 -> println("Full tank")
        else -> println("Perfect!")
    }





}