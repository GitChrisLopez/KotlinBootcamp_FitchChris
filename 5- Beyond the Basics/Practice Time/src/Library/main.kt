package Library

import java.time.Year


fun main() {
    // Book instance
    val myBook = Book("The Great Gatsby", "F. Scott Fitzgerald", Year.of(1925))
    val (title, author, year) = myBook.triple()

    // Print out info
    println("Here is your book $title written by $author in $year.")
}