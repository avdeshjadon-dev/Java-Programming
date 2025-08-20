// ------------------- 🔍 Equal Sum Partition using Prefix Sum 🔍 -------------------
//
// 💡 Write a Java program to check if an array can be partitioned into two parts
// such that the sum of elements in both parts is equal.
// Use the **Prefix Sum** approach.
//
// 🧠 You will:
// - Input the array from the user
// - Calculate total sum of elements
// - Check if a prefix and suffix have equal sum at any point
// - Output true or false based on whether such a partition exists
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Enter the size of the array: 5
// Enter all the elements of the array: 1 2 3 3 2
//
// Original Array is : 1 2 3 3 2
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Can be partitioned into two equal sum parts: true
//

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
        System.out.println("Equal partition possible : "+equalSumPartition(arr));
    }
}
