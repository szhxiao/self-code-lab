/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.8
 * Getting values in a two-dimensional array
 */

#include <stdio.h>

int main(void) {
    char board[3][3] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    // List all elements of the array
    for (int i = 0; i < 9; ++i) {
        printf("board: %c\n", *(*board + i));
    }

    return 0;
}

/*
output:
board: 1
board: 2
board: 3
board: 4
board: 5
board: 6
board: 7
board: 8
board: 9
*/