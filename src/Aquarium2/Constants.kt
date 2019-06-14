package Aquarium2

const val rocks = 3

val number = 5 // determined during program execution

const val num = 5 // determined at compile time

fun complexFunctionCall() {}

// For val, we can assign the return value from a function as its value
// because we can set it during execution
val result = complexFunctionCall()

const val CONSTANT = "top-level constant"

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClass {

    companion object {

            const val CONSTANT3 = "constant inside companion"
    }
}