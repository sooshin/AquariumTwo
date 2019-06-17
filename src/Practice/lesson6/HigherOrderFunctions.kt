package Practice.lesson6

// 5. Quiz: Practice Time - Higher-Order Functions

fun main(args:Array<String>) {
    val numbers = listOf<Int> (1,2,3,4,5,6,7,8,9,0)
    println(numbers.divisibleBy { it %3 })

    println(numbers.divisibleBy { it.rem(3) })
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>();
    for (element in this) {
        if (block(element) == 0) result.add(element)
    }
    return result
}

