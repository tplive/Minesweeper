enum class Rainbow() {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun findByName(name: String) {
            for (enum in values()) {
                if (name == enum.name) {
                    println(enum.ordinal + 1)
                }
            }
        }
    }
}

fun main() {
    val color = readLine()!!.uppercase()

    Rainbow.findByName(color)
}
