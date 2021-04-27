/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.10
 * Outputting floating-point value
 */

#include <stdio.h>

int main(void) {
    float fp1 = 345.678F;
    float fp2 = 1.234E6F;

    double fp3 = 234567898.0;
    double fp4 = 11.22334455e-6;

    printf("%f  %+f  %-10.4f  %6.4f\n", fp1, fp2, fp1, fp2);
    printf("%e  %+E\n", fp1, fp2);
    printf("%f  %g  %#+f  %8.4f  %10.4g\n", fp3, fp3, fp3, fp3, fp4);

    return 0;
}

/*
output:
345.678009  +1234000.000000  345.6780    1234000.0000
3.456780e+02  +1.234000E+06
234567898.000000  2.34568e+08  +234567898.000000  234567898.0000   1.122e-05
*/