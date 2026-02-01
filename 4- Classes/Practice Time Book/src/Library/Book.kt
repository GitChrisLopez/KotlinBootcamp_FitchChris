package Library

// Class book
open class Book(
    val title: String,
    val author: String
) {

    // Private variable
    private var currentPage: Int = 0

    // Method
    open fun readPage() {
        currentPage++
        println("Reading $title... Currently on page: $currentPage")
    }
}

