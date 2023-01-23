package TechAssessment230123;

// Imagine a Video Game where Player Controls a Character to go through several levels
// Character has initial health values of initialHealth, value changes as Player goes through levels
// You are given an array of Integers deltas, defining each health value changes
// The ith level (0 - indexed) changes character's current health value by deltas[i]
// Whenever health value is less than 0, it becomes 0. Similarly, if it is more than 100, then health is 100
// Task is to return the character's final Health value after going through all levels in the game
// Eg. initialHealth = 12 & deltas = [-4, -12, 6, 2] then output (initialHealth, deltas) = 8

public class PlayerHealthValues {
    int solution(int initialHealth, int[] deltas) {
        int currentHealth = initialHealth;
        for (int delta : deltas) {
            currentHealth += delta;
            if (currentHealth < 0) {
                currentHealth = 0;
            } else if (currentHealth > 100) {
                currentHealth = 100;
            }
        }
        return currentHealth;
    }
}
