/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.8
 * While programming and summing integers
 */

#include <stdio.h>

int main(void) {
    unsigned long sum = 0UL;  // Stores the sum of the integers
    unsigned int count = 0;   // The number of integers to be summed

    // Read the number of integers to be summed
    printf("\nEnter the number of integers you want to sum: ");
    scanf(" %u", &count);

    for (unsigned int i = 1; i <= count; i++) {
        sum = 0L;

        // Calculate sum of integers from 1 to i
        for (unsigned int j = 1; j <= i; j++) {
            sum += j;
        }

        printf("\n%u\t%5lu", i, sum);
    }
    printf("\n");

    return 0;
}

/*
output:
Enter the number of integers you want to sum: 5

1           1
2           3
3           6
4          10
5          15
*/