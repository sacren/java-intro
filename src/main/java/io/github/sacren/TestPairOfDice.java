/**
 * Test driver for PairOfDice.
 */
public class TestPairOfDice {
    /** Test driver of rolling the dice for the sum of 2. */
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        System.out.println(dice);
        System.out.println();
        int count = 0;
        int[] diceArray;
        for ( ; ; ) {
            diceArray = dice.getDice();
            if (diceArray[0] + diceArray[1] == 2) {
                break;
            }
            dice.roll();
            System.out.println(dice);
            count++;
        }
        System.out.printf("Rolled %d times%n", count);
    }
}
