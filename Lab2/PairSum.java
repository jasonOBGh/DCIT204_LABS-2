/*
 * PairSum.java
 * DCIT 204 - Lab 2, Task 2
 *
 * Reads an array of integers and a target sum from the user, then uses a
 * brute-force nested loop to find a unique pair (i < j) whose values add
 * up to the target sum.
 *
 * Time Complexity: O(n^2) — every distinct pair is checked in the worst case.
 */

import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input: array size ---
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Array size must be a positive integer.");
            scanner.close();
            return;
        }

        // --- Input: array elements ---
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer(s), one per line:");
        for (int i = 0; i < n; i++) {
            System.out.print("  Element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // --- Input: target sum ---
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // --- Brute-force nested loop search for a pair ---
        boolean found = false;

        outer:
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    // --- Output: pair found ---
                    System.out.println("\n--- Result ---");
                    System.out.println("Pair found!");
                    System.out.println("Index " + i + " (value " + arr[i] + ") and "
                            + "Index " + j + " (value " + arr[j] + ")");
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break outer;
                }
            }
        }

        if (!found) {
            System.out.println("\n--- Result ---");
            System.out.println("No pair of elements sums to " + target + ".");
        }

        scanner.close();
    }
}
