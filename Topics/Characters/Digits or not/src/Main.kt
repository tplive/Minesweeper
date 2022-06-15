fun main() {

    repeat(4) {
        val inp: Char = readLine()!!.first()

        println(inp.isDigit())
    }
}