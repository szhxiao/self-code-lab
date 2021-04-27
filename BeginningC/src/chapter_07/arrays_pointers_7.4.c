/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.4
 * Arrays and pointers
 */

#include <stdio.h>

int main(void) {
    char multiple[] = "My string";

    char* p = &multiple[0];
    printf("The address of the first array element: %p\n", p);

    p = multiple;
    printf("The address obtained from the array name: %p\n", multiple);

    return 0;
}

/*
output:
The address of the first array element: 0x7fff87b2188e
The address obtained from the array name: 0x7fff87b2188e
*/