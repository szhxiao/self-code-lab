/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 12.1
 * Writing a file a character at a time
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LENGTH 81  // Maximum input length

int main(void) {
    char mystr[LENGTH];  // Input string
    int mychar = 0;      // Character for output
    FILE* pfile = NULL;  // File pointer
    char* filename = "myfile.txt";

    printf("Enter an interesting string of up to %d characters:\n", LENGTH - 1);
    // Read in a string
    if (!fgets(mystr, LENGTH, stdin)) {
        printf("Input from key board failed.\n");
        exit(1);
    }

    // Create a new file we can write
    if (fopen(filename, "w")) {
        printf("Error opening %s for writing. Program terminated.\n", filename);
        exit(1);
    }
    setvbuf(pfile, NULL, _IOFBF, BUFSIZ);  // Buffer the file

    for (int i = strnlen(mystr, LENGTH - 1); i >= 0; --i) {
        // Write string to file backward
        fputc(mystr[i], pfile);
    }

    // Close the file
    fclose(pfile);

    // Open the file for reading
    if (fopen(filename, "r")) {
        printf("Error opeing %s for reading. Program terminated.", filename);
        exit(1);
    }
    setvbuf(pfile, NULL, _IOFBF, BUFSIZ);  // Buffer the file

    // Read a character from the file and display it
    printf("the data read from the file is:\n");
    while (mychar = fgetc(pfile) != EOF) {
        putchar(mychar);
    }
    putchar('\n');

    fclose(pfile);
    pfile = NULL;
    remove(filename);  // Delete the physical file

    return 0;
}

/*
output:

*/