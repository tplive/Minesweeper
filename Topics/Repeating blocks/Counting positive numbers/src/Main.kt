fun main() {
    val length = readLine()!!.toInt()
    var positives = 0
    repeat(length) {

        val input = readLine()!!.toInt()
        if (input > 0) {
            positives++
        }
    }

    println(positives)



}