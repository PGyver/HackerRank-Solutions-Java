/*
* Problem Author: vatsalchanana
*
* From: https://www.hackerrank.com/challenges/diagonal-difference/problem
*
* Note: All code outside of 'begin solution' and 'end solution' was pre-provided by the problem author on HackerRank.com
*
* Solution @author: Parker Smith
* Solution @date: 06/09/2018
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        //////////////////////
		// Begin Solution
		//////////////////////
        int numElements = a[0].length;
        int sumDiag1 = 0;
        int sumDiag2 = 0;

        for (int i = 0; i < numElements; i++){
            sumDiag1 = sumDiag1 + a[i][i];
        }
        for (int i = 0, j = numElements - 1; i < numElements; i++, j--){
            sumDiag2 = sumDiag2 + a[i][j];
        }
        return Math.abs(sumDiag1-sumDiag2);
        //////////////////////
		// Begin Solution
		//////////////////////
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
