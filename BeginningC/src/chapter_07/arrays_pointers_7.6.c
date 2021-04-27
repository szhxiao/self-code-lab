/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.6
 * Incrementing a pointer to an array of integers
 */

#include <stdio.h>

int main(void) {
    long multiple[] = {15L, 25L, 35L, 45L};
    long* p = multiple;

    for (int i = 0; i < sizeof(multiple) / sizeof(multiple[0]); ++i) {
        printf("address p+%d (&multiple[%d]): %llu *(p+%d) value: %ld\n", i, i,
               (unsigned long long)(p + i), i, *(p + i));
    }
    printf("\nType long occupies: %d bytes\n", (int)sizeof(long));

    return 0;
}

/*
output:
address p+0 (&multiple[0]): 140735455242752 *(p+0) value: 15
address p+1 (&multiple[1]): 140735455242760 *(p+1) value: 25
address p+2 (&multiple[2]): 140735455242768 *(p+2) value: 35
address p+3 (&multiple[3]): 140735455242776 *(p+3) value: 45

Type long occupies: 8 bytes
*/