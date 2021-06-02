// Print the following pattern:
//  *	*   *	    *
//          *	    *
//  *	*   *	*   *
//  *	    *
//  *	    *	*   *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1;
        while(i<=row){
            int j = 1;
            while(j<=row){
                if ((i>1 && i<=row/2 && j<=row/2) || (j>(row/2)+1 && j<row && i<=row/2) ||
                        (i>(row/2)+1 && j>1 && j<=row/2) || ((i>row/2+1) && j>(row/2)+1 && i<row)) {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
