
package esmayorque;

import java.util.Scanner;


public class EsMayorQue {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese du edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 21){
            System.out.println("Eres mayor de 21 por lo tanto eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de 21, por lo tanto eres menor de edad");
        }
    }
    
}
