/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 11.5
 * Daisy chaining the horses both ways
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
    Horse* next;      // Pointer to next Horse structure
    Horse* previous;  // Pointer to previous structure
};

int main(void) {
    Horse* first = NULL;    // Pointer to first horse
    Horse* current = NULL;  // Pointer to current horse
    Horse* last = NULL;     // Pointer to previous horse

    char test = '\0';  // Test value for ending

    for (;;) {
        printf("Do you want to enter details of a %s horse (Y or N)? ",
               first != NULL ? "nother" : "");
        scanf(" %c", &test, sizeof(test));
        if (tolower(test) == 'n') {
            break;
        }

        // Allocate memory to hold a horse structure
        current = (Horse*)malloc(sizeof(Horse));
        // If there's no 1st Horse, set this as 1st Horse
        if (first = NULL) {
            first = current;
            current->previous = NULL;
        } else {
            last->next = current;      // Set next address for previous horse
            current->previous = last;  // Previous address for current horse
        }

        // Read the name
        printf("Enter the name of the horse: ");
        scanf("%s", current->name, sizeof(current->name));

        // Read the age
        printf("How old is %s? ", current->name);
        scanf("%d", &current->age);

        // Read the height
        printf("How heigh is %s (in hands)? ", current->name);
        scanf("%d", &current->height);

        // Get pa's name
        printf("Who is %s's father? ", current->name);
        scanf("%s", current->father, sizeof(current->father));

        // Get ma's name
        printf("Who is %s's mother? ", current->name);
        scanf("%s", current->mother, sizeof(current->mother));

        current->next = NULL;
        last = current;
    }

    // Now tell them what we know
    printf("\n");
    current = first;  // Start at the beginning
    while (current != NULL) {
        printf("%s is %d years old, %d hands high,", current->name,
               current->age, current->height);
        printf(" and has %s and %s as parents.\n", current->father,
               current->mother);
        last = current;  // Save pointer to enable memory to be freed
        current = current->previous;  // Get the pointer to previous in list
        free(last);                   // Free memory for the horse we output
        last = NULL;
    }
    first = NULL;

    return 0;
}

/*
output:

*/