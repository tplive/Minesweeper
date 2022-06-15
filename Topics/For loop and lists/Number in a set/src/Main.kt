fun main() {
    // write your code here
    val mutList = mutableListOf<Int>()
    val n = readLine()!!.toInt()
    repeat(n) {
        mutList.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()

    println(if (mutList.contains(m)) "YES" else "NO")
}