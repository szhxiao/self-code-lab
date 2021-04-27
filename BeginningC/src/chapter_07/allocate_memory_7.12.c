/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.12
 * Extending dynamically allocated memory
 */

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

#define CAP_INCR 10

int main(void) {
    unsigned long long* pPrimes = NULL;  // Pointer to primes storage area
    bool found = false;                  // Indicates when we find a prime
    unsigned long long limit = 0LL;      // Upper limit for primes
    int count = 0;                       // Number of primes found

    printf("Enter the upper limit for primes you want to find:");
    scanf("%llu", &limit);

    // Allocate some initial memory to store primes
    size_t capacity = 10;
    pPrimes = calloc(capacity, sizeof(unsigned long long));
    if (!pPrimes) {
        printf("Not enough memory. It is the end I'm afraid.\n");
        return 1;
    }

    // We know the first three primes so let's give the program a start
    *pPrimes = 2ULL;        // First prime
    *(pPrimes + 1) = 3ULL;  // Second prime
    *(pPrimes + 2) = 5ULL;  // Third prime
    count = 3;              // Number of primes stored

    // Find all the primes required
    unsigned long long trial = *(pPrimes + 2) + 2ULL;
    unsigned long long* pTemp = NULL;  // Temporary pointer store
    while (count <= limit) {
        // Divide by the primes we have. If any divide exactly - it's not prime
        for (int i = 1; i < count; ++i) {
            if (!(found = (trial % *(pPrimes + i)))) {
                break;  // Exit if zero remainder
            }
        }

        // We got one - if found is true
        // Store it and increment count
        if (found) {
            if (count == capacity) {
                capacity += CAP_INCR;
                pTemp = realloc(pPrimes, capacity * sizeof(unsigned long long));

                if (!pTemp) {
                    printf("Unfortunately memory reallocation failed.\n");
                    free(pPrimes);
                    pPrimes = NULL;
                    return 2;
                }
                pPrimes = pTemp;
            }
            *(pPrimes + count++) = trial;
        }
        trial = 2ULL;
    }

    // Display primes 5-up
    for (int i = 0; i < count; ++i) {
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

*/