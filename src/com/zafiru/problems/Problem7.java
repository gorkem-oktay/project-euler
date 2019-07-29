package com.zafiru.problems;

import com.zafiru.utils.Helper;

import java.math.BigInteger;

public class Problem7 extends Problem {

    public Problem7() {
        super(7, "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.\n" +
                "\n" +
                "What is the 10 001st prime number?");
    }

    @Override
    public String answer() {

        int primeCounter = 0;
        BigInteger counter = new BigInteger("1");

        while(primeCounter != 10001){
            counter = counter.add(new BigInteger("1"));
            if(Helper.isPrime(counter)){
                primeCounter++;
            }
        }

        return counter.toString();
    }
}
