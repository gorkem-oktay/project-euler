package com.zafiru.problems;

public class Problem17 extends Problem {

    public Problem17() {
        super(17, "If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.\n" +
                "\n" +
                "If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?\n" +
                "\n" +
                "\n" +
                "NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of \"and\" when writing out numbers is in compliance with British usage.");
    }

    @Override
    public String answer() {
        int[] firstNineteenNumbers = {
                0,// 0  zero
                3,// 1  one
                3,// 2  two
                5,// 3  three
                4,// 4  four
                4,// 5  five
                3,// 6  six
                5,// 7  seven
                5,// 8  eight
                4,// 9  nine
                3,// 10 ten
                6,// 11 eleven
                6,// 12 twelve
                8,// 13 thirteen
                8,// 14 fourteen
                7,// 15 fifteen
                7,// 16 sixteen
                9,// 17 seventeen
                8,// 18 eighteen
                8,// 19 nineteen
        };

        int[] decimals = {
                0,// 0
                0,// 10
                6,// 20 twenty
                6,// 30 thirty
                5,// 40 forty
                5,// 50 fifty
                5,// 60 sixty
                7,// 70 seventy
                6,// 80 eighty
                6,// 90 ninety
        };

        int sizeThousand = 11;
        int sizeHundred = 7;
        int sizeAnd = 3;

        int sum = sizeThousand;

        for (int i = 1; i < 1000; i++) {
            int hundredIndex = i / 100;
            int hundredLength = 0;
            if (hundredIndex != 0) {
                hundredLength = firstNineteenNumbers[hundredIndex] + sizeHundred;
                hundredLength += (i % 100 == 0 ? 0 : sizeAnd);
            }

            int hundredRemoved = i % 100;
            int decimalIndex = hundredRemoved / 10;
            int decimalLength = 0;

            if(decimalIndex < 2){
                decimalLength = firstNineteenNumbers[hundredRemoved];
            } else {
                decimalLength = firstNineteenNumbers[hundredRemoved % 10] + decimals[decimalIndex];
            }

            sum += hundredLength + decimalLength;
        }

        return String.valueOf(sum);
    }
}
