// ------------------- 🔹 Sort Odd and Even Numbers in Array 🔹 -------------------
//
// 💡 Write a Java program to sort an array such that all even numbers appear
// before all odd numbers using the **two-pointer approach** in a single pass.
//
// 🧠 Logic:
// - Use two pointers: `left` starts from the beginning, `right` from the end
// - If `left` is odd and `right` is even → swap them
// - If `left` is even → move `left` forward
// - If `right` is odd → move `right` backward
//
// 🧾 SAMPLE INPUT:
// Original Array : 1 2 3 4 5 6 7 8 9 10
//
// 📤 SAMPLE OUTPUT:
// Sorted Array   : 10 2 8 4 6 5 7 3 9 1 (Even numbers on left, Odd numbers on right)


package Array;

import java.util.Arrays;

public class SortOddAndEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Sorted Array   : " + Arrays.toString(arr));
    }
}
