package com.zafiru.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<Long> getDividers(long value) {
        List<Long> dividers = new ArrayList<>();
        long currentDivider = 1;
        long currentValue = value;

        while (currentValue != 1) {
            if (currentValue % currentDivider == 0) {
                dividers.add(currentDivider);
                currentValue = currentValue / currentDivider;
            } else {
                currentDivider++;
            }
        }

        return dividers;
    }

    public static long getTriangleNumber(int index) {
        long result = 0;
        for (long i = 1; i <= index; i++) {
            result += i;
        }

        return result;
    }

    public static boolean isPrime(BigInteger value) {

        int squareRoot = value.sqrt().intValue();

        for (int i = 2; i <= squareRoot; i++) {
            if (value.mod(new BigInteger("" + i)).intValue() == 0) {
                return false;
            }
        }

        return true;
    }
}
