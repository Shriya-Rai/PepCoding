// Print the following pattern:
//         1
//     2   3   2
// 3   4   5   4   3
//     2   3   2
//         1

package com.company.ProgrammingBasics.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int i = 1, k = 1;
        while (i <= row) {
            int sp = 1;
            while (sp <= (row / 2) - k + 1) {
                System.out.print("\t");
                sp++;
            }
            int j = 1, col = k;
            while (j <= 2 * k - 1) {
                System.out.print(col + "\t");
                if (j < k) {
                    col++;
                } else {
                    col--;
                }
                j++;
            }
            if (i <= row / 2) {
                k++;
            } else {
                k--;
            }
            System.out.println();
            i++;
        }
    }
}


