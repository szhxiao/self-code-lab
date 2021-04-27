/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.11
 * A Caculator
 */

#include <stdio.h>

int main(void) {
    double number1 = 0.0;  // First operand value a decimal number
    double number2 = 0.0;  // Second operand value a decimal number
    char operation = 0;    // Operation - must be +, -, *, /, %

    printf("\nEnter the calculation\n");
    scanf("%lf %c %lf", &number1, &operation, &number2);

    switch (operation) {
        case '+':
            printf(" = %lf\n", number1 + number2);
            break;

        case '-':
            printf(" = %lf\n", number1 - number2);
            break;

        case '*':
            printf(" = %lf\n", number1 * number2);
            break;

        case '/':
            if ((long)number2 == 0) {
                printf("\nDivision by zero error!\n");
            } else {
                printf(" = %lf\n", number1 / number2);
            }
            break;

        case '%':
            if ((long)number2 == 0) {
                printf("\nDivision by zero error!\n");
            } else {
                printf(" = %ld\n", (long)number1 / (long)number2);
            }
            break;

        default:
            printf("\nIllegal operation!\n");
            break;
    }

    return 0;
}

/*
output:

*/