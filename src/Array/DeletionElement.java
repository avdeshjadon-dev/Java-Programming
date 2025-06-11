package Array;

import java.util.Scanner;

public class DeletionElement {
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
        System.out.print("Enter the element you want to remove : ");
        int removeElement = sc.nextInt();
        System.out.println();
        int foundElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (removeElement == arr[i]) {
                foundElement = i;
                break;
            }
        }
        if (foundElement == -1) {
            System.out.println("No element were found");
        } else {
            System.out.print("Array after removal of element " + removeElement + " : ");
            for (int i = foundElement; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
