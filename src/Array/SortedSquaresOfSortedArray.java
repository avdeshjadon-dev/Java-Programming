// ------------------- 🧮 Sorted Squares of Sorted Array -------------------
//
// 💡 Write a Java program to:
// - Take a sorted array (can contain negative numbers).
// - Create a new array with squares of each number.
// - Return the result in non-decreasing (sorted) order.
//
// 🧠 You will:
// - Use the two-pointer technique (left and right).
// - Compare absolute values from both ends.
// - Place the larger square at the end of the result array and move inward.
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Input: [-10, -3, -2, 1, 4, 5]
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Output: [1, 4, 9, 16, 25, 100]

package Array;

import java.util.Arrays;

public class SortedSquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        int[] ans = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int index = arr.length - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
