fun main() {

    val n = readLine()!!.toInt()
    val range = readLine()!!.toInt()..readLine()!!.toInt()

    println(n in range)
}