/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.3
 * Using nested ifs to analyze numbers
 */

#include <limits.h>
#include <stdio.h>

int main(void) {
    long test = 0L;

    printf("Enter an integer less than %ld: ", LONG_MAX);
    scanf("%ld", &test);

    // Test for odd or even by checking the remainer after dividing by 2
    if (test % 2L == 0L) {
        printf("The number %ld is even.", test);

        // Now check whether half the number is also even
        if ((test / 2L) % 2L == 0L) {
            printf("\nHalf of %ld is also even.", test);
            printf("\nThat's interesting isn't it?\n");
        }
    } else {
        printf("The number %ld is odd.\n", test);
    }

    return 0;
}

/*
output:
Enter an integer less than 9223372036854775807: 20
The number 20 is even.
Half of 20 is also even.
That's interesting isn't it?

Enter an integer less than 9223372036854775807: 999
The number 999 is odd.
*/