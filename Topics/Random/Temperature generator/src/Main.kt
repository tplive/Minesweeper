import kotlin.random.Random
const val REPS = 7
const val MIN = 20
const val MAX = 31
fun generateTemperature(seed: Int): String {
    val rnd = Random(seed)
    var temps = ""
    repeat(REPS) {
        temps += rnd.nextInt(MIN, MAX).toString()
        temps += " "
    }
    return temps
}
