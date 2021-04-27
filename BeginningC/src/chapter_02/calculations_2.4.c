/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.4 Simple calculations
 */
int main(void) {
    int total_pets;
    int cats;
    int dogs;
    int ponies;
    int others;

    // set the number of each kind of pet
    cats = 2;
    dogs = 1;
    ponies = 1;
    others = 46;

    // calculate the total number of pets
    total_pets = cats + dogs + ponies + others;

    // output the result
    printf("We have %d pets in total.\n", total_pets);

    return 0;
}

/*
output:
We have 50 pets in total.
*/