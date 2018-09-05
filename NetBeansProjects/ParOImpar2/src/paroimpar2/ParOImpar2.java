
package paroimpar2;

import java.util.Scanner;

public class ParOImpar2 {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: " );
        int num = sc.nextInt();
        
        int res = num % 2;
        
        // Utilizando un if-line
        String mssg = (res == 0) ? "es par ": "es impar";
        
        //muestro el resultado 
        
        System.out.println(res + " "+ mssg);
           
    }
    
}
