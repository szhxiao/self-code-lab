/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.9
 * Testing case
 */

#include <stdio.h>

int main(void) {
    char answer = 0;  // Stores an input character

    printf("Enter Y or N: ");
    scanf("%c", &answer);

    switch (answer) {
        case 'y':
        case 'Y':
            printf("You responded in the affirmative.\n");
            break;

        case 'n':
        case 'N':
            printf("You responded in the negative.\n");
            break;

        default:
            printf("You did not respond correctly...\n");
            break;
    }

    return 0;
}

/*
output:
Enter Y or N: y
You responded in the affirmative.
*/