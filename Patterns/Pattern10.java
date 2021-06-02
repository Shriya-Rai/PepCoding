// Print the following pattern:
//           *
//	*	   *
// *		        *
//	*	   *
//	     *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, k = row/2+1;
        while(i<=row){
            int j = 1, col = 1;
            while(j<=row){
                if (col==k){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

                if(j<=row/2){
                    col++;
                }
                else{
                    col--;
                }
                j++;
            }
            if(i<=row/2){
                k--;
            }
            else{
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
