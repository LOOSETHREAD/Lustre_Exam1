/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lustre_exam1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Lustre_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        main();
    }
    public static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Number [1]");
        System.out.println("Number [2]");
        System.out.println("Number [3]");
        System.out.println("Number [4]");
        System.out.println("Number [5]");
        System.out.println("Input Number from above: ");
        
        int input = scn.nextInt();
        if(input == 1){
            number1();
        }
        else if(input == 2){
            number2();
        }else if(input == 3){
            number3();
        }else if(input == 4){
            number4();
            
        }else if(input == 5){
            number5();
            
        }else{
            System.out.println("Invalid Input!");
            main();
        }
                
    }
    public static void number1(){
        
        
    }
    public static void number2(){
        String[] = arr {"banana" , "apple", "durian", "rambotan"};
        System.out.println("Original set of array fruits: ");
        printArray(arr);
        
        bubbleSort(arr);
        System.out.println("Sorted Fruits: ");
        printArray(arr);
    }
        public static void bubbleSort(String fruits[]){
        int n = fruits.length;
        
        for(int i = 0; i < n - 1;){
            for(int j = 0; j < n - 1; j++){
                if(arr[j] > arr [j + 1]){
                    int m = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = m;
        
                }
            }
        }
        }   

    public static void number3(){
        int [] arr = {1, 3, 5, 6, 4, 2, 7 ,9};
        System.out.println("Original Array: "  + arr);
        
        
        bubbleSort(arr);
        System.out.println("The Length of the Array is: ");
        printArray(arr);
    }
    public static void bubbleSort(int arr[]){
        
        
        
    }
    public static void number4(){
        
        
    }
    public static void number5(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Your Fibonacci numbers: ");
        int input = scn.nextInt();
        
        for(int i = 0; i < input; i++){
            System.out.println(fibonacci(i) + " ");
            scn.close();
        }
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
            
        
    }
        
            
        }

   
    
    

