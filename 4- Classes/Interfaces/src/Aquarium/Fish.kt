package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        if(friendly) {
            size = volumeNeeded
        }else{
            size = volumeNeeded * 2
        }
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true,20)
    println("Is this fish friendly? ${fish.friendly}. " +
            "It needs volume ${fish.friendly}.")
}