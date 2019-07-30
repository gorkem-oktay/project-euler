package com.zafiru.problems;

public class Problem9 extends Problem {

    public Problem9() {
        super(9, "A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,\n" +
                "\n" +
                "a2 + b2 = c2\n" +
                "For example, 32 + 42 = 9 + 16 = 25 = 52.\n" +
                "\n" +
                "There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n" +
                "Find the product abc.");
    }

    @Override
    public String answer() {

        int c = 2;
        int result = 0;

        while (result < 2000) {
            for(int i = 1; i < c; i++) {
                for (int j = 1; j <= i; j++) {
                    if (c * c == (i * i) + (j * j)) {
                        result = j + i + c;
                        if(result == 1000)
                        {
                            return String.valueOf(i * j * c);
                        }
                    }
                }
            }
            c++;
        }

        return String.valueOf("0");
    }
}
