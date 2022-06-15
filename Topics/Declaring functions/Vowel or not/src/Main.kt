// write your function here
fun isVowel(a: Char): Boolean {
    val vowels = "aeiouAEIOU"
    return vowels.contains(a)
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
