fun main() {
    val kar: Char = readLine()!!.first()

    println((kar.isUpperCase() || (kar.isDigit() && kar.toInt() != 48)))

}
