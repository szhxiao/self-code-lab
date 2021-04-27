/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.4
 * Reading hexadecimal and octal values
 */

#include <stdio.h>

int main(void) {
    int i = 0;
    int j = 0;
    int k = 0;
    int n = 0;

    printf("Enter three integer values: ");
    n = scanf(" %d %x %o", &i, &j, &k);

    printf("\nOutput:\n");
    printf("%d values read.\n", n);
    printf("i = %d j = %d k = %d\n", i, j, k);

    return 0;
}

/*
output:
Enter three integer values: 12 12 12

Output:
3 values read.
i = 12 j = 18 k = 10
*/