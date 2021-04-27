/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.4
 * Coverting uppercase to lowercase
 */

#include <limits.h>
#include <stdio.h>

int main(void) {
    char letter = 0;

    printf("Enter an uppercase letter: ");
    scanf("%c", &letter);

    // Check whether the input is uppercase
    if (letter >= 'A') {
        if (letter <= 'Z') {
            // Covert from upper to lowercase
            letter = letter - 'A' + 'a';
            printf("You entered an uppercase %c\n", letter);
        } else {
            printf("Try using the shift key! I want a capital letter.\n");
        }
    }

    return 0;
}

/*
output:
Enter an uppercase letter: G
You entered an uppercase g

Enter an uppercase letter: s
Try using the shift key! I want a capital letter.
*/