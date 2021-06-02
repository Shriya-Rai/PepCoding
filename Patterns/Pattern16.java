// Print the following pattern:
// 1								1
// 1   2						2	1
// 1   2    3			     3	  2	1
// 1   2    3	 4		4    3	  2	1
// 1   2    3	 4	5	4    3	  2	1

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1;
        while(i<=row){
            int j = 1, col = 1;
            while(j<=2*row-1){
                if (col<=i){
                    System.out.print(col+"\t");
                }
                else{
                    System.out.print("\t");
                }
                if (j<row){
                    col++;
                }
                else{
                    col--;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
