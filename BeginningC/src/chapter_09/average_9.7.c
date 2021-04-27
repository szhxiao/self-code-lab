/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 9.7
 * Calculating an average using variable argument lists
 */

#include <stdarg.h>
#include <stdio.h>

// Function prototype
double average(double v1, double v2, ...);

int main(void) {
    double v1 = 10.5;
    double v2 = 2.5;
    int num1 = 6;
    int num2 = 5;
    long num3 = 12L;
    long num4 = 20L;

    printf("Average = %.2lf\n", average(v1, 3.5, v2, 4.5, 0.0));
    printf("Average = %.2lf\n", average(1.0, 2.0, 0.0));
    printf("Average = %.2lf\n", average((double)num2, v2, (double)num1,
                                        (double)num4, (double)num3, 0.0));
    return 0;
}

/**
 * Function to calculate the average of two or more arguments
 */
double average(double v1, double v2, ...) {
    va_list parg;          // Pointer for variable argument list
    double sum = v1 + v2;  // Accumulate sum of the arguments
    double value = 0.0;    // Argument value
    int count = 2;         // Count of number of arguments

    va_start(parg, v2);
    while ((value = va_arg(parg, double)) != 0.0) {
        sum += value;
        ++count;
    }
    va_end(parg);

    return sum / count;
}

/*
output:
Average = 5.25
Average = 1.50
Average = 9.10
*/