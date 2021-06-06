package xo.board

import xo.utils.classes.C

data class Square(val index: Int, var mark: Char)

class Board() {
    private val squares: ArrayList<Square> = ArrayList()

    init {
        for (i in 0..8)
            squares.add(Square(i, C.squarePlaceHolder))
    }

    fun mark(index: Int, symbol: Char) {
        if (index < 0 || index > 8)
            throw Exception("$index is out of bounds. Index must be between 0 and 8.")

        if (!squares[index].mark.equals(C.squarePlaceHolder))
            throw Exception("Square already marked.")

        squares[index].mark = symbol
    }

    fun display() {
        println("\t${squares[0].mark}|${squares[1].mark}|${squares[2].mark}")
        println("\t-----")
        println("\t${squares[3].mark}|${squares[4].mark}|${squares[5].mark}")
        println("\t-----")
        println("\t${squares[6].mark}|${squares[7].mark}|${squares[8].mark}")
    }
}
