package Array;

import java.util.Scanner;

class Solution {
    public static int pivotIndex(int[] arr) {
        int num = arr.length;
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < num; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println();
        System.out.print("Enter all the " + num + " elements of the array : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is : ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.pivotIndex(arr);
        System.out.println("Pivot Index is: " + Solution.pivotIndex(arr));
    }
}
