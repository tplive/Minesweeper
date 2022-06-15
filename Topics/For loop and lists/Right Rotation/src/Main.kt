fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readLine()!!.toInt())
    }

    val r = readLine()!!.toInt()

    repeat(r % list.size) {
        list.add(0, list.removeLast())
    }

    println(list.joinToString(" "))
}