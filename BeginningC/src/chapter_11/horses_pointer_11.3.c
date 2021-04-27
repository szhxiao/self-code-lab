/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 11.3
 * Pointing out the horses
 */

#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct Horse Horse;  // Define Horse as a type name

// Struct type definition
struct Horse {
    int age;
    int height;
    char name[20];
    char father[20];
    char mother[20];
};

int main(void) {
    Horse* phorses[50];  // Array of Horse elements
    int hcount = 0;      // Count of the number of horses
    char test = '\0';    // Test value for ending

    for (hcount = 0; hcount < sizeof(phorses) / sizeof(Horse*); ++hcount) {
        printf("Do you want to enter details of a %s horse (Y or N)? ",
               hcount ? "nother" : "");
        scanf(" %c", &test, sizeof(test));
        if (tolower(test) == 'n') {
            break;
        }

        // Allocate memory to hold a horse structure
        phorses[hcount] = (Horse*)malloc(sizeof(Horse));

        // Read the name
        printf("Enter the name of the horse: ");
        scanf("%s", phorses[hcount]->name, sizeof(phorses[hcount]->name));

        // Read the age
        printf("How old is %s? ", phorses[hcount]->name);
        scanf("%d", &phorses[hcount]->age);

        // Read the height
        printf("How heigh is %s (in hands)? ", phorses[hcount]->name);
        scanf("%d", &phorses[hcount]->height);

        // Get pa's name
        printf("Who is %s's father? ", phorses[hcount]->name);
        scanf("%s", phorses[hcount]->father, sizeof(phorses[hcount]->father));

        // Get ma's name
        printf("Who is %s's mother? ", phorses[hcount]->name);
        scanf("%s", phorses[hcount]->mother, sizeof(phorses[hcount]->mother));
    }

    // Now tell them what we know
    printf("\n");
    for (int i = 0; i < hcount; ++i) {
        printf("%s is %d years old, %d hands high,", phorses[hcount]->name,
               phorses[hcount]->age, phorses[hcount]->height);
        printf(" and has %s and %s as parents.\n", phorses[hcount]->father,
               phorses[hcount]->mother);

        free(phorses[i]);
    }

    return 0;
}

/*
output:

*/