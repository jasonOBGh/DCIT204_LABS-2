/*
 * FindMax.java
 * DCIT 204 - Lab 2, Task 1
 *
 * Reads an array of integers from the user and finds the maximum value
 * along with the index at which it occurs using a linear scan.
 *
 * Time Complexity: O(n) — each element is visited exactly once.
 */

import java.util.Scanner;

public class FindMax {

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

        // --- Linear scan for maximum ---
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        // --- Output ---
        System.out.println("\n--- Result ---");
        System.out.println("Maximum value : " + maxValue);
        System.out.println("Found at index: " + maxIndex);

        scanner.close();
    }
}
