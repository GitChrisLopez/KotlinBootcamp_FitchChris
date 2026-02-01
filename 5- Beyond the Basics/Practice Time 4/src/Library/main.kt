package Library

import java.time.Year


fun main() {
    // Book instance
    val myBook = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 100)
    val (title, author, year) = myBook.triple()
    val puppy = Puppy()

    // Create a Set of book titles called allBooks
    val allBooks = setOf("Hamlet", "Macbeth", "Othello", "Romeo and Juliet")

    // Create a Map called library
    val library = mapOf("William Shakespeare" to allBooks)

    // Use the collections function any() on library
    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println("Does the library have Hamlet? $hasHamlet")

    // Create a MutableMap
    val moreBooks = mutableMapOf("F. Scott Fitzgerald" to "The Great Gatsby")

    // Use getOrPut() to check for a title
    moreBooks.getOrPut("George Orwell") { "1984" }

    val existingAuthor = moreBooks.getOrPut("F. Scott Fitzgerald") { "Unknown Book" }

    // Print out info
    println("Here is your book $title written by $author in $year.")

    println("Current moreBooks map: $moreBooks")
    println("Result of getOrPut for Fitzgerald: $existingAuthor")

    // Borrow the book
    println("Can borrow? ${myBook.canBorrow(3)}") // yes he can :P

    // URL
    myBook.printUrl()

    // Puppy plays with the book until no pages are left (oh no D:)
    while (myBook.pages > 0) {
        val remainingBefore = myBook.pages
        puppy.playWithBook(myBook)
        println("Puppy played! Pages decreased from $remainingBefore to ${myBook.pages}")
    }

    println("Initial weight: ${myBook.getWeight()}g")
    println("The book is destroyed! Final weight: ${myBook.getWeight()}g")
}