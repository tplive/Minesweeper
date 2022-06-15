import kotlin.math.pow

//fun main() {
//    println(f(0.5))
//}

fun f(x: Double): Double = when {
    x <= 0.0 -> f1(x)
    //x in 0.0..1.0 -> f2(x)
    x >= 1.0 -> f3(x)
    else -> f2(x)
}


// implement your functions here
fun f1(x: Double): Double = x.pow(2) + 1

fun f2(x: Double): Double = 1 / x.pow(2)

fun f3(x: Double): Double = x.pow(2) - 1