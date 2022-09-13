/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BinarySearchDemo {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass newclass = new NewClass();
        // TODO code application logic here
        //start();
        int [] array = new int [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println(NewClass.BinarySearchDemo(array, 7, 0 , 18 ));
        
        
        // NewClass.BinarySearchDemo(new int [] {0,1,2,3,4,5,6}, 2 ,0, 6)

    }
   
     public static void start(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Array Length:"); 
        Integer arraylength = scanner.nextInt();
        int length = arraylength;
        int [] array = new int[length];
        System.out.println("Numbers:");
        for(int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Target: ");
        Integer target = scanner.nextInt();
        System.out.println("Low: ");
        Integer low = scanner.nextInt();
        System.out.println("High: ");
        Integer high = scanner.nextInt();
     }

    }
   
 

