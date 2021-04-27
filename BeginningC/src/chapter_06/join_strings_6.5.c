/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 6.5
 * Joining strings
 */

#define _STDC_WANT_LIB_EXT1_ 1
#include <stdio.h>
#include <string.h>

int main(void) {
    char preamble[] = "The joke is:\n\n";
    char str[][40] = {"My dog hasn\'t got any nose.\n",
                      "How does you dog smell then?\n",
                      "My dog smells horrible.\n"};

    unsigned int strCount = sizeof(str) / sizeof(str[0]);

    // Find the total length of all the strings in str
    unsigned int length = 0;
    for (unsigned int i = 0; i < strCount; ++i) {
        length += strnlen_s(str[i], sizeof(str[i]));
    }

    // Create array to hold all strings combined
    char joke[length + strnlen_s(preamble, sizeof(preamble)) + 1];

    if (strncpy_s(joke, sizeof(joke), preamble, sizeof(preamble))) {
        printf("Error copying preamble to joke.\n");
        return 1;
    }

    // Concatenate strings in joke
    for (unsigned int i = 0; i < strCount; ++i) {
        if (strncat_s(joke, sizeof(joke), str[i], sizeof(str[i]))) {
            printf("Error copying string str[%u].", i);
            return 2;
        }
    }
    printf("%s", joke);

    return 0;
}

/*
output:

*/