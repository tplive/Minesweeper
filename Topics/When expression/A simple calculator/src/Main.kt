fun main() {

    val (s1, op, s2) = readln().split(" ")

    val l1 = s1.toLong()
    val l2 = s2.toLong()

    when (op) {
        "+", "plus" -> println(l1 + l2)
        "-", "minus" -> println(l1 - l2)
        "*", "multiply" -> println(l1 * l2)
        "/", "divide" ->
            if (l2 != 0L) {
                println(l1 / l2)
            } else {
                println("Division by 0!")
            }
        else -> println("Unknown operator")
    }
}