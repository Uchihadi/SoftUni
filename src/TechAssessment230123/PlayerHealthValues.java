package TechAssessment230123;

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
