/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
//        int sizeArray = InputSizeArray();
//        int array[] = CreateArray(sizeArray);
//        int search = InputNumber();
        boolean test = false;
        test = true;
        int array[] = {-1,5,6,18,19,25,46,78,102,114};
//        int search =6;
        int search = 103;
        bubbleSort(array);
        displayArray(array,test,search);
        BinarySearch(array,search,test);
    }
    public static void displayArray(int[] arr,boolean test,int search) {
        if(test==false){
        System.out.print("Sorted array: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        }
        else{
            System.out.print("Find "+search+ " in {");
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}.\n");
        }
    }
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    private static void BinarySearch(int[] arr, int search,boolean test) {
        int left,right,middle = 1,index = 0;
        left = 0;
        right = arr.length-1;
        int step = 0;
        while(middle!=left && middle!=right){
            middle = (left+right)/2;
            step++;
            if(search==arr[middle]){
                index = middle ;
                if(test==true){
                    System.out.print("Step "+step +" (middle element is "+arr[middle]+" == "+search+"):");
                    displayIndex(arr,middle);
                }
                else{
                System.out.println("Found "+search+" at index: "+index);
                }
                break;
            }
            else{
                if(search>arr[middle]){
                    if(test==true){
                    System.out.print("Step "+step +" (middle element is "+arr[middle]+" < "+search+"):");
                    displayIndex(arr,middle);
                    }
                    left = middle+1;    
                }else{
                    if(test==true){
                    System.out.print("Step "+step +" (middle element is "+arr[middle]+" > "+search+"):");
                    displayIndex(arr,middle);
                    }
                    right = middle-1;
                }
            }
        }
        if(index==0|| index == arr.length-1){
            step++;
            if(test==true){
                System.out.print("Step "+step +" (searched value is absent):");
                displayIndex(arr, -1);
            }
            else{
            System.out.println(search+" don't have in array");
            }
            return;
        }
        
    }
    private static void displayIndex(int [] arr ,int IndexMid){
        for (int i = 0; i <arr.length; i++) {
            if(i!=IndexMid){
            System.out.print(" "+arr[i]);
            }
            else{
                System.out.print(" ("+arr[i]+")");
            }
        }
        System.out.println("");
    }

    private static int InputSizeArray() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of array:");
       int size = sc.nextInt();
       return size ;
    }

    private static int[] CreateArray(int sizeArray) {
        int array[] = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = new Random().nextInt(sizeArray);
        }
        return array ;
    }

    private static int InputNumber() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter search value:");
       int size = sc.nextInt();
       return size ;
    }
}
