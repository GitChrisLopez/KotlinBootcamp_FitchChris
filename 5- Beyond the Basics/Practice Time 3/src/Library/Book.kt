package Library

// Create a top-level constant
const val MAX_BORROW_LIMIT = 5

class Book(var title: String, var author: String, var year: Int) {

    // Method to check if a user can borrow more books
    fun canBorrow(borrowedCount: Int): Boolean {
        return borrowedCount < MAX_BORROW_LIMIT
    }

    // Companion object to define the base url
    companion object {
        const val BASE_URL = "https://library.example.com/catalog/"
    }

    // Create and print a URL for the book
    fun printUrl() {
        val formattedTitle = title.replace(" ", "_")
        println("${BASE_URL}${formattedTitle}.html")
    }

    fun pair(): Pair<String, String> {
        return Pair(title, author)
    }

    fun triple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }
}