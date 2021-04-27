/**
 * Begining C
 * 
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

#include <stdio.h>
#define PI 3.14159F

/**
 * Program 2.9 More round tables
 */
int main(void) {
    float radius = 0.0F;                    // the radius of the table
    float diameter = 0.0F;                  // the diameter of the table
    float circumference = 0.0F;             // the circumference of the table
    float area = 0.0F;                      // the area of the table

    printf("Input the diameter of the table: ");
    scanf("%f", &diameter);                 // read the diameter from the keyboard

    radius = diameter / 2.0F;               // calculate the radius
    circumference = 2.0F * PI * radius;     // calculate the circumference
    area = PI * radius * radius;            // calculate the area

    printf("\nThe circumference is %.2f", circumference);
    printf("\nThe area is %.2f\n", area);

    return 0;
}

/*
output:
Input the diameter of the table: 8

The circumference is 25.13
The area is 50.27
*/