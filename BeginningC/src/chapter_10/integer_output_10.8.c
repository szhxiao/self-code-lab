/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.8
 * Integer output variations
 */

#include <stdio.h>

int main(void) {
    int i = 15;
    int j = 345;
    int k = 4567;

    long long li = 56789LL;
    long long lj = 67891234567LL;
    long long lk = 23456789LL;

    printf("i = %d\tj = %d\tk = %d\t i = %6.3d\tj = %6.3d\tk = %6.3d\n", i, j,
           k, i, j, k);

    printf("i = %-d\tj = %-d\tk = %-d\t i = %-6.3d\tj = %-6.3d\tk = %-6.3d\n",
           i, j, k, i, j, k);

    printf("li = %d\tlj = %d\tlk = %d\n", li, lj, lk);

    printf("li = %lld\tlj = %lld\tlk = %lld\n", li, lj, lk);

    return 0;
}

/*
output:
i = 15  j = 345 k = 4567         i =    015     j =    345      k =   4567
i = 15  j = 345 k = 4567         i = 015        j = 345         k = 4567
li = 56789      lj = -828242169     lk = 23456789
li = 56789      lj = 67891234567        lk = 23456789
*/