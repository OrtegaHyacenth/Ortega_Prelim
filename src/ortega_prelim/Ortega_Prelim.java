/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ortega_prelim;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ortega_Prelim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        
        
        
        while (continueLoop) {
            System.out.println("Choose an operation (1, 2, 3,,4,5 or 0 to exit): ");
            int choice = scanner.nextInt();
            
            
            switch (choice){
                
                case 1:
                        //no1   
                         int [] numbers = {1, -2, 3, -4, 5};
                         int sum =0;
                         
                         for(int i=0; i < numbers.length ; i++){
                          sum = sum + numbers[i];
                              System.out.println("Sum of the positive integers:"+ numbers );
                              break;
                         }
                case 2:
                    break;
                case 3:
                          int [] arr = {1 , 2, 3, 4, 5};
                         System.out.println("Original Set of array: " + Arrays.toString(arr));
              
                        System.out.println("Size of element:");
                        for (int i = 0; i < arr.length; i++){
                           if (arr[i] > i*3){
                          System.out.println(arr.length);
                                }
                            break;
                             } 
                   
                case 4:
                    break;
                case 5:
                      Scanner scan = new Scanner(System.in); 
                        System.out.println("Enter the size:");
                        int n = scan.nextInt();
                            int [] num = new int [n];

                        for (int i = 0; i < n; i++){
                         System.out.println(fibonacci (i) + "");
      
                         }                    
             break;
             case 0:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            
                 }
        }
    }
      public static int fibonacci(int n){
        if (n ==0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return fibonacci (n - 1) + fibonacci (n - 2);
        }
      }
}

