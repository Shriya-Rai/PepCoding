// Print the following pattern:
// *
//	 *
//	       *
//		     *
//			   *

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1;
        while(i<=row){
            int sp=1;
            while(sp<i){
                System.out.print("\t");
                sp++;
            }
            System.out.println("*");
            i++;
        }
    }
}
