// ------------------- 🔹 Insert an Element into Array 🔹 -------------------
//
// 💡 Write a Java program to insert an element into an existing array at a specific index.
// The array should shift elements to the right to make space for the new value.
//
// 🧠 You will:
// - Take array input from the user
// - Ask for the new element and the index to insert it at
// - Print the new array after insertion
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Enter the size of Array : 4
// Enter the 1 element of the array : 10
// Enter the 2 element of the array : 20
// Enter the 3 element of the array : 30
// Enter the 4 element of the array : 40
//
// Original Array is : 10 20 30 40
// Enter the element you want to insert : 25
// Enter the position from 0 to 4 : 2
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Array After insertion : 10 20 25 30 40


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
