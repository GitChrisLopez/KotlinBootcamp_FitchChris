package Game

fun main() {
    val game = Game()

    // While loop that's always true
    while (true) {

        // Instructions to the player
        print("Enter a direction: n/s/e/w: ")

        // Call makeMove
        game.makeMove(readLine())

        // Break condition
        if (game.path.isEmpty()) break
    }
}