// ------------------- 🔹 Arrange Even and Odd Numbers in Array 🔹 -------------------
//
// 💡 Write a Java program to rearrange the elements of an array
// so that all even numbers appear first, followed by all odd numbers.
// Use the two-pointer approach to do it in-place without using extra space.
//
// 🧠 Approach:
// - Maintain two pointers: one at the start (left) and one at the end (right).
// - If left is odd and right is even → swap them.
// - If left is already even → move left pointer forward.
// - If right is already odd → move right pointer backward.
// - Continue until left < right.
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Original Array: 1 2 3 4 5 6 7 8 9 10
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Rearranged Array: 10 2 8 4 6 5 7 3 9 1


package Array;

import java.util.Arrays;

public class EvenOddSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
