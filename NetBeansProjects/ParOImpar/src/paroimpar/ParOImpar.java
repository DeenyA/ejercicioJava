
package paroimpar;

import java.util.Scanner;


public class ParOImpar {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un valor: ");
        int v = sc.nextInt();
        
        //Obtenermos el resto al dividir entre dos
        int resto = v % 2;
        
        //Para saber si es par o impar se compara el resultado dentro de un If
        
        if(resto == 0){
            System.out.println("Es un numero par: "+ v);
        }
        else {
            System.out.println("No es un numero par "+ v);
        }
    }
    
}
