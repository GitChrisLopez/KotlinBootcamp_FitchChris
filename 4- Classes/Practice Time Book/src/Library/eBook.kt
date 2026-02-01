package Library

// Subclass
class eBook(
    title: String,
    author: String,
    val format: String = "text" // Default
) : Book(title, author) {

    private var wordCount: Int = 0

    // Override of readPage
    override fun readPage() {
        // Increase the word count by 250
        wordCount += 250
        println("Reading $title ($format)... Words consumed: $wordCount")
    }
}