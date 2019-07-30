package com.zafiru.problems;

import com.zafiru.utils.Helper;

import java.math.BigInteger;

public class Problem10 extends Problem {

    public Problem10() {
        super(10, "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.\n" +
                "\n" +
                "Find the sum of all the primes below two million.");
    }

    @Override
    public String answer() {

        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i < 2000000; i++) {
            BigInteger value = new BigInteger("" + i);
            if (Helper.isPrime(value)) {
                result = result.add(value);
                System.out.println("added " + value.toString());
            }
        }

        return result.toString();
    }
}
