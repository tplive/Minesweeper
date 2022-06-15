fun main() {
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()

    if ((h2 <= h1 && h2 >= h3) || (h2 >= h1 && h2 <= h3)) {
        println(true)
    } else {
        println(false)
    }


}