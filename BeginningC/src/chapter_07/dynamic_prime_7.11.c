/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.11
 * A dynamic prime example
 */

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    unsigned long long* pPrimes = NULL;  // Pointer to primes storage area
    unsigned long long trial = 0;        // Integer to be tested
    bool found = false;                  // Indicates when we find a prime
    int total = 0;                       // Number of primes required
    int count = 0;                       // Number of primes found

    printf("How many primes would you like - you'll get at least 4? ");
    scanf("%d", &total);            // Total is how many we need to find
    total = total < 4 ? 4 : total;  // Make sure it is at least 4

    // Allocate sufficient memory to store the number of primes required
    pPrimes = (unsigned long long*)malloc(total * sizeof(unsigned long long));
    if (!pPrimes) {
        printf("Not enough memory. It is the end I'm afraid.\n");
        return 1;
    }

    // We know the first three primes so let's give the program a start
    *pPrimes = 2ULL;        // First prime
    *(pPrimes + 1) = 3ULL;  // Second prime
    *(pPrimes + 2) = 5ULL;  // Third prime
    count = 3;              // Number of primes stored
    trial = 5ULL;           // Set to the last prime we have

    // Find all the primes required
    while (count < total) {
        trial += 2ULL;  // Next value for checking

        // Divide by the primes we have. If any divide exactly - it's not prime
        for (int i = 1; i < count; ++i) {
            if (!(found = (trial % *(pPrimes + i)))) {
                break;  // Exit if zero remainder
            }
        }

        // We got one - if found is true
        // Store it and increment count
        if (found) {
            *(pPrimes + count++) = trial;
        }
    }

    // Display primes 5-up
    for (int i = 0; i < total; ++i) {
        printf("%12llu", *(pPrimes + i));
        if (!((i + 1) % 5)) {
            printf("\n");  // New line after every 5
        }
    }
    printf("\n");

    free(pPrimes);   // Release the heap memory...
    pPrimes = NULL;  // Reset the pointer

    return 0;
}

/*
output:
How many primes would you like - you'll get at least 4? 25
           2           3           5           7          11
          13          17          19          23          29
          31          37          41          43          47
          53          59          61          67          71
          73          79          83          89          97
*/