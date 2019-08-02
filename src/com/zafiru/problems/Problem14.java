package com.zafiru.problems;

import java.math.BigInteger;

public class Problem14 extends Problem {

    public Problem14() {
        super(14, "The following iterative sequence is defined for the set of positive integers:\n" +
                "\n" +
                "n → n/2 (n is even)\n" +
                "n → 3n + 1 (n is odd)\n" +
                "\n" +
                "Using the rule above and starting with 13, we generate the following sequence:\n" +
                "\n" +
                "13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1\n" +
                "It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.\n" +
                "\n" +
                "Which starting number, under one million, produces the longest chain?\n" +
                "\n" +
                "NOTE: Once the chain starts the terms are allowed to go above one million.");
    }

    public int getChainSize(int value, int size){
        /*
        if (value == 1) {
            return size + 1;
        } else if (value % 2 == 0){
            return getChainSize(value / 2, size + 1);
        } else {
            return getChainSize((value * 3) + 1, size + 1);
        }
        */
        BigInteger currentValue = new BigInteger(String.valueOf(value));
        int chainSize = 1;
        while(!currentValue.equals(BigInteger.ONE)) {
            if (currentValue.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                currentValue = currentValue.divide(BigInteger.TWO);
            } else {
                currentValue = currentValue.multiply(new BigInteger("3")).add(BigInteger.ONE);
            }
            chainSize++;
        }

        return chainSize;
    }

    @Override
    public String answer() {

        int biggestChain = 0;
        int result = 0;

        for (int i = 1; i < 1000000; i++) {
            int chainSize = getChainSize(i, 0);
            System.out.println("i: " + i + ", size: " + chainSize);
            if (chainSize > biggestChain) {
                biggestChain = chainSize;
                result = i;
            }
        }

        return String.valueOf(result);
    }
}
