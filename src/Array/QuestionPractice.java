package Array;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionPractice {
    public static void main(String[] args) {
        System.out.println("hello world");

//    void display(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {13, 54, 36, 8, 34, 9, 49, 8, 644, 564, 67, 334, 87};
//        for(int i=0;i<arr.length;i++){
//
//        }

//        System.out.println(avdesh.length);

//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//
//        }
//        int [] arr={1,2,2,3,4,5,6,7,8,9};
//        //check where this array is sorted or not
//        boolean check=true; //sorted
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<arr[i-1]){
//                check=false;
//            }
//        }
//        if(check){
//            System.out.println("1");
//        }else {
//            System.out.println("0");
//        }
//        int x = sc.nextInt();
//        int sum=0;
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>x){
//                sum+=arr[i];
//            }
//        }
//        System.out.println("Sum : "+sum);
//        int lastindex=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                lastindex=i;
//            }
//        }
//        System.out.println(lastindex);
//        int count=0;
//        boolean found =false;
//        for(int i=arr.length-1;i>=0;i--){
//            if(arr[i]==x){
//                System.out.println(i);
//                break;
//            }
//        }
//        int a=10;
//        int b=20;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);
//        int [] arr={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<arr.length/2;i++){
//            int[] temp=new int[1];
//            temp[0]=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp[0];
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int i=0;i< (arr.length-1)/2;i++){
//            arr[i]=arr[arr.length-1-i];
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        int[] reverseArray=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            reverseArray[i]=arr[arr.length-1-i];
//        }
//        System.out.print("Original Array : ");
//        for (int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.print("Reverse Array : ");
//        for(int i:reverseArray){
//            System.out.print(i+" ");
//        }
//        int a=10;
//        int b=20;
//        a=a+b;
//        b=a-b;
//
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println();

//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 4, 9, 23, 898};
//        int number=-1;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    number=arr[i];
//                }
//            }
//        }
//        System.out.println(number);
//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (secondMax < arr[i] && arr[i] != max) {
//                secondMax = arr[i];
//            }
//        }
//        System.out.println("max : " + max);
//        System.out.println("SecondMax : " + secondMax);
//        int uniqueNumber = -1;
//        for (int i = 0; i < arr.length; i++) {
//            boolean isUniques = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j] && i != j) {
//                    isUniques = false;
//                }
//            }
//            if (isUniques) {
//                System.out.print(arr[i]);
//            }
//
//        }

//        int x=sc.nextInt();
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                for(int k=j+1;k<arr.length;k++){
//                    if(arr[i]+arr[j]+arr[k]==x){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);

//        QuestionPractice obj=new QuestionPractice();
//        obj.display(arr);
//        int[] copyarr= Arrays.copyOf(arr,arr.length);
//        obj.display(copyarr);
//
//
//        obj.display(copyarr);
//        obj.display(arr);
        //changind some values of coppy array

//        copyarr[0]=678;
//        copyarr[1]=44;
//        copyarr[3]=4567;


//        int num = sc.nextInt();
//        boolean found = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num) {
//                System.out.println(num + " found at index " + i);
//                found = true;
////                break;
//            }
//        }
//        if (!found) {
//            System.out.println("-1");
//        }
//        int max = Integer.MIN_VALUE;
//        int secondmax = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > secondmax && arr[i] != max) {
//                secondmax = arr[i];
//            }
//        }
//        System.out.println("Max : " + max);
//        System.out.println("SecondMax : " + secondmax);
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//        }
//        System.out.println("Sum : "+sum);
    }
}

