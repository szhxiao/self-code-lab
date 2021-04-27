/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.2
 * What's the pointer of it all
 */

#include <stdio.h>

int main(void) {
    long num1 = 0L;
    long num2 = 0L;
    long* pnum = NULL;

    pnum = &num1;  // Get address of num1
    *pnum = 2L;    // Set num1 to 2
    ++num2;
    num2 += *pnum;  // Add num1 to num2

    pnum = &num2;  // Get address of num2
    ++*pnum;       // Increment num2 indirectly

    printf("num1 = %ld  num2 = %ld\n*pnum = %ld  *pnum + num2 = %ld\n", num1,
           num2, *pnum, *pnum + num2);

    return 0;
}

/*
output:
num1 = 2  num2 = 4
*pnum = 4  *pnum + num2 = 8
*/