// Print the following pattern:
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
    }
}
