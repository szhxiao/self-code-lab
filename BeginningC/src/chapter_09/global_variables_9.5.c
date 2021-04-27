/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.5
 * Global variables
 */

#include <stdio.h>

// Declare a global variable
int count = 0;

// Function prototypes
void test1(void);
void test2(void);

int main(void) {
    int count = 0;
    for (; count < 5; ++count) {
        test1();
        test2();
    }

    return 0;
}

/**
 * Function using the global variable
 */
void test1(void) {
    printf("test1 count = %d\n", ++count);
}

/**
 * Function using a static variable
 */
void test2(void) {
    static int count = 0;
    printf("test2 count = %d\n", ++count);
}

/*
output:
test1 count = 1
test2 count = 1
test1 count = 2
test2 count = 2
test1 count = 3
test2 count = 3
test1 count = 4
test2 count = 4
test1 count = 5
test2 count = 5
*/