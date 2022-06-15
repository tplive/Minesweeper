const val REPS = 4
fun main() {

    repeat(REPS) {
        val kar: Char = readLine()!!.first()
        println(kar - 1)
    }

}
