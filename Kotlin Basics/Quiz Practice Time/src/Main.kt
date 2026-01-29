//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Task 1")

    var trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $haddock, I don't like $snapper though.")

    println("Task 2")
    var fishName = "Guaufgang Amadeus"

    when(fishName.length){
        0 -> println("Fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}