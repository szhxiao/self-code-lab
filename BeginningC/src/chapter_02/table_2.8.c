/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>

/**
 * Program 2.8 Calculations on a table
 */
int main(void) {
    float radius = 0.0F;                    // the radius of the table
    float diameter = 0.0F;                  // the diameter of the table
    float circumference = 0.0F;             // the circumference of the table
    float area = 0.0F;                      // the area of the table
    float Pi = 3.14159265F;

    printf("Input the diameter of the table: ");
    scanf("%f", &diameter);                 // read the diameter from the keyboard

    radius = diameter / 2.0F;               // calculate the radius
    circumference = 2.0F * Pi * radius;     // calculate the circumference
    area = Pi * radius * radius;            // calculate the area

    printf("\nThe circumference is %.2f", circumference);
    printf("\nThe area is %.2f\n", area);

    return 0;
}

/*
output:
Input the diameter of the table: 6

The circumference is 18.85
The area is 28.27
*/