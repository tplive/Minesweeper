fun main() {
    val r1a = readLine()!!.toInt()
    val r1b = readLine()!!.toInt()
    val r2a = readLine()!!.toInt()
    val r2b = readLine()!!.toInt()
    val test = readLine()!!.toInt()

    println(test in r1a..r1b && test in r2a..r2b)
}