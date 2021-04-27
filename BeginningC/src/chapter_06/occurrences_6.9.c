/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.9
 * Finding occurrences of one string in another
 */

#include <ctype.h>
#include <stdio.h>
#include <string.h>

#define TEXT_LEN 100   // Maximum input text length
#define SUBSTR_LEN 40  // Maximum substring length

int main(void) {
    char text[TEXT_LEN];         // Input buffer for string to be searched
    char substring[SUBSTR_LEN];  // Input buffer for string sought

    printf("Enter the string to be searched(less than %d characters): \n",
           TEXT_LEN);
    gets(text, TEXT_LEN);

    printf("\nEnter the string sought (less than %d characters):\n",
           SUBSTR_LEN);
    gets(substring, SUBSTR_LEN);

    printf("\nFirst string entered:\n%s\n", text);
    printf("Second string entered:\n%s\n", substring);

    // Covert both strings to uppercase.
    for (int i = 0; (text[i] = (char)toupper(text[i])) != '\0'; ++i) {
    }
    for (int i = 0; (substring[i] = (char)toupper(substring[i])) != '\0'; ++i) {
    }

    printf("The second string %s found in the first.\n",
           ((strstr(text, substring) == NULL) ? "was not" : "was"));

    return 0;
}

/*
output:
Enter the string to be searched(less than 100 characters):
Cry havoc, and let slip the dogs of war.

Enter the string sought (less than 40 characters):
The Dogs of War

First string entered:
Cry havoc, and let slip the dogs of war.
Second string entered:
The Dogs of War
The second string was found in the first.
*/