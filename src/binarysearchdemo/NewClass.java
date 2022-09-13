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
public class NewClass {
    public int low;
    public int target;
    public int high;
    public int [] array;
    
    public NewClass(){
        this.low = low;
        this.high = high;
        this.target = target;
        this.high = high;
        this.array = array;
    }
    public static int BinarySearchDemo(int [] array,int target ,int low, int high){
        NewClass t2 = new NewClass();
        if(low > high){
            System.out.println("Invalid Indices!");
            return 0;
        }
        //int low = array[0];
        //int high = array[array.length - 1];
        int mid = ((low + high)/2);
        
  if(target < array[mid]){
                high = array[mid -1];
             
                    if(high >= low){

                         System.out.print("[" + array[low]);
                     }
                    if(low + 1 == high){

                         System.out.print("]");
                     }
                         for(int i = low + 1; i < high;i++){
                             System.out.print(", " + array[i]);




                         if(i == high - 1){
                         System.out.print("]");
                         }
                    }
                     
                          
                          
            return BinarySearchDemo(array,target ,low, high);
            
 }
         else if(target > array[mid]){
            low = mid + 1;
            
            if(high >= low){
           
            System.out.print("[" + array[low]);
        }
       if(low + 1 == high){
           
            System.out.print("]");
        }
            for(int i = low + 1; i < high;i++){
                System.out.print(", " + array[i]);
           
          
           
           
            if(i == high - 1){
            System.out.print("]");
            }
       }
       System.out.println("\n");
       
            return BinarySearchDemo(array, target ,low ,high );
            
        }
        else{
            return mid;
        }
     }
    public int getHigh(){
        return this.high;
    }
    public int getLow(){
        return this.low;
    }
    public int getTarget(){
        return this.target;
    }
     public String getArray(){
         return Arrays.toString(array);
     }
   
}
