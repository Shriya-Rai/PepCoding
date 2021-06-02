// Print the following pattern:
// 1
// 1   1
// 1   2   1
// 1   3   3	1
// 1   4   6	4    1

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 0;
        while(i<row){
            int j = 0, val = 1;
            while(j<=i){
                System.out.print(val+"\t");
                val = val * (i-j) / (j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
