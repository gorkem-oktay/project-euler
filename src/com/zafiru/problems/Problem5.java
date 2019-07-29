package com.zafiru.problems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Problem5 extends Problem {

    public Problem5() {
        super(5, "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.\n" +
                "\n" +
                "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");
    }

    @Override
    public String answer() {

        BigInteger counter = BigInteger.ONE;
        BigInteger step = new BigInteger("20");
        BigInteger result = BigInteger.ZERO;

        List<Integer> valuesToIgnore = Arrays.asList(4, 5, 10);

        while (result.toString().equalsIgnoreCase("0")) {
            BigInteger currentValue = step.multiply(counter);

            boolean foundRemainder = false;
            for (int i = 3; i < 20; i++) {
                if (valuesToIgnore.contains(i)) {
                    continue;
                }

                if (currentValue.mod(new BigInteger("" + i)).intValue() != 0) {
                    foundRemainder = true;
                    break;
                }
            }

            if (!foundRemainder) {
                result = currentValue;
                break;
            }

            counter = counter.add(BigInteger.ONE);
        }

        return String.valueOf(result);
    }
}
