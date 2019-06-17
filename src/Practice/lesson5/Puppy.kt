package Practice.lesson5

import java.util.*

fun main(args: Array<String>){
    play()
}

// 9.4
class Puppy {
    fun playWithBook(book: Book) {
        val randomNumber = Random().nextInt(100)
        book.tornPages(randomNumber)
    }
}

// 9.5
fun play() {
    val puppy = Puppy()
    val book = Book("Old man and the sea",
        "Hemingway", 1952, 300)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}.")
    }

    println("Sad puppy, no more pages in ${book.title}.")
}

