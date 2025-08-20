package Array;

import java.util.Scanner;

public class PrefixSumEqualSumPartition {
    static Scanner sc = new Scanner(System.in);

    static int[] CreateArray(int num) {
        int[] arr = new int[num + 1];
        System.out.print("Enter all the elements of the array: ");
        for (int i = 1; i <= num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static void PrintArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffSum=totalSum-prefSum;
            if (prefSum == suffSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = CreateArray(num);
        System.out.print("Original Array is : ");
        PrintArray(arr);
        System.out.println();
    }
}
