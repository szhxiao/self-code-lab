/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.4
 * Static automatic variables
 */

#include <stdio.h>

// Function prototypes
void test1(void);
void test2(void);

int main(void) {
    for (int i = 0; i < 5; ++i) {
        test1();
        test2();
    }

    return 0;
}

/**
 * Function with an automatic variable
 */
void test1(void) {
    int count = 0;
    printf("test1 count = %d\n", ++count);
}

/**
 * Function with a static variable
 */
void test2(void) {
    static int count = 0;
    printf("test2 count = %d\n", ++count);
}

/*
output:
test1 count = 1
test2 count = 1
test1 count = 1
test2 count = 2
test1 count = 1
test2 count = 3
test1 count = 1
test2 count = 4
test1 count = 1
test2 count = 5
*/