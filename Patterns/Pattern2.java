//Program to print the following pattern:
// *	*	*	*	*
// *	*	*	*
// *	*	*
// *	*
// *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1;
        while(i<=row){
            int j=1;
            while(j<=row-i+1){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
