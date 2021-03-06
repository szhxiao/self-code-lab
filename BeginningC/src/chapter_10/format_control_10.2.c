/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.2
 * Characters in the format control string
 */

#include <stdio.h>

int main(void) {
    int i = 0;
    int j = 0;
    int value_count = 0;
    float fp1 = 0.0F;
    printf("Enter: fp1 = 3.14159 i = 7 8\n");

    printf("\nInput:");
    value_count = scanf("fp1 = %f i = %d %d", &fp1, &i, &j);
    printf("\nOutput:\n");
    printf("Count of value read = %d\n", value_count);
    printf("fp1 = %f\ti = %d\tj = %d\n", fp1, i, j);
    return 0;
}

/*
output:
Enter: fp1 = 3.14159 i = 7 8

Input:fp1 = 3.14159 i = 7 8

Output:
Count of value read = 3
fp1 = 3.141590  i = 7   j = 8
*/