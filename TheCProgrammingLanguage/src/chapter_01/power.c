/**
 * The C Programming Language
 * 
 * version: 2nd
 * author: Brian W.Kernighan
 *         Dennis M.Ritchie
 */

#include <stdio.h>

int power(int m, int n);

int main() {
    for(int i = 0; i < 10; i++) {
        printf("%d\t%d\t%d\n", i, power(2, i), power(-3, i));
    }

    return 0;
}

int power(int base, int n) {
    int p = 1;

    for(int i = 1; i <= n; i++) {
        p = p * base;
    }
    return p;
}

/*
output:
0	1	1
1	2	-3
2	4	9
3	8	-27
4	16	81
5	32	-243
6	64	729
7	128	-2187
8	256	6561
9	512	-19683
*/