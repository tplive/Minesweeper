fun main(args: Array<String>) {
    val input = readln().toInt()

    val result = when (input) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> "kukk"

    }
    if (result != "kukk")
        println("You have chosen a $result")
    else
        println("There is no such shape!")
}