package Practice.lesson4

fun main(args: Array<String>) {
    buildSimpleSpice()
}

fun buildSimpleSpice() {
    val mySimpleSpice = SimpleSpice()

    println("Name: ${mySimpleSpice.name} " +
            "Heat: ${mySimpleSpice.heat}")
}

fun buildSpice() {
    val Spice = Spice1("red pepper", "hot")
}