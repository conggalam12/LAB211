/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author cong0
 */
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean test = false;
        test =true;
        fibonacci(45,0,1,test);
        
    }

    private static int fibonacci(int count, int f0, int f1,boolean test) {
        if(count==1){
            if(test==true){
                System.out.println(46-count+"---"+f0);
            }
            else{
            System.out.print(f0);
            }
            return 0;
        }
        else{
            if(test==true){
                System.out.println(46-count+"---"+f0);
            }
            else{
            System.out.print(f0+", ");
            }
        }
        return fibonacci(count-1, f1, f1+f0, test);
    }
    
}
