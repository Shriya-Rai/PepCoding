// Print the following pattern:
// 0
// 1   1
// 2   3    5
// 8   13   21	 34
// 55  89   144	 233  377

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, a = 0, b = 1 ;
        while(i<=row){
            int j = 1;
            while(j<=i){
                System.out.print(a+"\t");
                int c = a+b;
                b = a;
                a = c;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
