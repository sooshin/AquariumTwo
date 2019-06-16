package Aquarium6

// Lesson 6. Functional Manipulation
// 4. Higher-Order Functions

data class Fish (var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    myWith (fish.name) {
        println(capitalize()) // Splashy
    }

    // run returns the result of the block function
    println(fish.run {name}) // splashy

    // apply returns the object it's applied to
    println(fish.apply {  }) // Fish(name=splashy)

    val fish2 = Fish(name = "splashy").apply{name = "Sharky"}
    println(fish2.name) // Sharky

    println(fish.let{it.name.capitalize()}
                .let{it + "fish"}
                .let{it.length}
                .let{it + 31}) // 42
}

fun myWith(name: String, block: String.() -> Unit) {

    name.block()
}

