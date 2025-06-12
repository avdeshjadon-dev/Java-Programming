package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Answer is : " + RemoveDuplicateElements(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int RemoveDuplicateElements(int[] arr) {
        int count = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[count]) {
                count++;
                arr[count] = arr[j];
            }
        }
        return count + 1;
    }
}
