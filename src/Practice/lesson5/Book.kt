package Practice.lesson5

// Lesson 5
// 3. Quiz: Practice Time - Pairs
fun main(args: Array<String>) {
    test()
}

// 9.1
class Book (val title: String, val author: String, val year: Int, var pages: Int) {

    fun getTitleAuthor() : Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear() : Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    // 7.Quiz: Practice Time - Constants
    // 7.2
    fun canBorrow(numOfBooks: Int): Boolean {
        return (numOfBooks < MAX_NUM_BOOKS)
    }

    // 7.3
    fun printUrl() {
        val url = Constants.BASE_URL + title + ".html"
        println(url)
    }

    // 7.4
    companion object {
        const val BASE_URL = "https://www.book.com"

        // Solution
//        val BASE_URL = "http://www.turtlecare.net"
    }
}

fun test() {
    val book =  Book("X", "Y", 2019, 250)
    val (title, author, year) =book.getTitleAuthorYear()
    println("Here is your book $title written by $author in $year.")

    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()
    println ("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}.")
    println("Here is your book ${bookTitleAuthorYear.first}" +
            " written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}.")
}

// 7.3.
object Constants {
    const val BASE_URL = "https://www.book.com"
}

// 7.1.
const val MAX_NUM_BOOKS = 5

// 9.2
fun Book.weight() : Double = pages * 1.5

// 9.3
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages= 0