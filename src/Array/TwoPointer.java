package Array;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i=1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[1]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
