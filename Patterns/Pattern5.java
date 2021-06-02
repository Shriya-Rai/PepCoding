//Program to print the following pattern:
//              *
//          *	*   *
//      *   *	*   *   *
//          *	*   *
//              *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i=1,k=1;
        while(i<=row){
            int space=row/2;
            while(space>=k){
                System.out.print("\t");
                space--;
            }
            int j=1;
            while(j<=2*k-1){
                System.out.print("*\t");
                j++;
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
