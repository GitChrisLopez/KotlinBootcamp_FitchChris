package Game

import java.util.Scanner
import kotlin.math.absoluteValue

// Enum class
enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

// 1.Location class 4x4
class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    var x = 0
    var y = 0

    init {
        // Initialize map with descriptions
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "You are at coordinates ($i, $j). It looks like a vast field."
            }
        }
        map[0][0] = "You are at the STARTING point (0, 0). The adventure begins!"
        map[3][3] = "You are at (3, 3). You see the END in the distance."
    }

    // Location logic
    fun updateLocation(direction: Directions) {
        when (direction) {
            Directions.NORTH -> y = (y + 1).rem(height)
            Directions.SOUTH -> y = (y - 1).let { if (it < 0) it + height else it }.rem(height)
            Directions.EAST -> x = (x + 1).rem(width)
            Directions.WEST -> x = (x - 1).let { if (it < 0) it + width else it }.rem(width)
            else -> {}
        }
    }

    fun getDescription() = map[x][y]
}

// Game class
class Game {
    // Mutable list initialized with START
    var path = mutableListOf(Directions.START)

    //Instance of location
    val location = Location()

    // Lambdas
    val north = {
        path.add(Directions.NORTH)
        location.updateLocation(Directions.NORTH)
        true
    }
    val south = {
        path.add(Directions.SOUTH)
        location.updateLocation(Directions.SOUTH)
        true
    }
    val east = {
        path.add(Directions.EAST)
        location.updateLocation(Directions.EAST)
        true
    }
    val west = {
        path.add(Directions.WEST)
        location.updateLocation(Directions.WEST)
        true
    }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    // Function move
    fun move(where: () -> Boolean) {
        where()
        if (path.isNotEmpty()) println(location.getDescription())
    }

    // Function makeMove that takes a nullable string argument and return absolutely nothing
    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}
