/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.6
 * The almost indefinite loop-computing an average
 */

#include <ctype.h>
#include <stdio.h>

int main(void) {
    char answer = 'N';
    double total = 0.0;
    double value = 0.0;
    unsigned int count = 0;

    printf("\nThis program calculates the average of any number of values.");

    for (;;) {
        printf("\nEnter a value: ");  // Prompt for the next value
        scanf("%lf", &value);         // Read the next value
        total += value;               // Add value to total
        ++count;                      // Increment count of values

        // Check for more input
        printf("Do you want to enter another value ? (Y or N): ");
        scanf("%c", &answer);
        if (tolower(answer) == 'n') {
            break;
        }
    }

    // Output the average to 2 decimal places
    printf("\nThe average is %.2f\n", total / count);

    return 0;
}

/*
output:

*/