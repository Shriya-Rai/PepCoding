//Program to print the following pattern:
//         *	*	*	   *   *	*
//         *    *			   *	*
//         *						*
//         *	*			   *	*
//         *	*	*	   *   *	*

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i=1,k=1;
        while(i<=row){
            int j=row/2 + 1;
            while(j>=k){
                System.out.print("*\t");
                j--;
            }
            int space=1;
            while(space<=2*k-1){
                System.out.print("\t");
                space++;
            }
            j=row/2 + 1;
            while(j>=k){
                System.out.print("*\t");
                j--;
            }
            if(i<=row/2){
                k++;
            }
            else{
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
