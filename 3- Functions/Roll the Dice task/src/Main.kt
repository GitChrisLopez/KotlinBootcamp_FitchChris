fun main() {
    println(rollDice(2))
    println(rollDice2(6))

    //Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called
    gameplay(rollDice2)
}

//Extend the lambda to take an argument indicating the number of sides of the dice used for the roll
val rollDice = { sides: Int ->
    if (sides == 0) 0
    else (1..sides).random()
}

//Create a new variable, rollDice2
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else (1..sides).random()
}

//Why would you want to use the function type notation instead of just the lambda?
//It's easier to understand, and it's abstract

//Create a function gamePlay() that takes a roll of the dice as an argument and print it
fun gameplay(diceRoll: (Int) -> Int) {
    val result = (diceRoll(5))
    println("Result: $result")
}
