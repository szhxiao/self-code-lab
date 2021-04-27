/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.7
 * Testing characters in a string
 */

#include <ctype.h>
#include <stdio.h>
#include <string.h>

#define BUF_SIZE 100

int main(void) {
    char buf[BUF_SIZE];  // Input buffer
    int nLetters = 0;    // Number of letters in input
    int nDigits = 0;     // Number of digits in input
    int nPunct = 0;      // Number of punctuation characters

    printf("Enter an interesting string of less than %d characters:\n",
           BUF_SIZE);
    // Read a string into buffer
    if (!gets(buf, sizeof(buf))) {
        printf("Error reading string.\n");
        return 1;
    }
    size_t i = 0;  // Buffer index
    while (buf[i]) {
        if (isalpha(buf[i])) {
            ++nLetters;  // Increment letter count
        } else if (isdigit(buf[i])) {
            ++nDigits;  // Increment digit count
        } else if (ispunct(buf[i])) {
            ++nPunct;
        }
        ++i;
    }
    printf(
        "\nYou string contained %d letters, %d digits and %d punctuation "
        "characters.\n",
        nLetters, nDigits, nPunct);

    return 0;
}

/*
output:
Enter an interesting string of less than 100 characters:
I was born on the 3rd of October 1895, which is long ago.

You string contained 38 letters, 5 digits and 2 punctuation characters.
*/