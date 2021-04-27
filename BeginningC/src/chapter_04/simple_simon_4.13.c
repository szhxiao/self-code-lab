/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 4.13
 * Simple Simon
 */

#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
    char another_game = 'Y';       // Records if another game is to be played
    const unsigned int DELAY = 1;  // Display period in seconds
    bool correct = true;           // For bool, true, false
    unsigned int tries = 0;  // Number of successful entries for sequence length
    unsigned int digits = 0;        // Number of digits in a sequence
    time_t seed = 0;                // Seed value for random number sequence
    unsigned int number = 0;        // Stores an input digit
    time_t wait_start = 0;          // Sotres current time
    clock_t start_time = 0;         // Game start time in clock ticks
    unsigned int score = 0;         // Game score
    unsigned int total_digits = 0;  // Total of digits entered in a game
    unsigned int game_time = 0;     // Game time in seconds

    // Display how the game is played
    printf("\nTo play Simple Simon, ");
    printf("watch the screen for a sequence of digits.");
    printf(
        "\nWatch carefully, as the digits are only displayed for %u seconds%s ",
        DELAY, DELAY > 1 ? "s!" : "!");
    printf("\nThe computer will remove them, and then prompt you ");
    printf("to enter the same sequence.");
    printf("\nWhen you do, you must put spaces between the digits.\n");
    printf("\nGood Luck!\nPress Enter to play\n");
    scanf("%c", &another_game);

    // Game loop - one outer loop iteration is a complete game
    do {
        correct = true;        // Indicates correct sequence entered
        tries = 0;             // Initialize count of successful tries
        digits = 2;            // Initial length of digit sequence
        start_time = clock();  // Record time at start of game

        // Inner loop continues as long as sequences are entered correctly
        while (correct) {
            ++tries;               // A new attempt
            wait_start = clock();  // Record start time for sequence

            // Generate a sequence of digits and display them
            srand(time(&seed));  // Initialize the random sequence
            for (unsigned int i = 1; i <= digits; ++i) {
                printf("%d ", rand() % 10);
            }

            // Wait DELAY seconds
            for (; clock() - wait_start < DELAY * CLOCKS_PER_SEC;)
                ;

            // Now overwrite the digit sequence
            printf("/r");
            for (unsigned int i = 1; i <= digits; ++i) {
                printf(" ");
            }

            if (tries == 1) {
                // Only output message for 1st try
                printf(
                    "\nNow you enter the sequence - don't forget the spaces\n");
            } else {
                // Back to the beginning of the line
                printf("\r");
            }

            srand(seed);  // Reinitialize the random sequence
            for (unsigned int i = 1; i <= digits; ++i) {
                scanf("%u", &number);  // Read a digit
                // Compare with generated digit
                if (number != rand() % 10) {
                    correct = false;  // Incorrect entry
                    break;            // No need to check further...
                }
            }

            // On every third successful try, increase the sequence length
            if (correct && ((tries % 3) == 0)) {
                ++digits;
            }

            printf("%s\n", correct ? "Correct!" : "Wrong!");
        }

        // Calculate and output the game score
        score =
            10 * (digits - ((tries % 3) == 1));  // Points for sequence length
        total_digits = digits * (((tries % 3) == 0) ? 3 : tries % 3);
        if (digits > 2) {
            total_digits += 3 * ((digits - 1) * (digits - 2) / 2 - 1);
        }

        game_time = (clock() - start_time) / CLOCKS_PER_SEC - tries * DELAY;

        if (total_digits > game_time) {
            score += 10 * (game_time - total_digits);  // Add points for speed
        }
        printf("\n\nGame time was %u seconds. Your score is %u", game_time,
               score);

        fflush(stdin);  // Clear the input buffer

        // Check if a new game is required
        printf("\nDo you want to play again (y/n)? ");
        scanf("%c", &another_game);
    } while (toupper(another_game) == 'Y');

    return 0;
}

/*
output:

*/