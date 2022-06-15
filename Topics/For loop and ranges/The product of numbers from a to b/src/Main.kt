fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    var product = 1L
    for (x in a until b) {
        product *= x
    }
    println(product)

}