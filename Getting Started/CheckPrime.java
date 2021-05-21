package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int i = 1;
        while (i <= t) {
            int num = scn.nextInt();
            int j = 2;
            while (j * j <= num) {
                if (num % j == 0){
                    break;
                }
                j++;
            }
            if (j*j>num)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
            i++;
        }
    }
}
