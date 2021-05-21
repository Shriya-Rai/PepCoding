package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0,b=1,i=1;
        while(i<=n){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
