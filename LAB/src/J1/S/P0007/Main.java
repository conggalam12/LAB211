/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0007;

import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
        boolean adjMatrix[][] = createMatrix(6);
        addEdge(adjMatrix);
        int startPoint = inputNumber(1,5,"Enter the start point:");
        int endPoint = inputNumber(1,5,"Enter the end point:");
        displayResult(startPoint,endPoint,adjMatrix);
    }

    private static boolean[][] createMatrix(int size) {
        boolean matrix[][] = new boolean[size][size];
        return matrix ;
    }

    private static void addEdge(boolean[][] adjMatrix) {
        adjMatrix[1][4] = adjMatrix[4][1]=true;
        adjMatrix[2][4] = adjMatrix[4][2]=true;
        adjMatrix[2][5] = adjMatrix[5][2]=true;
        adjMatrix[3][5] = adjMatrix[3][5]=true;
        adjMatrix[4][5] = adjMatrix[5][4]=true;
    }

    private static int inputNumber(int a, int b, String msg) {
        int value;
        String input = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(msg + " ");
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input can't be empty");
                continue;
            }
            try {
                value = Integer.parseInt(input);
                if(value<a || value>b){
                    System.out.println("Your choice is number between "+a+" to " +b);
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }

    private static void displayResult(int startPoint, int endPoint, boolean[][] adjMatrix) {
       if(adjMatrix[startPoint][endPoint]==true){
           System.out.println("This is an edge");
       }
       else{
           System.out.println("This is not an edge");
       }
    }
}
