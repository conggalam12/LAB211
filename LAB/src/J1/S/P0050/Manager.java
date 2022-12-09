/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0050;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cong0
 */
public class Manager {
    List<Double> Odd = new ArrayList<>();
    List<Double> Even = new ArrayList<>();
    List<Double> Square = new ArrayList<>();

    void add(double x) {
        if(sqrt(x) == (int)sqrt(x)){
            Square.add(x);
        }
        if(abs(x)/1  %2==0){
            Even.add(x);
        }
        else{
            Odd.add(x);
        }
    }
    void display(List<Double> t){
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
