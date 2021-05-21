package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        int digit = 0;
        int temp = num;
        while(temp!=0){
            temp = temp/10;
            digit++;
        }
        k = k%digit;
        if(k<0){
            k = k+digit;
        }
        int i=1, divisor=1 ,multiplier=1;
        while(i<=digit) {
            if (i <= k) {
                divisor *= 10;
            } else {
                multiplier *= 10;
            }
            i++;
        }
        int quotient = num/divisor;
        int reminder = num%divisor;
        int rotate = reminder*multiplier+quotient;
        System.out.println(rotate);
        }

    }

