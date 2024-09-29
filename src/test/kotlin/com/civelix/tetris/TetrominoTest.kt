package com.civelix.tetris

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TetrominoTest {

    @Test
    fun initialTetromino_getDimension() {
        assertEquals(4, Tetromino.I.width)
        assertEquals(1, Tetromino.I.height)

        assertEquals(2, Tetromino.J.width)
        assertEquals(3, Tetromino.J.height)

        // TODO: finish with other tetrominos.
    }

    @Test
    fun rotateRight() {
        // TODO: test with a couple of tetrominos (I, L, O, T, S) that
        // - when rotated the width, height, squares are as expected
        // - we are back to the original tetromino at after a number of rotations (that depends on the tetronino)
    }

    @Test
    fun rotateLeft() {
        // TODOLL same idea as rotateRight()
    }
}