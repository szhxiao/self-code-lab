/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.11 Finding the limits
 */
int main(void) {
    printf("Variables of type char occupy %u bytes\n", sizeof(char));
    printf("Variables of type short occupy %u types\n", sizeof(short));
    printf("Variables of type int occupy %u types\n", sizeof(int));
    printf("Variables of type long occupy %u types\n", sizeof(long));
    printf("Variables of type long long occupy %u types\n", sizeof(long long));
    printf("Variables of type float occupy %u types\n", sizeof(float));
    printf("Variables of type double occupy %u types\n", sizeof(double));
    printf("Variables of type long double occupy %u types\n", sizeof(long double));

    return 0;
}

/*
output:
Variables of type char occupy 1 bytes
Variables of type short occupy 2 types
Variables of type int occupy 4 types
Variables of type long occupy 8 types
Variables of type long long occupy 8 types
Variables of type float occupy 4 types
Variables of type double occupy 8 types
Variables of type long double occupy 16 types
*/