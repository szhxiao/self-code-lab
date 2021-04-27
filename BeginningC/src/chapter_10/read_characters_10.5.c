/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.5
 * Reading characters
 */

#include <stdio.h>

#define MAX_TOWN 10

int main(void) {
    char initial = ' ';
    char name[80] = {' '};
    char age[4] = {'0'};
    printf("Enter your first initial: ");
    scanf("%c", &initial);
    printf("Enter you first name: ");
    scanf("%s", name);
    fflush(stdin);

    if (initial != name[0]) {
        printf("%s, you got your initial wrong.\n", name);
    } else {
        printf("Hi, %s. Your initial is correct. Well done!\n", name);
        printf("Enter your full name and you age separated by a comma:\n");
        scanf("%[^,], %[0123456789]", name, age);
        printf("\nYour name is %s and you are %s years old.\n", name, age);
    }

    return 0;
}

/*
output:
Enter your first initial: I
Enter you first name: Ivor
Hi, Ivor. Your initial is correct. Well done!
Enter your full name and you age separated by a comma:
Ivor Horton, 98

Your name is
Ivor Horton and you are 98 years old.
*/