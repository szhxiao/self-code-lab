/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.7
 * Two-dimensional arrays and pointers
 */

#include <stdio.h>

int main(void) {
    char board[3][3] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    // Display address
    printf("address of board      : %p\n", board);
    printf("address of board[0][0]: %p\n", &board[0][0]);
    printf("value of board[0]     : %p\n", board[0]);

    // Display value
    printf("\n");
    printf("value of board[0][0]  : %c\n", board[0][0]);
    printf("value of *board[0]    : %c\n", *board[0]);
    printf("value of **board      : %c\n", **board);

    return 0;
}

/*
output:
address of board      : 0x7ffe0ceec5df
address of board[0][0]: 0x7ffe0ceec5df
value of board[0]     : 0x7ffe0ceec5df

value of board[0][0]  : 1
value of *board[0]    : 1
value of **board      : 1
*/