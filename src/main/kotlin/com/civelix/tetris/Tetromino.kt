package com.civelix.tetris

/**
 * Represents a <href link="https://en.wikipedia.org/wiki/Tetromino">tetromino</href>.
 * A Tetromino is represented by a boolean array and a width, describing a 2D array where a block is represented by a
 * true value.
 */
data class Tetromino(val width : Int, val squares : BooleanArray) {

    init {
        assert(width in 1..4) { "Invalid tetromino width: $width" }
        assert(squares.size % 2 == 0) { "Tetromino initializing array must have even numbers of elements." }
        assert(squares.count { it } == 4) { "Tetromino must have exactly 4 squares." }
    }

    /**
     * The initial tetrominos.
     */
    companion object {
        val I = Tetromino(4, booleanArrayOf(true, true, true, true))

        val O = Tetromino(2, booleanArrayOf(true, true,
                                                  true, true))

        val T = Tetromino(3, booleanArrayOf(true, true, true,
                                                  false, true, false))

        val J = Tetromino(2, booleanArrayOf(false, true,
                                                  false, true,
                                                  true, true))

        val L = Tetromino(2, booleanArrayOf(true, false,
                                                  true, false,
                                                  true, true))

        val S = Tetromino(3, booleanArrayOf(false, true, true,
                                                  true, true, false))

        val Z = Tetromino(3, booleanArrayOf(true, true, false,
                                                  false, true, true))
    }

    val height : Int get() = squares.size / width

    fun rotateRight() : Tetromino {
        // TODO
        return this
    }

    fun rotateLeft() : Tetromino {
        // TODO
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tetromino

        if (width != other.width) return false
        if (!squares.contentEquals(other.squares)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = width
        result = 31 * result + squares.contentHashCode()
        return result
    }
}
