
package figurasarray;

import java.util.Scanner;

public class FigurasArray {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
         System.out.println("Ingre tu palabra:");
        String palabra= sc.nextLine();
        System.out.println("Ingresa la letra:");
        String letra = sc.nextLine();
        char letrax = letra.toCharArray();
        //Conocer el tamaño de de la palabra  
        int l = palabra.length();
        for (int i = 0; i < l ;i ++ ){
         
            if (palabra.charAt(i) == letrax ){
                System.out.println(letrax );
                System.out.print(" Posición "+ i);
            
            }
        }
    }
    
}
