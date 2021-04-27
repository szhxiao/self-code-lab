/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 8.2
 * More scope in this example
 */

#include <stdio.h>

int main(void) {
    int count = 0;  // Declared in outer block
    do {
        int count = 0;  // This is another variable called count
        ++count;        // this applies to inner count
        printf("count = %d\n", count);
    } while (++count <= 5);  // This works with outer count
    printf("count = %d\n", count);

    return 0;
}

/*
output:
count = 1
count = 1
count = 1
count = 1
count = 1
count = 1
count = 6
*/