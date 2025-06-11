package Array;

import java.util.Scanner;

public class RotateArrayKTHTime {
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
        System.out.print("Enter the rotation number: ");
        int rotateNumber = sc.nextInt();
        rotateNumber = rotateNumber % num;
        if (rotateNumber < 0) {
            rotateNumber += num;
        }
        int[] rotated = new int[num];
        for (int i = 0; i < rotateNumber; i++) {
            rotated[i] = arr[num - rotateNumber + i];
        }
        for (int i = rotateNumber; i < num; i++) {
            rotated[i] = arr[i - rotateNumber];
        }
        System.out.print("Rotated Array is: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }
    }
}
