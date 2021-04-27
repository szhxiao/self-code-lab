/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 11.2
 * Exercising the horses
 */

#include <ctype.h>
#include <stdio.h>

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
    Horse my_horses[50];  // Array of Horse elements
    int hcount = 0;       // Count of the number of horses
    char test = '\0';     // Test value for ending

    for (hcount = 0; hcount < sizeof(my_horses) / sizeof(Horse); ++hcount) {
        printf("Do you want to enter details of a %s horse (Y or N)? ",
               hcount ? "nother" : "");
        scanf(" %c", &test, sizeof(test));
        if (tolower(test) == 'n') {
            break;
        }

        // Read the name
        printf("Enter the name of the horse: ");
        scanf("%s", my_horses[hcount].name, sizeof(my_horses[hcount].name));

        // Read the age
        printf("How old is %s? ", my_horses[hcount].name);
        scanf("%d", &my_horses[hcount].age);

        // Read the height
        printf("How heigh is %s (in hands)? ", my_horses[hcount].name);
        scanf("%d", &my_horses[hcount].height);

        // Get pa's name
        printf("Who is %s's father? ", my_horses[hcount].name);
        scanf("%s", my_horses[hcount].father, sizeof(my_horses[hcount].father));

        // Get ma's name
        printf("Who is %s's mother? ", my_horses[hcount].name);
        scanf("%s", my_horses[hcount].mother, sizeof(my_horses[hcount].mother));
    }

    // Now tell them what we know
    printf("\n");
    for (int i = 0; i < hcount; ++i) {
        printf("%s is %d years old, %d hands high,", my_horses[hcount].name,
               my_horses[hcount].age, my_horses[hcount].height);
        printf(" and has %s and %s as parents.\n", my_horses[hcount].father,
               my_horses[hcount].mother);
    }

    return 0;
}

/*
output:

*/