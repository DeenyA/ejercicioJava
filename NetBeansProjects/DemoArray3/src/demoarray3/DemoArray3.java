
package demoarray3;

import java.util.Scanner;

public class DemoArray3 {

    public static void main(String[] args) {
       
        int arr [] = new int [10];
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa el primer valor: ");
        int v = sc.nextInt();
        
        
        for (int i = 0; i < arr.length; i++) {
             arr[i]= i;
            System.out.println("Ingresa el siguiente valor: " +1);
            
           
            
        }
        
       // for (int j = 0; j < arr.length; j++) {
         //   System.err.println(arr [j]);
            
        //}
    }
    
}
