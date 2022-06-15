import kotlin.random.Random
const val MIN = 1
const val MAX = 6
fun throwD6(): Int {
    val numberOnTheDice = Random.nextInt(MIN, MAX + 1)
    return numberOnTheDice
}
