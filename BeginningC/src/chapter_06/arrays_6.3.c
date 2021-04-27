/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.3
 * Arrays of strings
 */

#include <stdio.h>

int main(void) {
    char str[][70] = {
        "Computers do what you tell them to do, not what you want them to do.",
        "When you put something in memory, remember where you put it.",
        "Never test for a condition you don't know what to do with.",
    };

    unsigned int count = 0;                                // Length of a string
    unsigned int strCount = sizeof(str) / sizeof(str[0]);  // Numbers of strings
    printf("There are %u strings.\n", strCount);

    // Find the length of the strings
    for (unsigned int i = 0; i < strCount; ++i) {
        count = 0;
        while (str[i][count]) {
            ++count;
        }

        printf("The string:\n   \"%s\" \ncontains %u characters.\n", str[i],
               count);
    }

    return 0;
}

/*
output:
There are 3 strings.
The string:
   "Computers do what you tell them to do, not what you want them to do."
contains 68 characters.
The string:
   "When you put something in memory, remember where you put it."
contains 60 characters.
The string:
   "Never test for a condition you don't know what to do with."
contains 58 characters.
*/