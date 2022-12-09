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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mng = new Manager();
        int choice ;
        do {            
            mng.menu("input");
            choice = mng.checkInput(1, 3);
            switch(choice){
                case 1 : 
                    mng.convertBinary();
                    break;
                case 2 :
                    mng.convertDecimal();
                    break;
                case 3 : 
                    mng.convertHex();
                    break;
            }
            System.out.print("Do you want to continue(Y/N):");
            String YN = sc.nextLine();
            if(YN.equals("Y")){
                continue;
            }
            else{
                break;
            }
        } while (true);
    }
}
