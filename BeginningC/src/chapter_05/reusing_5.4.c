/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 5.4
 * Reusing the numbers stored
 */

#include <ctype.h>
#include <stdio.h>

int main(void) {
    int grades[10];           // Array storing 10 values
    unsigned int count = 10;  // Number of values to be read
    long sum = 0L;            // Sum of the numbers
    float average = 0.0f;     // Average of the numbers

    printf("\nEnter the 10 grades: \n");  // Prompt for the input

    // Read the ten numbers to be averaged
    for (unsigned int i = 0; i < count; ++i) {
        printf("%2u> ", i + 1);
        scanf("%d", &grades[i]);  // Read a grade
        sum += grades[i];
    }

    average = (float)sum / count;  // Calculate the average

    // List the grade
    for (unsigned int i = 0; i < count; ++i) {
        printf("\nGrade Number %2u is %3d", i + 1, grades[i]);
    }

    printf("\nAverage of the ten grades entered is: %.2f\n", average);

    return 0;
}

/*
output:

Enter the 10 grades:
 1> 77
 2> 87
 3> 65
 4> 98
 5> 52
 6> 74
 7> 82
 8> 88
 9> 91
10> 71

Grade Number  1 is  77
Grade Number  2 is  87
Grade Number  3 is  65
Grade Number  4 is  98
Grade Number  5 is  52
Grade Number  6 is  74
Grade Number  7 is  82
Grade Number  8 is  88
Grade Number  9 is  91
Grade Number 10 is  71
Average of the ten grades entered is: 78.50

*/