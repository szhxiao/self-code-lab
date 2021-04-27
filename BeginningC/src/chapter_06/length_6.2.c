/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.2
 * Lengths of strings
 */

#include <stdio.h>

int main(void) {
    char str1[] = "To be or not to be";
    char str2[] = ", that is the question";

    unsigned int count = 0;  // Stores the string length
    while (str1[count] != '\0') {
        ++count;
    }
    printf("The length of the string \"%s\" is %d characters.\n", str1, count);

    count = 0;
    while (str2[count] != '\0') {
        ++count;
    }
    printf("The length of the string \"%s\" is %d characters.\n", str2, count);

    return 0;
}

/*
output:
The length of the string "To be or not to be" is 18 characters.
The length of the string ", that is the question" is 22 characters.
*/