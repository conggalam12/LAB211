/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0050;

import static java.lang.Float.parseFloat;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.String.format;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
        int choice ;
        do {            
            menu();
            choice = InputNumberRange(1,3);
            CaculatorEquation(choice);
        } while (choice!=3);
    }

    private static void menu() {
        System.out.println("====== Equation Program ======");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    private static int InputNumberRange(int a, int b) {
       int choice;
       String input ="";
       Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("Please choice one option:");
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Your choice can't be empty");
                continue;
            }
            try {
                choice = Integer.parseInt(input);
                if(choice<a || choice>b){
                    System.out.println("Your choice must be between from "+a+" to "+b+":");
                    continue;
                }
                return choice ;
            } catch (Exception e) {
                System.out.println("Your choice is a digit");
            }
        } while (true);
    }
        
    private static void CaculatorEquation(int choice) {
        if(choice==1){
            CalculateSuperlative();
        }
        else if(choice == 2){
            CalculateQuadratic();
        }
    }

    private static void CalculateSuperlative() {
        Manager mng = new Manager();
        System.out.println("----- Calculate Euqation -----");
        float a = intputNumberDifferentZero("Enter A:");
        float b = intputNumber("Enter B:");
        double x = -b/a ;
        mng.add((double)a);
        mng.add((double)b);
        mng.add(x);
        System.out.println("Solution: x = "+format("%.3f",x));
        System.out.print("Number is Odd:");
        display(mng.Odd);
        System.out.print("\nNumber is Even:");
        display(mng.Even);
        System.out.print("\nNumber is Perfect Square:");
        display(mng.Square);
        System.out.println("");
    }

    private static void CalculateQuadratic() {
        Manager mng = new Manager();
        System.out.println("----- Calculate Quadratic Euqation -----");
        float a = intputNumberDifferentZero("Enter A:");
        float b = intputNumber("Enter B:");
        float c = intputNumber("Enter C:");
        float delta = (float)(pow(b,2) - 4*a*c);
        mng.add(a);
        mng.add(b);
        mng.add(c);
        if(delta<0){
            System.out.println("Equation don't have solution");
        }
        else if(delta==0){
            float x = -b/(2*a);
            System.out.println("Solution: x1 = "+format("%.3f",x)+" and x2 = "+format("%.3f",x));
            mng.add(x);
            mng.add(x);
        }
        else{
            float x1 = (float) ((-b+sqrt(delta))/(2*a)) ;
            float x2 = (float) ((-b-sqrt(delta))/(2*a)) ;
            System.out.println("Solution: x1 = "+x1+" and x2 = "+x2);
            mng.add(x1);
            mng.add(x2);
        }
        System.out.print("Number is Odd:");
        display(mng.Odd);
        System.out.print("\nNumber is Even:");
        display(mng.Even);
        System.out.print("\nNumber is Perfect Square:");
        display(mng.Square);
        System.out.println("");
    }

    private static float intputNumberDifferentZero(String msg) {
       float value;
       String input ="";
       Scanner sc = new Scanner(System.in);
        do {            
            System.out.print(msg+" ");
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Input can't be empty");
                continue;
            }
            try {
                value= parseFloat(input);
                if(value==0){
                    System.out.println("Please input number different 0");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }

    private static float intputNumber(String msg) {
       float value;
       String input ="";
       Scanner sc = new Scanner(System.in);
        do {            
            System.out.print(msg+" ");
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Input can't be empty");
                continue;
            }
            try {
                value= parseFloat(input);
                return value;
            } catch (Exception e) {
                System.out.println("Please input number");
            }
        } while (true);
    }
    private static void display(List<Double> t){
        if(t.isEmpty()){
            return;
        }
        else{
            if(t.size()>1){
            for (int i = 0; i <t.size()-1; i++) {
                System.out.print(t.get(i)+", ");
            }
                System.out.print(t.get(t.size()-1));
            }
            else{
                System.out.print(t.get(t.size()-1));
            }
        }
    }
}
