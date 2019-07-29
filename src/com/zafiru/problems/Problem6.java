package com.zafiru.problems;

public class Problem6 extends Problem {

    public Problem6() {
        super(6, "The sum of the squares of the first ten natural numbers is,\n" +
                "\n" +
                "12 + 22 + ... + 102 = 385\n" +
                "The square of the sum of the first ten natural numbers is,\n" +
                "\n" +
                "(1 + 2 + ... + 10)2 = 552 = 3025\n" +
                "Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.\n" +
                "\n" +
                "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.");
    }

    int getSumOfSquares(int end) {
        int result = 0;
        for (int i = 1; i <= end; i++) {
            result += i * i;
        }
        return result;
    }

    int getSquareOfTheSum(int end) {
        int result = 0;
        for (int i = 1; i <= end; i++) {
            result += i;
        }
        return result * result;
    }

    @Override
    public String answer() {
        return String.valueOf(getSquareOfTheSum(100) - getSumOfSquares(100));
    }
}
