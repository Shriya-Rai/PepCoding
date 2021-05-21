package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i=1;
        while(i*i<=num){
            System.out.println(i*i);
            i++;
        }
    }
}
