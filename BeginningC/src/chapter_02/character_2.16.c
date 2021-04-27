/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.16 Using type char
 */
int main(void) {
    char first = 'A';
    char second = 'B';
    char last = 'Z';

    char number = 40;

    char ex1 = first + 2;
    char ex2 = second - 1;
    char ex3 = last + 2;

    printf("Character values %-5c%-5c%-5c\n", ex1, ex2, ex3);
    printf("Numerical equivalents %-5d%-5d%-5d\n", ex1, ex2, ex3);
    printf("The number %d is the code for the character %c\n", number, number);

    return 0;
}

/*
output:
Character values C    A    \
Numerical equivalents 67   65   92
The number 40 is the code for the character (
*/