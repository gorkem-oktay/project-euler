package com.zafiru.problems;

import com.zafiru.utils.Helper;

import java.math.BigInteger;

public class Problem3 extends Problem {

    public Problem3() {
        super(3, "The prime factors of 13195 are 5, 7, 13 and 29.\n" +
                "\n" +
                "What is the largest prime factor of the number 600851475143 ?");
    }

    @Override
    public String answer() {

        BigInteger value = new BigInteger("600851475143");
        BigInteger counter = BigInteger.TWO;
        BigInteger answer = BigInteger.ZERO;

        while(!value.equals(counter))
        {
            BigInteger result = value.mod(counter);

            if(result.intValue() == 0)
            {
                BigInteger divider = value.divide(counter);
                if(Helper.isPrime(divider)){
                    answer = divider;
                    break;
                }
            }

            counter = counter.add(BigInteger.ONE);
        }

        return answer.toString();
    }
}
