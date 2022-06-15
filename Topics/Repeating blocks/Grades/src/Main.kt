const val DEE = 2
const val CEE = 3
const val BEE = 4
const val AYE = 5

fun main() {

    val students = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(students) {
        val grade = readLine()!!.toInt()

        if (grade == DEE) {
            d++
        } else if (grade == CEE) {
            c++
        } else if (grade == BEE) {
            b++
        } else if (grade == AYE) {
            a++
        }
    }

    println("$d $c $b $a")
}