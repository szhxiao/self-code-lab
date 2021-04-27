/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.3
 * Floating-Point input
 */

#include <stdio.h>

int main(void) {
    float fp1 = 0.0f;
    float fp2 = 0.0f;
    float fp3 = 0.0f;
    int value_count = 0;
    printf("Enter: 3.14.3.14E1.0314e+02\n");

    printf("Input:\n");
    value_count = scanf("%f %f %f", &fp1, &fp2, &fp3);

    printf("\nOutput:\n");
    printf("Number of value read = %d\n", value_count);
    printf("fp1 = %f fp2 = %f fp3 = %f\n", fp1, fp2, fp3);

    return 0;
}

/*
output:
Enter: 3.14.3.14E1.0314e+02
Input:
3.14.314E1.0314e+02

Output:
Number of value read = 3
fp1 = 3.140000 fp2 = 3.140000 fp3 = 3.140000
*/