package com.zafiru.problems;

import com.zafiru.utils.Helper;

import java.math.BigInteger;

public class Problem20 extends Problem {

    public Problem20() {
        super(20, "n! means n × (n − 1) × ... × 3 × 2 × 1\n" +
                "\n" +
                "For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,\n" +
                "and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.\n" +
                "\n" +
                "Find the sum of the digits in the number 100!");
    }

    @Override
    public String answer() {
        return Helper.sumOfDigits(Helper.factorial(new BigInteger("100"))).toString();
    }
}
