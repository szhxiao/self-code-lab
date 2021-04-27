/**
 * Begining C
 *
 * version: 5th
 * author: Ivor Horton
 * http://www.apress/com
 */

/**
 * Program 10.1
 * Exercising formatted input
 */

#include <stdio.h>

#define SIZE 20

// Function prototypes
void try_input(char* prompt, char* format);  // Input test function

int main(void) {
    try_input("Enter as input -2.35 15 25 ready2go\n",
              "%f %d %d %[abcdefghijklmnopqrstuvwxyz] %*ld %s%n");
    try_input("\nEnter the same input again: ",
              "%4f %4d %d %*d %[abcdefghijklmnopqrstuvwxyz] %*ld %[^o]%n");
    try_input("\nEnter as input: -2.3A 15 25 ready2go\n",
              "%4f, %4d %d %*d %[abcdefghijklmnopqrstuvwxyz] %ld %[^o]%n");
    return 0;
}

void try_input(char* prompt, char* format) {
    int value_count = 0;     // Count of input values read
    float fp1 = 0.0F;        // Floating-point value read
    int i = 0;               // First integer read
    int j = 0;               // Second integer read
    char word1[SIZE] = " ";  // First string read
    char word2[SIZE] = " ";  // Second string read
    int byte_count = 0;      // Count of input bytes read

    printf(prompt);
    value_count = scanf(format, &fp1, &i, &j, word1, word2, &byte_count);

    fflush(stdin);

    printf("The input format string for scanf() is: \n \"%s \"\n", format);
    printf("Count of bytes read = %d\n", byte_count);
    printf("Count of values read = %d\n", value_count);
    printf("fp1 = %f i = %d j = %d\n", fp1, i, j);
    printf("word1 = %s word2 = %s\n", word1, word2);
}

/*
output:
Enter as input -2.35 15 25 ready2go
-2.35 15 25 ready2go
The input format string for scanf() is:
 "%f %d %d %[abcdefghijklmnopqrstuvwxyz] %*ld %s%n "
Count of bytes read = 20
Count of values read = 5
fp1 = -2.350000 i = 15 j = 25
word1 = ready word2 = go

Enter the same input again: -2.35 15 25 43ady2go
The input format string for scanf() is:
 "%4f %4d %d %*d %[abcdefghijklmnopqrstuvwxyz] %*ld %[^o]%n "
Count of bytes read = 0
Count of values read = 3
fp1 = -2.300000 i = 5 j = 15
word1 =   word2 =

Enter as input: -2.3A 15 25 ready2go
The input format string for scanf() is:
 "%4f, %4d %d %*d %[abcdefghijklmnopqrstuvwxyz] %ld %[^o]%n "
Count of bytes read = 0
Count of values read = 1
fp1 = 43.000000 i = 0 j = 0
word1 =   word2 =
*/