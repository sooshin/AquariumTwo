package Practice.lesson4

class Spice1 (val name: String, val spiciness: String  = "mild") {
    // 3. Add a variable, heat, to your class, with a getter that
    // returns a numeric value for each type of spiciness.
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    // 5. Add a init block that prints out the values for the object after it has been created.
    init {
        println("Spice name is ${this.name}, spiciness level is ${this.spiciness}")
    }
}

// 4.Instead of the list of spices as Strings you used earlier,
// create a list of Spice objects and give each object a name and a spiciness level.
val spices1 = listOf(
    Spice1("curry", "mild"),
    Spice1("pepper", "medium"),
    Spice1("cayenne", "spicy"),
    Spice1("ginger", "mild"),
    Spice1("red curry", "medium"),
    Spice1("green curry", "mild"),
    Spice1("red pepper", "extremely spicy")
)

// 5. Create a spice
val spice = Spice1("cayenne", spiciness = "spicy")

// 6. Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
val spicelist = spices1.filter { it.heat < 5 }

// 7. Because salt is a very common spice, create a helper function called makeSalt().
fun makeSalt() = Spice1("salt")