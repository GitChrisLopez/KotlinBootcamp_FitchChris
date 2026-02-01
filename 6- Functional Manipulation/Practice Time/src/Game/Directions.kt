package Game

// Enum class
enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

// Game class
class Game {
    // Mutable list initialized with START
    var path = mutableListOf(Directions.START)

    // Lambdas
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    // End lambda
    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}
