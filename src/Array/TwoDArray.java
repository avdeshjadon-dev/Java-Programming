package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of 2D array : ");
        for(int i=0;i<3;i++){
            System.out.println("Enter the element of row "+(i+1));
            for(int j=0;j<4;j++){
                System.out.print("Enter the "+(j+1)+" element : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
