package com.javacertification.interviewquestions;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Contain helpful methods for int numbers.
 */
public class IntUtils {

    private IntUtils() {
        throw new IllegalStateException("Constructor not allowed for a util class.");
    }

    /**
     * Determines if a number is a power of another number.
     *
     * @param number  the value to be raised to
     * @param powerOf the power
     * @return <code>true<code/> or <code>false<code/> according to the evaluation
     */
    public static boolean isPowerOf(int number, int powerOf) {
        return Math.pow(number, 1d / powerOf) % 1 == 0d;
    }

    /**
     * Determines is a number is a palindrome, e.g. 1001, 14541
     *
     * @param value the value to evaluate
     * @return <code>true<code/> or <code>false<code/> according to the evaluation
     */
    public static boolean isPalindrome(int value) {
        do {
            int lastDigit = value % 10;
            int firstDigit = value / (int) Math.pow(10, (int) Math.log10(value));
            if (lastDigit != firstDigit) {
                return false;
            }
            value /= 10;
            if (value == 0) {
                break;
            }
            value %= (int) Math.pow(10, (int) Math.log10(value));
        } while (value > 0);
        return true;
    }

    /**
     * Determines whether a number is Armstrong number. An Armstrong number is a number whose value is
     * equal to the sum of its digits raised to the power of its length e.g. 153 because 1^3 + 5^3 + 3^3 = 153.
     *
     * @param value the value to evaluate
     * @return <code>true<code/> or <code>false<code/> according to the evaluation
     */
    public static boolean isArmstrong(int value) {
        int exponent = (int) Math.log10(value) + 1;
        int sum = 0;
        int originalValue = value;
        do {
            sum += (int) Math.pow(value % 10, exponent);
            value /= 10;
        } while (value > 0);
        return originalValue == sum;
    }

    /**
     * A number is happy if it fis the following process: sum the squares of its digits and replace the number with the
     * result. Repeat the process (sum the squares of its digits) until the result equals one, or until the process
     * loops endlessly in a cycle which does not include one, e.g. 23 -> 2^2 + 3^2 = 13 -> 1^2 + 3^2 = 10 -> 1^2 = 1
     *
     * @param value the value to evaluate
     * @return <code>true<code/> or <code>false<code/> according to the evaluation
     */
    public static boolean isHappy(int value) {
        Set<Integer> subResults = new HashSet<>();
        while (true) {
            value = performAdditionSquares(value);
            if (!subResults.add(value)) {
                return false;
            } else if (value == 1) {
                return true;
            }
        }
    }

    /**
     * Sum the squares of its digits.
     *
     * @param value the value
     * @return the sum of its digits' squares
     */
    private static int performAdditionSquares(int value) {
        return String.valueOf(value).chars().map(Character::getNumericValue).map(digit -> digit * digit).sum();
    }

    /**
     * Determine whether a number is prime, i.e. it's only divisible by 1 and its own value.
     *
     * @param value the value to evaluate
     * @return <code>true<code/> or <code>false<code/> according to the evaluation
     */
    public static boolean isPrime(int value) {
        int countDivisors = 0;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                countDivisors++;
            }
        }
        return countDivisors == 0;
    }

    /**
     * Obtain the factorial of a given number.
     *
     * @param n the number
     * @return the factorial in a {@link BigInteger} object.
     */
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No negative number is allowed");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
