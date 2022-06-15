fun main(args: Array<String>) {

    val actual = readln().toInt()
    val limit = readln()
    if (limit == "no limit") {
        checkSpeed(actual)
    } else {
        checkSpeed(actual, limit.toInt())
    }

}

fun checkSpeed(actual: Int, limit: Int = 60) {

    if (actual > limit) {
        println("Exceeds the limit by ${actual - limit} kilometers per hour")
    } else {
        println("Within the limit")
    }
}