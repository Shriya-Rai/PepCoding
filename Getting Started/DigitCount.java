package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        System.out.println(digit);
    }
}
