const val PENULTIMATE = 2
fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here   

    numbers.reverse()
    numbers.add(numbers.sum())
    numbers.reverse()
    numbers.removeAt(numbers.size - PENULTIMATE)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}
