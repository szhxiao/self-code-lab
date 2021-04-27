/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.5
 * Testing letters an easier way
 */

#include <stdio.h>

int main(void) {
    char letter = 0;

    printf("Enter an uppercase letter: ");
    scanf("%c", &letter);

    if ((letter >= 'A') && (letter <= 'Z')) {
        letter += 'a' - 'A';
        printf("You entered an uppercase %c.\n", letter);
    } else {
        printf("You did not enter an uppercase letter.\n");
    }

    return 0;
}

/*
output:
Enter an uppercase letter: T
You entered an uppercase t.

Enter an uppercase letter: s
You did not enter an uppercase letter.
*/