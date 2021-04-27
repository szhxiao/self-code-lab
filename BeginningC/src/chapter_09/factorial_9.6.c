/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.6
 * Calculating factorials using recursion
 */

#include <stdio.h>

// Function prototypes
unsigned long long factorial(unsigned long long);

int main(void) {
    unsigned long long number = 0LL;
    printf("Enter an integer value: ");
    scanf("%llu", &number);
    printf("The factorial of %llu is %llu\n", number, factorial(number));

    return 0;
}

/**
 * A recursive factorial function
 */
unsigned long long factorial(unsigned long long n) {
    if (n < 2LL) {
        return n;
    }

    return n * factorial(n - 1LL);
}

/*
output:
Enter an integer value: 15
The factorial of 15 is 1307674368000
*/