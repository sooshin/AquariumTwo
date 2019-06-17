package Practice.lesson5

// 5. Quiz: Practice Time - Collections
fun main(args: Array<String>) {

    // 3. Use the collections function any() on library to see if any of the books are “Hamlet’
    println(library.any {it.key.contains("Hamlet")})

    // 3. Solution
    // println(library.any { it.value.contains("Hamlet") })

    // 5. Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
    moreBooks.getOrPut("King Lear") {"William Shakespeare"}

    // 5. Solution
    //moreBooks.getOrPut("Jungle Book") { "Kipling" }
    //moreBooks.getOrPut("Hamlet") { "Shakespeare" }

    println(moreBooks)
}

// 1. Create a Set of book titles called allBooks, for example, by William Shakespeare.
val allBooks: Set<String> = setOf("Romeo and Juliet", "A Midsummer Night's Dream", "Hamlet")

// 1. Solution
// val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")

// 2. Create a Map called library that associates the set of books, allBooks, to the author.
val library: Map<Set<String>, String> = mapOf(allBooks to "William Shakespeare")

// 2.Solution
// val library = mapOf("Shakespeare" to allBooks)

// 4. Create a MutableMap called moreBooks, and add one title/author to it.
val moreBooks: MutableMap<String, String> = mutableMapOf("Othello" to "William Shakespeare")

// 4. Solution
// val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")