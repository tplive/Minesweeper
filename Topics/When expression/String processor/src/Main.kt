fun main() {

    val a = readln()
    val b = readln()
    val c = readln()

    println(
        when (b) {
            "equals" -> a == c
            "plus" -> "$a$c"
            "endsWith" -> a.endsWith(c)
            else -> "Unknown operation"
        }
    )

}