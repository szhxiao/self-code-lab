/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 7.1
 * A simple program using pointers
 */

#include <stdio.h>

int main(void) {
    int number = 0;       // A variable of type int initialized to 0
    int* pnumber = NULL;  // A pointer that can point to type int

    number = 10;
    // Output the address
    printf("number's address: %p\n", &number);
    // Output the value
    printf("number's value: %d\n\n", number);

    // Store the address of number in pnumber
    pnumber = &number;

    // Output the address
    printf("pnumber's address: %p\n", (void*)&pnumber);
    // Output the size
    printf("pnumber's size: %zd bytes\n", sizeof(pnumber));
    // Output the value (an address)
    printf("pnumbe's value: %p\n", pnumber);
    // Value at the address
    printf("value pointed to: %d\n", *pnumber);

    return 0;
}

/*
output:
number's address: 0x7ffc176a8e4c
number's value: 10

pnumber's address: 0x7ffc176a8e50
pnumber's size: 8 bytes
pnumbe's value: 0x7ffc176a8e4c
value pointed to: 10
*/