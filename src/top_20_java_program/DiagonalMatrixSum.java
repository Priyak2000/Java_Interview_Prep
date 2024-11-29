package top_20_java_program;

import java.util.Scanner;

public class DiagonalMatrixSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int matrix[][] = new int[row][col];
        
        System.out.println("Enter the values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        int sumOfDiagonal1 = 0;
        int sumOfDiagonal2 = 0;
        for (int i = 0; i < row; i++) {
            sumOfDiagonal1 += matrix[i][i];
            sumOfDiagonal2 += matrix[i][row - i - 1];
        }
        
        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Sum of Main Diagonal: " + sumOfDiagonal1);
        System.out.println("Sum of Anti-Diagonal: " + sumOfDiagonal2);
        System.out.println("Total Sum of Both Diagonals: " + (sumOfDiagonal1 + sumOfDiagonal2));
        scan.close();
    }
}
