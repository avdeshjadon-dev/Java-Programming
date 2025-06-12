// ------------------- 🧮 2D Array Input & Output -------------------
//
// 💡 Write a Java program to:
// - Declare a 2D array of 3 rows and 4 columns
// - Take input for each element from the user
// - Print the 2D array in matrix form
//
// 🧠 You will:
// - Use nested loops to take input row-wise
// - Use nested loops again to display the array as a table
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Enter the elements of 2D array:
// Enter the element of row 1
// Enter the 1 element: 1
// Enter the 2 element: 2
// Enter the 3 element: 3
// Enter the 4 element: 4
//
// ...
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12


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
