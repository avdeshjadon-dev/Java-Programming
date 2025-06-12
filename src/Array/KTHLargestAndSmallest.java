// ------------------- 🔹 Kᵗʰ Smallest & Largest in Array 🔹 -------------------
//
// 💡 Write a Java program to find the Kᵗʰ smallest and Kᵗʰ largest elements in an array.
// The user should input the array elements and the value of K.
// First, sort the array and then find:
// - Kᵗʰ smallest → element at index (K - 1)
// - Kᵗʰ largest  → element at index (length - K)
//
// 🧠 Make sure to handle user input and print the sorted array for reference.
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Enter the size of Array : 6
// Enter the 1 element of the array : 10
// Enter the 2 element of the array : 50
// Enter the 3 element of the array : 30
// Enter the 4 element of the array : 20
// Enter the 5 element of the array : 70
// Enter the 6 element of the array : 60
//
// Original Array is : 10 50 30 20 70 60
// Enter which nth Smallest and Largest number do u want from Array : 3
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Sorted Array : 10 20 30 50 60 70
// Smallest : 30
// Largest : 50


package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KTHLargestAndSmallest {
    static int[] KTHLargestAndSmallest(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.print("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] ans = {arr[n - 1], arr[arr.length - n]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Original Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter which nth Smallest and Largest number do u want from Array : ");
        int n = sc.nextInt();
        int[] ans = KTHLargestAndSmallest(arr, n);
        System.out.println("Smallest : " + arr[n - 1]);
        System.out.println("Largest : " + arr[arr.length - n]);
    }
}
