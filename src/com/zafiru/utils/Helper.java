package com.zafiru.utils;

import com.zafiru.models.Node;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<BigInteger> getProducts(BigInteger value) {
        List<BigInteger> products = new ArrayList<>();
        BigInteger currentDivider = BigInteger.TWO;
        BigInteger currentValue = value;

        while (!currentValue.equals(BigInteger.ONE)) {
            if (currentValue.mod(currentDivider).equals(BigInteger.ZERO)) {
                products.add(currentDivider);
                currentValue = currentValue.divide(currentDivider);
            } else {
                currentDivider = currentDivider.add(BigInteger.ONE);
            }
        }

        return products;
    }

    public static List<BigInteger> getDividers(BigInteger value) {
        List<BigInteger> dividers = new ArrayList<>();

        for (BigInteger i = BigInteger.ONE; i.compareTo(value) <= 0; i = i.add(BigInteger.ONE)) {
            if (value.mod(i).equals(BigInteger.ZERO)) {
                dividers.add(i);
            }
        }

        return dividers;
    }

    public static List<Long> getDividers(long value) {
        List<Long> dividers = new ArrayList<>();

        for (long i = 1; i <= value; i++) {
            if (value % i == 0) {
                dividers.add(i);
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

    public static BigInteger combination(BigInteger x, BigInteger y) {
        return factorial(x).divide(factorial(x.subtract(y)).multiply(factorial(y)));
    }

    public static BigInteger factorial(BigInteger value){
        if(value.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        } else {
            return value.multiply(factorial(value.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger sumOfDigits(BigInteger value){
        BigInteger result = BigInteger.ZERO;
        String strValue = value.toString();
        for (int i = 0; i < strValue.length(); i++) {
            result = result.add(new BigInteger(String.valueOf(strValue.charAt(i))));
        }
        return result;
    }
}
