package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        while (i <= n) {
            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (j * j > i) {
                System.out.println(i);
            }
            i++;
        }
    }
}
