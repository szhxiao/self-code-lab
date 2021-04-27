/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 11.1
 * Exercising the horse
 */

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
    Horse my_horse;  // Structure variable declaration

    // Initialize the structure variable from input data
    // Read the name
    printf("Enter the name of the horse: ");
    scanf("%s", my_horse.name, sizeof(my_horse.name));

    // Read the age
    printf("How old is %s? ", my_horse.name);
    scanf("%d", &my_horse.age);

    // Read the height
    printf("How heigh is %s (in hands)? ", my_horse.name);
    scanf("%d", &my_horse.height);

    // Get pa's name
    printf("Who is %s's father? ", my_horse.name);
    scanf("%s", my_horse.father, sizeof(my_horse.father));

    // Get ma's name
    printf("Who is %s's mother? ", my_horse.name);
    scanf("%s", my_horse.mother, sizeof(my_horse.mother));

    // Tell them what we know
    printf("%s is %d years old, %d hands high,", my_horse.name, my_horse.age,
           my_horse.height);
    printf(" and has %s and %s as parents.\n", my_horse.father,
           my_horse.mother);

    return 0;
}

/*
output:
Enter the name of the horse: Neddy
How old is Neddy? 12
How heigh is Neddy (in hands)? 14
Who is Neddy's father? Bertie
Who is Neddy's mother? Nellie
Neddy is 12 years old, 14 hands high, and has Bertie and Nellie as parents.
*/