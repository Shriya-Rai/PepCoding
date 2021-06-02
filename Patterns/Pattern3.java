//Program to print the following pattern:
// 				*
//			*	*
//		*	*	*
//	 *	*	*	*
//*	 *	*	*	*
package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i=1;
        while(i<=row){
            int space = 1,j=1;
            while(space<=row-i){
                System.out.print("\t");
                space++;
            }
            while(j<=i){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
