/*
 * File: Checkerboard.java
 * -----------------
 * This file contains an example solution to the checkerboard problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {

    /** Number of black and white squares on each side of the checkerboard. */
    private static final int NUM_SQUARES_PER_SIDE = 8;

    public void run() {
        int sideLength = getHeight()/NUM_SQUARES_PER_SIDE;
        for (int i = 0; i < NUM_SQUARES_PER_SIDE; i++) {
            if (i % 2 == 0) {
                drawRowStartWhite(i, NUM_SQUARES_PER_SIDE, sideLength);
            } else {
                drawRowStartBlack(i, NUM_SQUARES_PER_SIDE, sideLength);
            }
        }
    }

    public void drawBlackSquare(int x, int y, int sideLength) {
    /**
     * Draws a single black filled square onto the canvas
     * @param x: x coordinate of the square origin (upper left corner)
     * @param y: y coordinate of the square origin
     * @param sideLength: side length of the square
     */
        GRect blackSquare = new GRect(x, y, sideLength, sideLength);
        blackSquare.setFilled(true);
        blackSquare.setColor(Color.BLACK);
        add(blackSquare);

    }

    public void drawRowStartBlack(int row, int numSquares, int sideLength) {
    /**
     * Draws a checkerboard row, starting with a black square
     * @param row: Index of the row on the checkerboard, so we know what the y coordinate should be
     * @param numSquares: Number of checkerboard squares in the row
     * @param sideLength: side length of each square
     */
        for (int i = 0; i < numSquares/2; i++) {
            drawBlackSquare(2 * i * sideLength, row * sideLength, sideLength);
        }
    }


    public void drawRowStartWhite(int row, int numSquares, int sideLength) {
    /**
     * Draws a checkerboard row, starting with a white square
     * @param row: Index of the row on the checkerboard, so we know what the y coordinate should be
     * @param numSquares: Number of checkerboard squares in the row
     * @param sideLength: side length of each square
     */
        for (int i = 0; i < numSquares/2; i++) {
            drawBlackSquare((2 * i + 1) * sideLength, row * sideLength, sideLength);
        }
    }
}
