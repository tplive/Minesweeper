import kotlin.math.pow

fun main() {
    val operation = readln()
    val value = readln()!!.toInt()
    val final = when (operation) {
        "amount" -> compoundInterest(amount = value.toDouble())
        "percent" -> compoundInterest(percent = value.toDouble())
        "years" -> compoundInterest(years = value)
        else -> compoundInterest()
    }

    println(final)
}

fun compoundInterest(amount: Double = 1000.0, percent: Double = 5.0, years: Int = 10): Int {

    return (amount * (1 + percent/100).pow(years)).toInt()
}