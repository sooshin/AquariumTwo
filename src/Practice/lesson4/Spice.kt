package Practice.lesson4

// 10. Quiz: Practice Time
// Abstract and Interface
// Delegation
abstract class Spice (val name: String, val spiciness: String  = "mild", color: SpiceColor)  : SpiceColor by color {

    abstract fun prepareSpice()
}

class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor)
    : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {

    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color // 14.Quiz: Practice Time: change the type of color from String to the Color class
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW // 14.Quiz: Practice Time: Set the appropriate color in YellowSpiceColor
}