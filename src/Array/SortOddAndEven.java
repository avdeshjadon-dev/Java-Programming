package Array;

import java.util.Arrays;

public class SortOddAndEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int j = 0;
        int k = 0;
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newarr[k] = arr[i];
                k++;
            } else {
                newarr[arr.length - 1 - j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
