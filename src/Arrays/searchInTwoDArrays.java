package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class searchInTwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

//        allocating the size of matrix by rows and columns
        int[][] matrix = new int[rows][cols];

        System.out.println("Insert the value for Matrix: ");
//        Inserting the values into matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
//                Location of matrix
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix look like this: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the value to find the index of matrix: ");
        int key = sc.nextInt();

//      Search for a given number in matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if( matrix[i][j] == key){
                    System.out.println("The location of key is found in matrix: ("+i+ ", " +j+ ")" );

                }
            }
        }
    }
}
