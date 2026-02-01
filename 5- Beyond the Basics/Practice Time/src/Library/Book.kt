package Library

import java.time.Year

class Book(var title: String, var author: String, var year: Year) {

    // These should now resolve to kotlin.Pair automatically
    fun pair(): Pair<String, String> {
        return Pair(title, author)
    }

    // These should now resolve to kotlin.Triple automatically
    fun triple(): Triple<String, String, Year>{
        return Triple(title, author, year)
    }
}