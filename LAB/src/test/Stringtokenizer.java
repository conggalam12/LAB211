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
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Stringtokenizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String t = sc.nextLine();
        StringTokenizer st = new StringTokenizer("Hello World"," ");
        countW(st);
    }
    public static void countW(StringTokenizer st){
        HashMap<String , Integer> t = new HashMap<>();
        HashMap<Character , Integer> t1 = new HashMap<>();
        while(st.hasMoreElements()){
            String token = st.nextToken();
            for (int i = 0; i < token.length(); i++) {
                if(!t1.containsKey(token.charAt(i))){
                    t1.put(token.charAt(i), 1);
                }
                else{
                    t1.put(token.charAt(i), (int)t1.get(token.charAt(i))+1);
                }
            }
            if(!t.containsKey(token)){
                t.put(token, 1);
            }
            else if(t.containsKey(token)){
                t.put(token, (int)t.get(token)+1);
            }
        }
        System.out.println(t);
        System.out.println(t1);
    }
    }