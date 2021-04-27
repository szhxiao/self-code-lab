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
    unsigned long long sum = 0LL;  // Stores the sum of the integers
    unsigned int count = 0;        // The number of integers to be summed
    unsigned int i = 1;            // Indexes through the integers

    // Read the number of integers to be summed
    printf("\nEnter the number of integers you want to sum: ");
    scanf(" %u", &count);

    // Sum integers from 1 to count
    while (i <= count) {
        sum += i++;
    }

    printf("\nTotal of the first %u numbers is %llu\n", count, sum);

    return 0;
}

/*
output:
Enter the number of integers you want to sum: 100

Total of the first 100 numbers is 5050
*/