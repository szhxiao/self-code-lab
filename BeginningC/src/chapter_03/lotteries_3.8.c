/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 3.8
 * Lucky Lotteries
 */

#include <stdio.h>

int main(void) {
    int choice = 0;

    // Get the choice input
    printf("Pick a number between 1 and 10 and you may win a price!");
    scanf("%d", &choice);

    // Check for an invalid selection
    if ((choice > 10) || (choice < 1)) {
        choice = 11;
    }

    switch (choice) {
        case 7:
            printf("Congratulations!\n");
            printf("You win the collected works of Amos Gruntfuttock.\n");
            break;

        case 2:
            printf("You win the folding thermometer-pen-watch-umbrella.\n");
            break;

        case 8:
            printf("You win the lifetime supply of aspirin tablets.\n");
            break;

        case 11:
            printf("Try between 1 and 10. You wasted you guess.\n");

        default:
            printf("Sorry, you lose.\n");
            break;
    }

    return 0;
}

/*
output:
Pick a number between 1 and 10 and you may win a price!5
Sorry, you lose.
*/