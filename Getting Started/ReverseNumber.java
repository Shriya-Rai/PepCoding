package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while(num!=0){
            int rem = num%10;
            num=num/10;
            System.out.print(rem);
        }
    }
}
