/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0011;

import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Manager {
    int checkInput(int a,int b){
        Scanner sc = new Scanner(System.in);
        String input ;
        do {
            System.out.print("Enter your choice : ");
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Your choice can't be empty, please enter again");
                continue;
            }
            try {
                int choice = Integer.parseInt(input);
                if(choice<a || choice>b){
                    System.out.println("Your choice is number between "+a+" to "+b+", please enter again");
                    continue;
                }
                else{
                    return choice;
                   
                }
            } catch (Exception e) {
                System.out.println("Your choice is not digit, please enter again");
            }
        } while (true);
    }
    void menu(String msg){
        System.out.println("Choose the base number "+msg+":");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
    }
    String InputBinary(){
        Scanner sc = new Scanner(System.in);
        String input;
        do {            
            System.out.print("Enter the binary number:");
            input = sc.nextLine();
            if(input.matches("[0-1]*")){
                return input;
            }
            else{
                System.out.println("Input is not binary number");
            }
        } while (true);
    }
    String InputDecimal(){
        Scanner sc = new Scanner(System.in);
        String input;
        do {            
            System.out.print("Enter the decimal number:");
            input = sc.nextLine();
            if(input.matches("[0-9]*")){
                return input;
            }
            else{
                System.out.println("Input is not decimal number");
            }
        } while (true);
    }
    String InputHex(){
        Scanner sc = new Scanner(System.in);
        String input;
        do {            
            System.out.print("Enter the hexadecimal number:");
            input = sc.nextLine();
            if(input.matches("[0-9A-Z]*")){
                return input;
            }
            else{
                System.out.println("Input is not hexadecimal number");
            }
        } while (true);
    }
    void convertBinary() {
        Convert cv = new Convert();
        menu("output");
        int choice;
        do {            
            choice = checkInput(1, 3);
            if(choice==1){
                System.out.println("The base input can equal base output");
                continue;
            }
            else{
                break;
            }
        } while (true);
        String input = InputBinary();
         System.out.println("Number convert :"+cv.convertBinaryToOther(input, choice));
    }

    void convertDecimal() {
        Convert cv = new Convert();
        menu("output");
        int choice ;
        do {            
            choice = checkInput(1, 3);
            if(choice==2){
                System.out.println("The base input can equal base output");
                continue;
            }
            else{
                break;
            }
        } while (true);
        String input = InputDecimal();
        System.out.println("Number convert :"+cv.convertDecimalToOther(input, choice));
    }

    void convertHex() {
        Convert cv = new Convert();
        menu("output");
        int choice ;
        do {            
            choice = checkInput(1, 3);
            if(choice==3){
                System.out.println("The base input can equal base output");
                continue;
            }
            else{
                break;
            }
        } while (true);
        String input = InputHex();
        System.out.println("Number convert : "+cv.convertHexadecimalToOther(input, choice));
    }
    
}
