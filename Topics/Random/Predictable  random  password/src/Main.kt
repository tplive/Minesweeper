import kotlin.random.Random

const val MIN = 33
const val MAX = 126
const val SIZE = 10
fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    val rand = Random(seed)
    repeat(SIZE) {
        randomPassword += rand.nextInt(MIN, MAX + 1).toChar()
    }
    return randomPassword
}
