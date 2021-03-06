package com.javacertification.interviewquestions;

/**
 * Util containing mathematical generations.
 */
public class SequenceGenerator {

    private SequenceGenerator() {
        throw new IllegalStateException("This class is not to be constructed.");
    }

    /**
     * Get the sum of the nth fibonacci element(s).
     *
     * @param n the position
     * @return a <code>int<code/> value
     * @throws IllegalArgumentException if the argument is less than 1
     */
    public static int recursiveFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The argument must be greater than 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
    }

    /**
     * Get the sum of the nth fibonacci element(s).
     *
     * @param n the position
     * @return a <code>int<code/> value
     * @throws IllegalArgumentException if the argument is less than 1
     */
    public static int iterativeFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The argument must be greater than 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int c3 = 0;
        for (int i = 0, c = 1, c1 = 1; i < n - 2; i++, c = c1, c1 = c3) {
            c3 = c + c1;
        }
        return c3;
    }
}
