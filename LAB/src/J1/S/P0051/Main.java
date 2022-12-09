/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0051;

import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
        Manager mng  = new Manager();
        do {            
            menu();
            int choice = InputNumber("Please choice one option:",1,3);
            switch(choice){
                case 1 :
                    mng.NormalCalculator();
                    break;
                case 2 :
                    mng.BMICalculator();
                    break;
                case 3 :
                    return ;
            }
        } while (true);
    }

    private static void menu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }

    private static int InputNumber(String msg, int a, int b) {
        int value;
        String input = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(msg + " ");
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input can't be empty");
                continue;
            }
            try {
                value = Integer.parseInt(input);
                if(value<a || value>b){
                    System.out.println("Your choice is number between 1 to 3");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }
}
