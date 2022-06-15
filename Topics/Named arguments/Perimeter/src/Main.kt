import kotlin.math.abs
import kotlin.math.hypot

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x1,
    y4: Double = y1,
): Double {
    val ab = hypot(abs(x1 - x2), abs(y1 - y2))
    val bc = hypot(abs(x2 - x3), abs(y2 - y3))
    val cd = hypot(abs(x3 - x4), abs(y3 - y4))
    val da = hypot(abs(x4 - x1), abs(y4 - y1))
    return  ab + bc + cd + da
}