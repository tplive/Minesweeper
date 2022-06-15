const val F = 3
const val B = 5
fun main() {

    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()

    for (i in min..max) {
        when {
            i % F == 0 && i % B == 0 -> println("FizzBuzz")
            i % F == 0 -> println("Fizz")
            i % B == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}