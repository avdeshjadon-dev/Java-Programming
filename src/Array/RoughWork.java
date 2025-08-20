package Array;

import java.util.Scanner;

public class RoughWork {

    static Scanner sc = new Scanner(System.in);

    static int[] CreateArray(int num) {
        int[] arr = new int[num + 1];
        System.out.print("Enter all the elements of the array: ");
        for (int i = 1; i <= num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void PrintArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] PrefixArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = CreateArray(num);
        System.out.print("Original Array is : ");
        PrintArray(arr);
        System.out.println();
        int q = sc.nextInt();
        int[] pref = PrefixArray(arr);
        System.out.print("Prefix Sum is : ");
        PrintArray(pref);


    }
}
