// Print the following pattern:
// 	   *
//	   *   *
// *   *   *   *   *
//	   *   *
//	   *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, k = 1;
        while(i<=row){
            int sp = 1;
            while(sp<=row/2){
                if(i==(row/2)+1){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
                sp++;
            }
            int j = 1;
            while(j<=k){
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
