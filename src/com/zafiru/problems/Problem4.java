package com.zafiru.problems;

public class Problem4 extends Problem {

    public Problem4() {
        super(4, "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.\n" +
                "\n" +
                "Find the largest palindrome made from the product of two 3-digit numbers.");
    }

    boolean isPalindrome(int value){
        String strProduct = String.valueOf(value);

        char[] digits = strProduct.toCharArray();

        for(int k = 0; k < digits.length; k++) {
            if(k == (digits.length / 2)){
                break;
            } else if (digits[k] != digits[digits.length - 1 - k]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String answer() {

        int largestPalindrome = 0;

        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPalindrome(i * j) && (i * j) > largestPalindrome){
                    largestPalindrome = i * j;
                }
            }
        }

        return String.valueOf(largestPalindrome);
    }
}
