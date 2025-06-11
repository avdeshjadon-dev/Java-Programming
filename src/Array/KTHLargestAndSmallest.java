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
