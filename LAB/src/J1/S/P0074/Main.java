/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0074;

import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            menu();
            System.out.print("Your choice : ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("------ Addition ------");
                System.out.print("Enter the row matrix " + 1 + " :");
                int row = sc.nextInt();
                System.out.print("Enter the column matrix " + 1 + " :");
                int column = sc.nextInt();
                int matrix1[][] = InputMatrix(1, row, column);
                int matrix2[][] = InputMatrixSameSize(2, row, column);
                addMatrix(matrix1, matrix2);
            }
            if (choice == 2) {
                System.out.println("------ Subtraction ------");
                System.out.print("Enter the row matrix " + 1 + " :");
                int row = sc.nextInt();
                System.out.print("Enter the column matrix " + 1 + " :");
                int column = sc.nextInt();
                int matrix1[][] = InputMatrix(1, row, column);
                int matrix2[][] = InputMatrixSameSize(2,row, column);
                subtraction(matrix1, matrix2);
            }
            if (choice == 3) {
                System.out.println("------ Multiplication ------");
                System.out.print("Enter the row matrix " + 1 + " :");
                int row = sc.nextInt();
                System.out.print("Enter the column matrix " + 1 + " :");
                int column = sc.nextInt();
                int matrix1[][] = InputMatrix(1, row, column);
                int matrix2[][] = InputMatrixMul(2,row,column);
                multiplication(matrix1, matrix2);
            }
            if (choice == 4) {
                break;
            }
        } while (true);

    }

    private static int[][] InputMatrix(int k,int row,int column) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int a = i + 1;
                int b = j + 1;
                System.out.print("Enter Matrix" + k + "[" + a + "][" + b + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static void addMatrix(int[][] matrix1, int[][] matrix2) {
        int matrix[][] = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        display(matrix1);
        System.out.println("+");
        display(matrix2);
        System.out.println("=");
        display(matrix);
    }

    private static void subtraction(int[][] matrix1, int[][] matrix2) {
        int matrix[][] = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];

            }
        }
        display(matrix1);
        System.out.println("-");
        display(matrix2);
        System.out.println("=");
        display(matrix);
    }

    private static void multiplication(int[][] matrix1, int[][] matrix2) {
        int matrix[][] = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        display(matrix1);
        System.out.println("*");
        display(matrix2);
        System.out.println("=");
        display(matrix);
    }

    private static void menu() {
        System.out.println("1.Addition Matrix");
        System.out.println("2.Subtraction Matrix");
        System.out.println("3.Multiplication Matrix");
        System.out.println("4.Quit");
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");

            }
            System.out.println("");
        }
    }

    private static int[][] InputMatrixMul(int i, int row, int column) {
        Scanner sc = new Scanner(System.in);
        int rowMatrix  = InputSame("Enter the row matrix "+i+" :", column);
        System.out.print("Enter the column matrix " + i + " :");
        int columnMatrix = sc.nextInt();
        int matrix[][] = InputMatrix(i, rowMatrix, columnMatrix);
        return matrix ;
    }
    
    private static int[][] InputMatrixSameSize(int i, int row, int column) {
        int rowMatrix  = InputSame("Enter the row matrix "+i+" :", row);
        int columnMatrix = InputSame("Enter the column matrix "+i+" :", column);
        int matrix[][] = InputMatrix(i, rowMatrix, columnMatrix);
        return matrix ;
    }
    private static int InputSame(String msg,int value){
        Scanner sc = new Scanner(System.in);
        int sameValue ;
        do {            
            System.out.print(msg);
            sameValue = sc.nextInt();
            if(sameValue!=value){
                continue;
            }
            return sameValue ;
        } while (true);    
    }
}
