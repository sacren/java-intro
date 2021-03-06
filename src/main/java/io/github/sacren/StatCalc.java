/**
 * StatCalc class.
 *
 * <p>An object of class StatCalc can be used to compute several simple
 * statistics for a set of numbers.
 *
 * <p>Numbers are entered into the dataset using the addStats(double) method.
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
     * StatCalc setter for the overall instance data.
     *
     * <p>The statistics will be computed and updated for all the numbers added
     * to the instance data by this method.
     */
    public void addStats(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", number));
        }
        count++;
        sum += number;
        squareSum += number * number;
        max = count == 1 || number > max ? number : max;
        min = count == 1 || number < min ? number : min;
    }

    /** StatCalc getter for the number of items entered into the dataset. */
    public int getCount() {
        return count;
    }

    /** StatCalc getter for the sum of all the numbers entered. */
    public double getSum() {
        return sum;
    }

    /** StatCalc getter for the sum of all the number squares. */
    public double getSquareSum() {
        return squareSum;
    }

    /** StatCalc getter for the max of the dataset. */
    public double getMax() {
        return max;
    }

    /** StatCalc getter for the min of the dataset. */
    public double getMin() {
        return min;
    }

    /**
     * StatCalc getter for the average of all the numbers entered.
     *
     * <p>The return value is double or NaN if none have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * StatCalc getter for the standard deviation of all the numbers entered.
     *
     * <p>The return value is double or NaN if none have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

    /** StatCalc instance description. */
    public String toString() {
        String msg;
        if (count == 0) {
            msg = String.format("No stats at all!");
        } else {
            msg = String.format(
                    "Number of entries is %d%n"
                            + "Sum of the numbers in the dataset is %.2f%n"
                            + "Sum of the square of numbers in the dataset is %.2f%n"
                            + "Mean value of the dataset is %.2f%n"
                            + "Standard deviation of the dataset is %.2f%n"
                            + "Max number of the dataset is %.2f%n"
                            + "Min number of the dataset is %.2f",
                    count,
                    sum,
                    squareSum,
                    getMean(),
                    getStandardDeviation(),
                    max,
                    min);
        }
        return msg;
    }
}
