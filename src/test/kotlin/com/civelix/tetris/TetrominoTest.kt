package com.civelix.tetris

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TetrominoTest {

    @Test
    fun initialTetromino_getDimension() {
        assertEquals(4, Tetromino.I.width)
        assertEquals(1, Tetromino.I.height)

        assertEquals(2, Tetromino.O.width)
        assertEquals(2, Tetromino.O.height)

        assertEquals(2, Tetromino.L.width)
        assertEquals(3, Tetromino.L.height)

        assertEquals(3, Tetromino.T.width)
        assertEquals(2, Tetromino.T.height)

        assertEquals(3, Tetromino.S.width)
        assertEquals(2, Tetromino.S.height)

        assertEquals(2, Tetromino.J.width)
        assertEquals(3, Tetromino.J.height)

        assertEquals(3, Tetromino.Z.width)
        assertEquals(2, Tetromino.Z.height)
    }

    @Test
    fun rotateRight_O() {
        assertEquals(Tetromino.O, Tetromino.O.rotateRight())

        assertEquals(2,Tetromino.O.rotateRight().width)
    }
    @Test
    fun rotateRight_J() {
        var rotatedPiece = Tetromino.J
        for(i in 0 until 3) {
            rotatedPiece = rotatedPiece.rotateRight()
            assertNotEquals(Tetromino.J, rotatedPiece)
        }
        assertEquals(Tetromino.J, rotatedPiece.rotateRight())

        assertEquals(3,Tetromino.J.rotateRight().width)
        assertEquals(2,Tetromino.J.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(2, booleanArrayOf(true, true, true,
            false, false, true))
        assertEquals(expectedTetromino, Tetromino.J.rotateRight())
    }

    @Test
    fun rotateRight_I() {
            assertNotEquals(Tetromino.I, Tetromino.I.rotateRight())
        assertEquals(Tetromino.I, Tetromino.I.rotateRight().rotateRight())

        assertEquals(1,Tetromino.I.rotateRight().width)
        assertEquals(4,Tetromino.I.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(1, booleanArrayOf(true, true, true, true,))
        assertEquals(expectedTetromino, Tetromino.I.rotateRight())
    }

    @Test
    fun rotateRight_L() {
        var rotatedPiece = Tetromino.L
        for(i in 0 until 3) {
            rotatedPiece = rotatedPiece.rotateRight()
            assertNotEquals(Tetromino.L, rotatedPiece)
        }
        assertEquals(Tetromino.L, rotatedPiece.rotateRight())

        assertEquals(3,Tetromino.L.rotateRight().width)
        assertEquals(2,Tetromino.L.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(2, booleanArrayOf(true, true, true,
                                                                   true, false, false))
        assertEquals(expectedTetromino, Tetromino.L.rotateRight())
    }
    @Test
    fun rotateRight_T() {
        var rotatedPiece = Tetromino.T
        for(i in 0 until 3) {
            rotatedPiece = rotatedPiece.rotateRight()
            assertNotEquals(Tetromino.T, rotatedPiece)
        }
        assertEquals(Tetromino.T, rotatedPiece.rotateRight())

        assertEquals(2,Tetromino.T.rotateRight().width)
        assertEquals(3,Tetromino.T.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(2, booleanArrayOf(false, true,
                                                                  true, true,
                                                                  false, true))
        assertEquals(expectedTetromino, Tetromino.T.rotateRight())
    }
    @Test
    fun rotateRight_S() {
        // Only needs to rotate once before returning to original position.
        assertNotEquals(Tetromino.S, Tetromino.S.rotateRight())
        assertEquals(Tetromino.S, Tetromino.S.rotateRight().rotateRight())

        assertEquals(2,Tetromino.S.rotateRight().width)
        assertEquals(3,Tetromino.S.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(2, booleanArrayOf(true, false,
            true, true,
            false, true))
        assertEquals(expectedTetromino, Tetromino.S.rotateRight())
    }

    @Test
    fun rotateRight_Z() {
        // Only needs to rotate once before returning to original position.
        assertNotEquals(Tetromino.Z, Tetromino.Z.rotateRight())
        assertEquals(Tetromino.Z, Tetromino.Z.rotateRight().rotateRight())

        assertEquals(2,Tetromino.Z.rotateRight().width)
        assertEquals(3,Tetromino.Z.rotateRight().rotateRight().width)

        val expectedTetromino = Tetromino(2, booleanArrayOf(false, true,
            true, true,
            true, false))
        assertEquals(expectedTetromino, Tetromino.Z.rotateRight())
    }

    @Test
    fun rotateLeft() {
        // TODOLL same idea as rotateRight()
    }
}