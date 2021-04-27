/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.3
 * Checking optional functions are defined or not
 */

#include <stdio.h>

int main(void) {
#if defined _STDC_LIB_EXT1
    printf("Optional functions are defined.\n");
#else
    printf("Optional functions are not defined.\n");
#endif

    return 0;
}

/*
output:
The character
*/