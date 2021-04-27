/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 5.7
 * Averaging a variable number of grades
 */

#include <stdio.h>

int main(void) {
    size_t nGrades = 0;  // Number of grades
    printf("Enter the number of grades: ");
    scanf("%zd", &nGrades);

    int grades[nGrades];   // Array storing nGrades values
    long sum = 0L;         // Sum of the numbers
    float average = 0.0f;  // Average of the numbers

    printf("\nEnter the %zd grades:\n", nGrades);  // Prompt for the input

    // Read the numbers to be averaged
    for (size_t i = 0; i < nGrades; ++i) {
        printf("%2zd> ", i + 1);
        scanf("%d", &grades[i]);  // Read a grade
        sum += grades[i];         // Add it to sum
    }
    printf("The grades you entered are:\n");
    for (size_t i = 0; i < nGrades; ++i) {
        printf("Grade[%2zd] = %3d\t", i + 1, grades[i]);

        // After 5 values go to a new line
        if ((i + 1) % 5 == 0) {
            printf("\n");
        }
    }

    average = (float)sum / nGrades;  // Calculate the average
    printf("\nAverage of the %zd grades entered is: %.2f\n", nGrades, average);

    return 0;
}

/*
output:

Enter the 12 grades:
 1> 56
 2> 67
 3> 78
 4> 67
 5> 68
 6> 56
 7> 88
 8> 98
 9> 76
10> 75
11> 87
12> 72
The grades you entered are:
Grade[ 1] =  56 Grade[ 2] =  67 Grade[ 3] =  78 Grade[ 4] =  67 Grade[ 5] =  68
Grade[ 6] =  56 Grade[ 7] =  88 Grade[ 8] =  98 Grade[ 9] =  76 Grade[10] =  75
Grade[11] =  87 Grade[12] =  72
Average of the 12 grades entered is: 74.006
*/