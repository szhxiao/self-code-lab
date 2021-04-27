/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.1
 * List ten integers
 */

#include <stdio.h>

int main(void) {
    int count = 1;
    for (; count <= 10; ++count) {
        printf("%d  ", count);
    }

    printf("\nAfter the loop count has the value %d.\n", count);

    return 0;
}

/*
output:
1  2  3  4  5  6  7  8  9  10
After the loop count has the value 11.
*/