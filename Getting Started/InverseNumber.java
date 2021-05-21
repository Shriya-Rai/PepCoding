package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int op = 1, inverse = 0;
        while(num!=0){
            int od = num%10;
            int ip = od;
            int id = op;
            inverse += (int) (id*Math.pow(10,ip-1));
            num = num/10;
            op++;
        }
        System.out.println(inverse);
    }
}
