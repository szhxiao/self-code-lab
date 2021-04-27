/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.2
 * Drawing a box
 */

#include <stdio.h>

int main(void) {
    printf("\n**********");
    for (int count = 1; count <= 8; count++) {
        printf("\n*        *");
    }
    printf("\n**********\n");

    return 0;
}

/*
output:

**********
*        *
*        *
*        *
*        *
*        *
*        *
*        *
*        *
**********

*/