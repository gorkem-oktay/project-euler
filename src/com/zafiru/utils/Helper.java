package com.zafiru.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<BigInteger> getDividers(BigInteger value) {
        List<BigInteger> dividers = new ArrayList<>();
        BigInteger currentDivider = BigInteger.TWO;
        BigInteger currentValue = value;

        while(!currentValue.equals(BigInteger.ONE)) {
            if(currentValue.mod(currentDivider).equals(BigInteger.ZERO)){
                dividers.add(currentDivider);
                currentValue = currentValue.divide(currentDivider);
            } else {
                currentDivider = currentDivider.add(BigInteger.ONE);
            }
        }

        return dividers;
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
