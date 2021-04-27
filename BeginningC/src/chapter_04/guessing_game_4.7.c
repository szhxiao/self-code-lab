/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.7
 * Guessing game
 */

#include <stdio.h>

int main(void) {
    int chosen = 15;  // The lucky number
    int guess = 0;    // Stores a guess
    int count = 3;    // The maximum number of tries

    printf("\nThis is a guessing game.");
    printf("\nI have chosen a number between 1 and 20 which you must guess.\n");

    for (; count > 0; --count) {
        printf("\nYou have %d tr%s left.", count, count == 1 ? "y" : "ies");
        printf("\nEnter a guess: ");  // Prompt for a guess
        scanf("%d", &guess);          // Read in a guess

        // Check for a correct guess
        if (guess == chosen) {
            printf("\nCongratulation. You guessed it!\n");
            return 0;
        } else if (guess < 1 || guess > 20) {
            printf("I said the number is between 1 and 20.\n");
        } else {
            printf("Sorry, %d is wrong. My number is %s than that.\n", guess,
                   chosen > guess ? "greater" : "less");
        }
    }
    printf("\nYou have had three tries and failed. The number was %d\n",
           chosen);

    return 0;
}

/*
output:
This is a guessing game.
I have chosen a number between 1 and 20 which you must guess.

You have 3 tries left.
Enter a guess: 5
Sorry, 5 is wrong. My number is greater than that.

You have 2 tries left.
Enter a guess: 19
Sorry, 19 is wrong. My number is less than that.

You have 1 try left.
Enter a guess: 15

Congratulation. You guessed it!
*/