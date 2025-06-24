package Array;

import java.util.Arrays;
public class SortZeroesAndOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp=arr[left];
            } else {
                if (arr[left] == 0) left++;
                if (arr[right] == 1) right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
