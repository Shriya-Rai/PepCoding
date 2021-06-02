// Print the following pattern:
//  *	*   *   *   *
//	*	*
//	    *
//	*   *	*
//  *	*   *	*   *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, k = row/2;
        while(i<=row){
            int sp = 1;
            while(sp<=(row/2)-k){
                System.out.print("\t");
                sp++;
            }
            int j = 1;
            while(j<=2*k+1){
                if(i>1 && i<=row/2 && j>1 && j<2 * k + 1) {
                        System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
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
