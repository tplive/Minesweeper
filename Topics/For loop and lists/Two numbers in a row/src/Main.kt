fun main() {
    val list = mutableListOf<Int>()
    val n = readLine()!!.toInt()
    repeat(n) {
        list.add(readLine()!!.toInt())
    }
    val (p, m) = readLine()!!.split(" ")

    val listAsString = list.joinToString("")
    if (listAsString.contains(p + m) || listAsString.contains(m + p)) println("NO")
    else println("YES")

    list.indices
}