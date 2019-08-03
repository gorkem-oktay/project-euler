package com.zafiru.problems;

import java.math.BigInteger;

public class Problem16 extends Problem {

    public Problem16() {
        super(16, "215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.\n" +
                "\n" +
                "What is the sum of the digits of the number 21000?");
    }

    @Override
    public String answer() {
        BigInteger value = BigInteger.TWO;

        BigInteger powerOfThousand = value.pow(1000);
        String strPower = powerOfThousand.toString();

        BigInteger result = BigInteger.ZERO;

        for (int i = 0; i < strPower.length(); i++) {
            result = result.add(new BigInteger(String.valueOf(strPower.charAt(i))));
        }

        return result.toString();
    }
}
