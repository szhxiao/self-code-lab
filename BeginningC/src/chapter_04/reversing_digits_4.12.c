/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.12
 * Reversing the digits
 */

#include <stdio.h>

int main(void) {
    unsigned int number = 0;  // The number to be reversed
    unsigned int rebmun = 0;  // The reversed number
    unsigned int temp = 0;    // Working storage

    // Read in the value to be reversed
    printf("\nEnter a positive integer: ");
    scanf(" %u", &number);

    temp = number;  // Copy to working storage

    // Reverse the number stored in temp
    do {
        rebmun = 10 * rebmun + temp % 10;
        temp = temp / 10;
    } while (temp);

    printf("\nThe number %u reversed is %u rebmun ehT\n", number, rebmun);

    return 0;
}

/*
output:
Enter a positive integer: 1234567

The number 1234567 reversed is 7654321 rebmun ehT
*/