/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 3.1
 * A simple example of the if statement
 */
int main(void) {
    int number = 0;
    printf("\nEnter an integer between 1 and 10: ");
    scanf("%d", &number);

    if (number > 5) {
        printf("You entered %d which is greater than 5\n", number);
    }

    if (number < 6) {
        printf("You entered %d which is less than 6\n", number);
    }

    return 0;
}

/*
output:

*/