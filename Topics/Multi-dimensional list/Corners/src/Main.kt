fun main() {
    //Do not touch code below
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }

    println(inputList[0][0] + " " + inputList[0][inputList[0].size-1])

    println(inputList[inputList.size-1][0] + " " + inputList[inputList.size-1][inputList.size-1])
}