package org.example.com.civelix.tetris

import com.civelix.tetris.Tetromino

/**
 * Based on the GameBoy version of Tetris, the grid is 10 x 17
 * Origin is at the left bottom corner.
 */
class Grid {

    enum class BlockType {
        EMPTY,
        BORDER,
        // The next values correspond to the tetromino type that filling that cell.
        I,
        O,
        T,
        J,
        L,
        S,
        Z
    }

    companion object {
        private const val WIDTH = 10
        private const val HEIGHT = 17
    }

    private val cells = Array<BlockType>(WIDTH * HEIGHT) { BlockType.EMPTY }


    fun getCell(x : Int, y : Int) : BlockType {
        return cells[x + y * WIDTH]
    }

    /**
     * Clears a row causing all blocks above to move down by one row.
     */
    fun clearRow(index : Int) {
        // TODO
    }

    fun insertTetromino(tetromino: Tetromino) {

    }
}