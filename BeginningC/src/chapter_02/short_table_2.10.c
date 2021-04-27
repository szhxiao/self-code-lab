/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.10 Round tables again but shorter
 */
int main(void) {
    float radius = 0.0F;                    // the radius of the table
    float diameter = 0.0F;                  // the diameter of the table
    const float Pi = 3.14159F;

    printf("Input the diameter of the table: ");
    scanf("%f", &diameter);                 // read the diameter from the keyboard

    radius = diameter / 2.0F;               // calculate the radius

    printf("\nThe circumference is %.2f", 2.0F * Pi * radius);
    printf("\nThe area is %.2f\n", Pi * radius * radius);

    return 0;
}

/*
output:
Input the diameter of the table: 10

The circumference is 31.42
The area is 78.54
*/