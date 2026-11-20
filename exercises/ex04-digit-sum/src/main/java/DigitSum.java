
/**
 * Exercise (Chapter 1: Introduction to Java) — while loops and integer
 * arithmetic.
 *
 * Complete {@link #digitSum(int)} below using a while loop.
 *
 * Relevant reading: 1.8.3. while Loops (and 1.2. Variables and Types).
 */
public class DigitSum {

    public static void main(String[] args) {
        // Should print 15 (1 + 2 + 3 + 4 + 5) once digitSum is implemented.
        System.out.println("digitSum(12345) = " + digitSum(12345));
    }

    /**
     * Returns the sum of the decimal digits of {@code n}. Negative numbers are
     * treated by their absolute value, so {@code digitSum(-123) == 6}.
     *
     * @param n any int
     * @return the sum of its decimal digits
     */
    public static int digitSum(int n) {
        int sum = 0;

        // Gets the length of n, removes the neg sign
        int length = String.valueOf(Math.abs(n)).length();

        if (length > 1) {
            // Converts the int into a String so I can iterate through the String
            String numberStr = Integer.toString(Math.abs(n));
            for (int i = 0; i < numberStr.length(); i++) {
                char digitChar = numberStr.charAt(i);
                // Convert the character back to an int so I can add it and save the values to sum
                int digit = Character.getNumericValue(digitChar);
                sum += digit;
            }
        }
        else {
            return Math.abs(n);
        }
        return sum;
    }
}
