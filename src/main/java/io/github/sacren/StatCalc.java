/**
 * StatCalc class.
 *
 * <p>An object of class StatCalc can be used to compute several simple
 * statistics for a set of numbers.
 *
 * <p>Numbers are entered into the dataset using the enter(double) method.
 * Methods are provided to return the statistics for the set of numbers that
 * have been entered.
 *
 * <p>1. The number of items
 *
 * <p>2. The sum of the items
 *
 * <p>3. The average
 *
 * <p>4. The standard deviation
 */
public class StatCalc {
    /* private instance data */
    private int count; /* count of numbers that have been entered */
    private double sum; /* the sum of all the items that have been entered */
    private double squareSum; /* the sum of the squares of all the items */
    private double max;
    private double min;

    /**
     * StatCalc public method to add a number to the dataset.
     *
     * <p>The statistics will be computed for all the numbers that have been
     * added to the dataset using this method.
     */
    public void enter(double number) {
        count++;
        sum += number;
        squareSum += number * number;
        max = count == 1 || number > max ? number : max;
        min = count == 1 || number < min ? number : min;
    }

    /**
     * StatCalc public method for the number of items that have been entered
     * into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * StatCalc public method for the sum of all the numbers that have been
     * entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * StatCalc public method for the average of all the items that have been
     * entered.
     *
     * <p>The return value is double or NaN if none have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * StatCalc public method for the standard deviation of all the items that
     * have been entered.
     *
     * <p>The return value is double or NaN if none have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

    /** StatCalc instance description. */
    public String toString() {
        return String.format(
                "[Count=%d, Sum=%.2f, Square Sum=%.2f, Max=%.2f, Min=%.2f]",
                count, sum, squareSum, max, min);
    }
}
