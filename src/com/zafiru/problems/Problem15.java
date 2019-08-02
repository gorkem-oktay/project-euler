package com.zafiru.problems;

public class Problem15 extends Problem {

    public Problem15() {
        super(15, "Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.\n" +
                "\n" +
                "\n" +
                "How many such routes are there through a 20×20 grid?");
    }

    int numberOfPaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        } else {
            return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
        }
    }

    @Override
    public String answer() {
        return String.valueOf(numberOfPaths(21,21));
    }
}
