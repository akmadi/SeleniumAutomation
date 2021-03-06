package com.anil;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

    	
    	LocalDate dt = LocalDate.of(year, month, day);
    	
    	System.out.println(dt.getDayOfWeek().toString());

    	return dt.getDayOfWeek().toString();
    	

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

Scanner sc = new Scanner(System.in);
int month = sc.nextInt();

int day = sc.nextInt();

int year = sc.nextInt();


System.out.println(Result.findDay(month,day,year));


    	
    }
}
