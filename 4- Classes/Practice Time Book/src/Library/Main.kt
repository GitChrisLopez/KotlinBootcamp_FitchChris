package Library

fun main(args: Array<String>) {
    readBook()
}

fun readBook() {
    val readABook = Book("The Name of the Wind", "Patrick Rothfuss")
    readABook.readPage()
}