/**
 * PairOfDice class with dice rolling for a pair of numbers between 1 and 6.
 *
 * <p>Private data:
 * -die1:int
 * -die2:int
 *
 * <p>Constructor:
 * +PairOfDice()
 * +PairOfDice(die1:int, die2:int)
 *
 * <p>Public methods:
 * +getDice():int[]
 * +getTotal():int
 * +roll():void
 * +toString():String
 */
import java.util.Arrays;

public class PairOfDice {
    /* private instance data */
    private int die1; /* random number shown on the first die rolled */
    private int die2; /* random number shown on the second die rolled */

    /** PairOfDice default constructor. */
    public PairOfDice() {
        roll();
    }

    /** PairOfDice custom constructor with dice rolled. */
    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

    /** PairOfDice getter for the numbers on the dice rolled. */
    public int[] getDice() {
        int[] dice = new int[2];
        dice[0] = die1;
        dice[1] = die2;
        return dice;
    }

    /** PairOfDice public method for the total of each rolling. */
    public int getTotal() {
        return die1 + die2;
    }

    /**
     * PairOfDice public method for a pair of dice rolled out with a pair of
     * random numbers between 1 and 6.
     */
    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    /** PairOfDice instance description. */
    public String toString() {
        return String.format(
                "Pair of dice %s",
                Arrays.toString(getDice()));
    }
}
