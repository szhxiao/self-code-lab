/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 12.2
 * As the saying goes...it comes back
 */

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

#define LENGTH 81  // Maximum input length

int main(void) {
    char* proverbs[] = {"Many a mickle makes a muckle.\n",
                        "Too many cooks spoil the broth.\n",
                        "He who laughs last didn't get the joke in"
                        " the first place.\n"};
    char more[LENGTH];
    FILE* pfile = NULL;
    char* filename = "myfile.txt";

    // Create a new file if myfile.txt does not exit
    if (!fopen(filename, "w")) {
        printf("Error opening %s for writing. Program terminated.\n", filename);
        exit(1);
    }
    setvbuf(pfile, NULL, _IOFBF, BUFSIZ);  // Buffer the file

    // Write our locally stored proverbs to the file
    for (size_t i = 0; i < sizeof proverbs / sizeof proverbs[0]; ++i) {
        if (EOF == fputs(proverbs[i], pfile)) {
            printf("Error writing file.\n");
            exit(1);
        }
    }
    fclose(pfile);
    pfile = NULL;

    // Open the file to append more proverbs
    if (fopen(filename, "a")) {
        printf("Error opening %s for appending. Program terminated.\n",
               filename);
        exit(1);
    }
    setvbuf(pfile, NULL, _IOFBF, BUFSIZ);

    printf("Enter proverbs of up to %d characters or press Enter to end:\n",
           LENGTH - 1);

    while (true) {
        fgets(more, LENGTH, stdin);
        if (more[0] == '\n') {
            break;
        }
        if (EOF == fputs(more, pfile)) {
            printf("Error writing file.\n");
            exit(1);
        }
    }
    fclose(pfile);
    pfile = NULL;

    if (fopen(filename, "r")) {
        printf("Error opening %s for reading. Program terminated.\n", filename);
        exit(1);
    }
    setvbuf(pfile, NULL, _IOFBF, BUFSIZ);

    // Read and output the file contents
    printf("The proverbs in the file are:\n");
    while (fgets(more, LENGTH, pfile)) {
        printf("%s", more);
    }

    fclose(pfile);
    remove(filename);
    pfile = NULL;

    return 0;
}

/*
output:

*/