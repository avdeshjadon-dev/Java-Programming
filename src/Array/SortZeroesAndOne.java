// ------------------- 🔹 Sort 0's and 1's in Array 🔹 -------------------
//
// 💡 Write a Java program to sort an array containing only 0's and 1's
// such that all 0's appear before all 1's.
// Use the two-pointer approach to solve the problem in a single pass.
//
// 🧠 Maintain two pointers:
// - Left pointer starts from the beginning
// - Right pointer starts from the end
// Swap elements if left is 1 and right is 0,
// otherwise move pointers accordingly.
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Original Array : 0 1 1 0 0 1 1 1 0 0 0 0 1 0 1 0 1 0 0 1
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Sorted Array   : 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1


package Array;

import java.util.Arrays;

public class SortZeroesAndOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                if (arr[left] == 0) left++;
                if (arr[right] == 1) right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
