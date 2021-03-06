/**
 * Test driver for PairOfDice.
 */
public class TestPairOfDice {
    /** Test driver of rolling the dice for the sum of 2. */
    public static void main(String[] args) {
        /* We could do:
         *
         * PairOfDice dice = new PairOfDice();
         *
         * but rather instantiate with impractical value pair to bypass random
         * numbers. It works indeed.
         */
        PairOfDice dice = new PairOfDice(0, 0);
        int count = 0;
        System.out.println();
        System.out.println("=== Rolls ===");
        System.out.println();
        for ( ; ; ) {
            dice.roll();
            System.out.printf("Roll %d: %s%n", ++count, dice);
            if (dice.getTotal() == 2) {
                break;
            }
        }
        System.out.println();
        System.out.printf("Rolled %d times with pair of dice equal to 2%n", count);
        System.out.println();
        System.out.println("=== Reset dice ===");
        System.out.println();
        dice.setDice(6, 6);
        System.out.println(dice);
        System.out.println();
        System.out.println("=== Throw Exception ===");
        System.out.println();
        dice.setDice(7, 6);
        System.out.println(dice);
    }
}
