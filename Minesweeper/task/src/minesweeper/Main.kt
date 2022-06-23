package minesweeper

import java.lang.System.currentTimeMillis
import kotlin.random.Random

const val FIELD = 9 // The side of the square
const val MINE = "X"
const val EMPTY = "."
const val MARKED = "*"

fun main() {

    print("How many mines do you want on the field? ")
    val mines = readLine()!!.toInt()

    val grid = generateGrid()

    val listWithMines = placeMines(grid, mines)
    val calculateMines = calculateMinesNearby(listWithMines)

    for (l in calculateMines)
        println(l.joinToString(""))

}

fun generateGrid(): MutableList<MutableList<String>> {
    val list = mutableListOf<MutableList<String>>()
    repeat(FIELD) {
        val row = mutableListOf<String>()
        repeat(FIELD) {
            row.add(EMPTY)
        }
        list.add(row)
    }
    return list
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
    var x: Int
    var y: Int = 0
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
                    list[x][y] = mines.toString()
                    mines = 0
                } else {
                    list[x][y] = EMPTY
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
