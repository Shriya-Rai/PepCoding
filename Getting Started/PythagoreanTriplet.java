package com.company.ProgrammingBasics.GettingStarted;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        if(Math.pow(num1,2)+Math.pow(num2,2)==Math.pow(num3,2)){
            System.out.println("true");
        }
        else if(Math.pow(num2,2)+Math.pow(num3,2)==Math.pow(num1,2)){
            System.out.println("true");
        }
        else if(Math.pow(num1,2)+Math.pow(num3,2)==Math.pow(num2,2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

