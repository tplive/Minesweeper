package minesweeper

import minesweeper.Minesweeper.Companion.GRID_COLS
import minesweeper.Minesweeper.Companion.GRID_ROWS
import minesweeper.Minesweeper.Companion.MINE
import minesweeper.Minesweeper.Companion.board
import minesweeper.Minesweeper.Companion.mines
import minesweeper.Minesweeper.Companion.placedMines
import kotlin.random.Random

fun main() {

    val game = Minesweeper()
    game.start()
}

class Minesweeper {

    companion object {

        const val GRID_COLS = 9
        const val GRID_ROWS = 9
        const val MINE = 'X'
        const val EMPTY = '.'
        const val MARKED = '*'

        val board = List(GRID_ROWS) { MutableList(GRID_COLS) { EMPTY } }
        val placedMines = List(GRID_ROWS) { MutableList(GRID_COLS) { 0 } }
        var mines = 0
    }

    fun start() {
        deployMines()
        createHintMap()
        hideMines()
        displayBoard()
    }

    private fun hideMines() {
        board.forEachIndexed { rowIdx, row ->
            row.forEachIndexed { colIdx, col ->
                if (isMine(col)) board[rowIdx][colIdx] = EMPTY
            }
        }
    }

    private fun createHintMap() {
        board.forEachIndexed { rowIdx, row ->
            row.forEachIndexed { colIdx, col ->
                if (!isMine(col)) board[rowIdx][colIdx] = setHints(rowIdx, colIdx)
            }
        }
    }

    private fun setHints(row: Int, col: Int): Char {
        val positions = arrayOf(
            row - 1 to col - 1, row - 1 to col, row - 1 to col + 1, // Up Left, Up, Up Right
            row to col - 1, row to col + 1, // Left, Right
            row + 1 to col - 1, row + 1 to col, row + 1 to col + 1 // Down Left, Down, Down Right
        )

        var count = 0
        positions.forEach { (row, col) ->
            try {
                if (isMine(board[row][col])) count++
            } catch (e: IndexOutOfBoundsException) {
            }
        }
        return if (count > 0) count.digitToChar() else EMPTY
    }

    private fun isMine(check: Char) = check == MINE
    private fun isMarked(check: Char) = check == MARKED
    private fun isEmpty(check: Char) = check == EMPTY
}

private fun displayBoard() {
    println()
    println(" |123456789|")
    println("-|---------|")
    board.forEachIndexed { k, v ->
        println("${k + 1}|${v.joinToString("")}|")
    }
    println("-|---------|")
}

fun deployMines() {
    print("How many mines do you want on the field? ")
    mines = readLine()!!.toInt()
    var placed = 0
    do {
        val row = Random.nextInt(0, GRID_ROWS - 1)
        val col = Random.nextInt(0, GRID_COLS - 1)
        if (board[row][col] != MINE) {
            board[row][col] = MINE
            placedMines[row][col]
            placed++
        }
    } while (placed < mines)
}

/**
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
 **/