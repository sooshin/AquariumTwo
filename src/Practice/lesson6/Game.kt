package Practice.lesson6

// 3.Quiz: Practice Time - Lambdas Recap
enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        print("Game Over: ")
        println(path)
        path.clear()
        false}

//    val end = { path.add(Directions.END); println("Game Over: $path"); path.clear(); false }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(string:String?) {
        when {
            string.equals("n") -> move(north)
            string.equals("s") -> move(south)
            string.equals("e") -> move(east)
            string.equals("w") -> move(west)
            else -> move(end)
        }
    }
}

fun main(args:Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)

    while(true) {
        print("Enter a directions: n/s/e/w:")
        game.makeMove(readLine())
    }
}