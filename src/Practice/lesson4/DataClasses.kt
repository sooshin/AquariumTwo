package Practice.lesson4

// 12. Quiz: Practice Time
fun main(args: Array<String>) {
    printLabels()
}

fun printLabels() {
    val spiceContainer = SpiceContainer(Curry("curry", "mild"))
    println(spiceContainer.label)

    // 3. Create some containers with spices and print out their labels.
    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Orange Curry", "medium")),
        SpiceContainer(Curry("Red Curry", "spicy"))
    )

    for (e in spiceCabinet) println(e.label)
}

// 1. Create a simple data class, SpiceContainer, that holds one spice.
// 2. Give SpiceContainer a property, label, that is derived from the name of the spice.
data class SpiceContainer(var spice : Spice) {
    val label = spice .name
}