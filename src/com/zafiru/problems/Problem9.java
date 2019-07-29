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

        double a = 3.0; double targetA = 3.0;
        double b = 4.0; double targetB = 4.0;
        double c = 5.0; double targetC = 5.0;

        double factor = 1000.0 / 12.0;

        targetA = a * factor;
        targetB = b * factor;
        targetC = c * factor;

        System.out.println("a: " + targetA + ", b: " + targetB + ", c: " + targetC);

        return String.valueOf(targetA * targetB * targetC);
    }
}
