package Aquarium

class MyIntList {
    fun get(pos: Int): Int {return 0}
    fun addItem(item: Int) {}
}

class MyShortList {
    fun get(pos: Int): Short {return 0}
    fun addItem(item: Short) {}
}

class MyList<T> {

    fun get(pos:Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}

fun workWithMyList() {

    val stringList: MyList<String>
    val fishList: MyList<Fish>
}