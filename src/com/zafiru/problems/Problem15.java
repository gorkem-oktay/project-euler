package com.zafiru.problems;

import com.zafiru.utils.Helper;

import java.math.BigInteger;

public class Problem15 extends Problem {

    public Problem15() {
        super(15, "Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.\n" +
                "\n" +
                "\n" +
                "How many such routes are there through a 20×20 grid?");
    }

    @Override
    public String answer() {
        return String.valueOf(Helper.combination(new BigInteger("40"), new BigInteger("20")));
    }
}
