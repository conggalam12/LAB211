/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0051;

import static java.lang.Float.parseFloat;
import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Manager {

    void NormalCalculator() {
        System.out.println("----- Normal Calculator -----");
        int count = 1;
        float numberFirst;
        float numberSecond;
        float Memory = 0;
        String Operator;
        do {
            if (count == 1) {
                numberFirst = intputNumber("Enter number:");
                count++;
            } else {
                numberFirst = Memory;
            }
            Operator = inputOperator("Enter Operator:");
            switch (Operator) {
                case "+":
                    numberSecond = intputNumber("Enter number:");
                    Memory = numberFirst + numberSecond;
                    break;
                case "-":
                    numberSecond = intputNumber("Enter number:");
                    Memory = numberFirst - numberSecond;
                    break;
                case "*":
                    numberSecond = intputNumber("Enter number:");
                    Memory = numberFirst * numberSecond;
                    break;
                case "^":
                    numberSecond = intputNumber("Enter number:");
                    Memory = (float) Math.pow(numberFirst, numberSecond);
                    break;
                case "/":
                    numberSecond = intputNumberDifferentZero("Enter number:");
                    Memory = numberFirst/numberSecond;
                    break;
                case "=":
                    System.out.println("Result:" + Memory);
                    return;
            }
            System.out.println("Memory:" + Memory);
        } while (true);
    }

    void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
        float weight = intputPositiveNumber("Enter Weight(kg):");
        float height = intputPositiveNumber("Enter Height(cm):");
        float BMI = 100*100*weight/(height*height);
        System.out.print("BMI Number: "+String.format("%.4g%n", BMI));
        if(BMI<19){
            System.out.println("BMI Status: UNDER-STANDARD");
        }
        else if(BMI<=25){
            System.out.println("BMI Status: STANDARD");
        }
        else if(BMI <=30){
            System.out.println("BMI Status: OVERWEIGHT");
        }
        else if(BMI <=40){
            System.out.println("BMI Status: FAT - SHOULD LOSE WEIGHT");
        }else{
            System.out.println("BMI Status: VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELYS");
        }
   }

    private static float intputNumber(String msg) {
        float value;
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
                value = parseFloat(input);
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }

    private String inputOperator(String msg) {
        String input ;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print(msg);
            input = sc.nextLine();
            if(input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")||input.equals("^")||input.equals("=")){
                return input;
            }
            else{
                System.out.println("Please input (+, -, *, /, ^)");
                continue;
            }
        } while (true);
    }

    private float intputNumberDifferentZero(String msg) {
        float value;
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
                value = parseFloat(input);
                if(value==0){
                    System.out.println("Input can't be equal 0");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }
    private static float intputPositiveNumber(String msg) {
        float value;
        String input = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(msg + " ");
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("BMI can't be empty");
                continue;
            }
            try {
                value = parseFloat(input);
                if(value<=0){
                    System.out.println("BMI is positive number");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }
        } while (true);
}
}
