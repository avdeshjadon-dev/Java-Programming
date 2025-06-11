package Array;

import java.util.Scanner;

public class FrequencyArray {
    public static int[] frequencyArray(int[] arr) {
        int[] freq = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
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
        int[] freq = frequencyArray(arr);
        System.out.println();
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.print("Enter the number to be searched : ");
            int number = sc.nextInt();
            if (freq[number] > 0) {
                System.out.println("<---YES--->");
            } else {
                System.out.println("<---NO--->");
            }
            q--;
        }

    }
}
