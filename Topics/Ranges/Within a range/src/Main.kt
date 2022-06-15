fun main() {
    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
    val range2 = readLine()!!.toInt()..readLine()!!.toInt()
    val n = readLine()!!.toInt()

    println(n in range1 || n in range2)

}