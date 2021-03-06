/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.prottonne.challenges;

public class HourGlass {
    public static void main(String[] args) {
        // array_name[row_index][column_index]
        int[][] inputArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int maxCount = Integer.MIN_VALUE;
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {

                if (inputArray[row][col] != 0 && inputArray[row + 2][col] != 0) {

                    int tempCount = inputArray[row][col];
                    tempCount += inputArray[row][col + 1];
                    tempCount += inputArray[row][col + 2];
                    tempCount += inputArray[row + 1][col + 1];
                    tempCount += inputArray[row + 2][col];
                    tempCount += inputArray[row + 2][col + 1];
                    tempCount += inputArray[row + 2][col + 2];
                    if (tempCount > maxCount) {
                        maxCount = tempCount;
                    }
                }
            }

        }
        System.out.println(maxCount);
    }
}
