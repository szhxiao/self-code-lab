/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 5.6
 * Using the & operator
 */

#include <stdio.h>

int main(void) {
    // Define som integer variables
    long a = 1L;
    long b = 2L;
    long c = 3L;

    // Define som floating-point variables
    double d = 4.0;
    double e = 5.0;
    double f = 6.0;

    printf("A variable of type long occupies %lu bytes.", sizeof(long));
    printf("\nHere are the addresses of some variables of type long: ");
    printf("\nThe address of a is: %p", &a);
    printf("\nThe address of b is: %p", &b);
    printf("\nThe address of c is: %p", &c);

    printf("\n\nA variable of type double occupies %lu bytes.", sizeof(double));
    printf("\nHere are the addresses of some variables of type double:");
    printf("\nThe address of d is: %p ", &d);
    printf("\nThe address of e is: %p", &e);
    printf("\nThe address of f is: %p\n", &f);

    return 0;
}

/*
output:
A variable of type long occupies 8 bytes.
Here are the addresses of some variables of type long:
The address of a is: 0x7ffccb43fda8
The address of b is: 0x7ffccb43fdb0
The address of c is: 0x7ffccb43fdb8

A variable of type double occupies 8 bytes.
Here are the addresses of some variables of type double:
The address of d is: 0x7ffccb43fdc0
The address of e is: 0x7ffccb43fdc8
The address of f is: 0x7ffccb43fdd0
*/