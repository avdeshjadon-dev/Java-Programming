package JavaSelfPractice;

import java.util.Arrays;



public class practice  {

     static  int[] kthLargestAndSmallest(int[] arr,int num){
         Arrays.sort(arr);
         int[] ans={arr[num-1],arr[arr.length-num]};
         return ans;
     }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,435,345,7,3,2,5475678,54};
        int num=2;
        int[] result=kthLargestAndSmallest(arr,num);
        System.out.println(Arrays.toString(result));
    }
}
