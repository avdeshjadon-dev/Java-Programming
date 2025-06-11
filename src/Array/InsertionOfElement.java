package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionOfElement {
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
        int[] newArray = new int[arr.length + 1];
        newArray = Arrays.copyOf(arr, arr.length+1);

        System.out.print("Enter the element you want to insert : ");
        int element = sc.nextInt();
        System.out.println();
        System.out.print("Enter the posiotion from 0 to " + arr.length + " : ");
        int indexnumber = sc.nextInt();
        System.out.println();

        for (int i = newArray.length-1; i >= indexnumber; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[indexnumber] = element;
        System.out.print("Array After insertion : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }


    }

}
