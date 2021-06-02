// Print the following pattern:
// 1
// 2   3
// 4   5   6
// 7   8   9    10
// 11  12  13	14   15

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, k = 1;
        while(i<=row){
            int j= 1;
            while(j<=i){
                System.out.print(k+"\t");
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }

}
