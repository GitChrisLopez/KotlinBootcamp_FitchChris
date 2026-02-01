package Spice

import Spices.SimpleSpice
import Spices.Spice
import Spices.makeSalt

fun main() {
    // Instance of Curry
    val myCurry = Curry("mild")

    println("The color of the ${myCurry.name} is ${myCurry.color}")

    myCurry.prepareSpice()
}