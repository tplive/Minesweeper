// use this code as a source of inspiration for your function
fun getFullNames() {
    val firstName1 = readLine()
    val lastName1 = readLine()
    createFullName(firstName1, lastName1)

    val firstName2 = readLine()
    val lastName2 = readLine()
    createFullName(firstName2, lastName2)

    val firstName3 = readLine()
    val lastName3 = readLine()
    createFullName(firstName3, lastName3)
}

// implement your function here
fun createFullName(fn: String?, ln: String?): String = "$fn $ln"