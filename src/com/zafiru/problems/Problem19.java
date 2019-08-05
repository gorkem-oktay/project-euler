package com.zafiru.problems;

import com.zafiru.problems.Problem;
import com.zafiru.utils.Helper;

public class Problem19 extends Problem {

    public Problem19() {
        super(19, "You are given the following information, but you may prefer to do some research for yourself.\n" +
                "\n" +
                "1 Jan 1900 was a Monday.\n" +
                "Thirty days has September,\n" +
                "April, June and November.\n" +
                "All the rest have thirty-one,\n" +
                "Saving February alone,\n" +
                "Which has twenty-eight, rain or shine.\n" +
                "And on leap years, twenty-nine.\n" +
                "A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.\n" +
                "How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?");
    }

    @Override
    public String answer() {

        int[] beginnings = {1, 32, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int[] beginningsWithLeap = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};

        int day = 7;
        int year = 1900;

        while(year < 2000){

            int[] daysToCheck = Helper.isLeapYear(year) ? beginningsWithLeap : beginnings;

            year++;
        }

        return "";
    }
}
