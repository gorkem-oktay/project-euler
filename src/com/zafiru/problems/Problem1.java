package com.zafiru.problems;

public class Problem1 extends Problem {


    public Problem1() {
        super(1, "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n" +
                "\n" +
                "Find the sum of all the multiples of 3 or 5 below 1000.");
    }

    @Override
    public String answer() {

        int total = 0;

        for(int i = 1; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                total += i;
            }
        }

        return String.valueOf(total);
    }
}
