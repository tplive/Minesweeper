package minesweeper

import java.lang.System.currentTimeMillis
import kotlin.random.Random

const val FIELD = 9 // The side of the square
const val MINE = "💣"
const val EMPTY = "."
const val MARKED = "*"

private fun insertDigitGrouping(input: String): String {
    var counter = 0
    var output = ""
    for (character in input.reversed()) {
        counter++
        output += character
        if (counter % 3 == 0) {
            output += " "
        }
    }
    return output.reversed()
}

fun main() {

    //print("How many mines do you want on the field? ")
    val mines = 9 // readLine()!!.toInt()
    val characters = readLine()!!

    println(insertDigitGrouping(characters))

    val list = mutableListOf<MutableList<String>>()
    repeat(FIELD) {
        val row = mutableListOf<String>()
        repeat(FIELD) {
            row.add(EMPTY)
        }
        list.add(row)
    }

    val listWithMines = placeMines(list, mines)
    val calculateMines = calculateMinesNearby(listWithMines)

    for (l in calculateMines)
        println(l.joinToString(""))

}

fun placeMines(list: MutableList<MutableList<String>>, mines: Int): MutableList<MutableList<String>> {
    var input = mines
    val rnd = Random(currentTimeMillis())
    while (input > 0) {
        val x = rnd.nextInt(FIELD)
        val y = rnd.nextInt(FIELD)
        if (list[x][y] != MINE) {
            list[x][y] = MINE
            input--
        }
    }
    return list
}

fun calculateMinesNearby(list: MutableList<MutableList<String>>): MutableList<MutableList<String>> {
    var x = 0
    var y = 0
    var mines = 0

    while (y < FIELD) {
        x = 0
        while (x < FIELD) {
            if (list[x][y] != MINE) {
                if (y > 0 && isMine(list[x][y-1])) mines++ // up
                if (y > 0 && x < FIELD-1 && isMine(list[x+1][y-1])) mines++ // up right
                if (x < FIELD-1 && isMine(list[x + 1][y])) mines++ // right
                if (x < FIELD-1 && y < FIELD-1 && isMine(list[x + 1][y + 1])) mines++ // down right
                if (y < FIELD-1 && isMine(list[x][y+1])) mines++ // down
                if (x > 0 && y < FIELD-1 && isMine(list[x-1][y+1])) mines++ // down left
                if (x > 0 && isMine(list[x-1][y])) mines++ // left
                if (x > 0 && y > 0 && isMine(list[x-1][y-1])) mines++ // up left

                if (mines > 0) {
                    list[x][y] = emojify(mines.toString())
                    mines = 0
                } else {
                    list[x][y] = emojify(".")
                }
            }
            x++
        }
        y++
    }
    return list
}

fun isMine(field: String): Boolean {
    return field == MINE
}

fun emojify(input: String): String {
    return when (input) {
        "." -> "🌫"
        "1" -> "1️⃣"
        "2" -> "2️⃣"
        "3" -> "3️⃣"
        "4" -> "4️⃣"
        "5" -> "5️⃣"
        "6" -> "6️⃣"
        "7" -> "7️⃣"
        "8" -> "8️⃣"
        "9" -> "9️⃣"
        else -> ""
    }
}
