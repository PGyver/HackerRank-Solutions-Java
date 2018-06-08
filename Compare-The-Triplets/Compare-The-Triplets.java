/*
* Problem Author: Shafaet
*
* From: https://www.hackerrank.com/challenges/compare-the-triplets/problem
*
* Note: All code outside of 'begin solution' and 'end solution' was pre-provided by the problem author on HackerRank.com
*
* Solution @author: Parker Smith
* Solution @date: 05/25/2018
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int[] solve(int[] a, int[] b) {
		//////////////////////
		// Begin Solution
		//////////////////////
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++){
            if (a[i] > b[i])
                aliceScore++;
            if (a[i] < b[i])
                bobScore++;
        }// for
        return new int[] {aliceScore,bobScore};
		//////////////////////
		// End Solution
		//////////////////////
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] a = new int[3];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[3];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = solve(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
