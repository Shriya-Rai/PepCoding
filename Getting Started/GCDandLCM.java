package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int divisor = num1;
        int divident = num2;
        while(divident%divisor!=0){
            int remainder = divident%divisor;
            divident = divisor;
            divisor = remainder;
        }
        int gcd = divisor;
        int lcm = num1*num2/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
