package letras;

import java.util.Scanner;

public class Letras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingre tu palabra:");
        String palabra = sc.nextLine().toUpperCase() ;
        System.out.println("Ingresa la letra:");
        String letra = sc.nextLine().toUpperCase();
     
        int contador = 0;
        // Cateo  de String a char un solo caracter 
        char letrax  = letra.charAt(0);
        
        //Conocer el tamaño de de la 
        int l = palabra.length();

        for (int i = 0; i < l; i++) {

            if (palabra.charAt(i) == letrax) {
                System.out.println(letrax + " " + i);

                contador++;
            }
        }
            System.out.println("Repeticiones  " + contador);

    }

}
