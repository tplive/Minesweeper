
const val MAX = 30000
fun main() {

    //val list = mutableListOf(12, 36, 33, 49, 12, 36, 14, 16, 60, 10, 78, 44, 93)
    var result = 0
    val length = readLine()!!.toInt()

    repeat(length) {
        val element = readLine()!!.toInt()
            if (element % 4 == 0 && element > result) {
                result = element
        }
    }
    println(result)
}