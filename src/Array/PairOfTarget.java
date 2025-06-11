package Array;

import java.util.Scanner;

public class PairOfTarget {
    static int[] PairsOfTargetedNumber(int[] arr, int targetedNumber) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == targetedNumber) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Enter the target number: ");
        int targetedNumber = sc.nextInt();
        int[] result = PairsOfTargetedNumber(arr, targetedNumber);
        if (result.length == 0) {
            System.out.println("No pair found with the given target.");
        } else {
            System.out.println("Pair found: " + result[0] + " and " + result[1]);
        }
    }
}
