package Array;

import java.util.Scanner;

public class ArrayManupulation {
    static int UniqueElement(int[] arr) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return index;
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
        int result = UniqueElement(arr);
        System.out.println();
        System.out.println("Unique Element is : " + result);

    }
}
