package demoarray;

import java.util.Scanner;

public class DemoArray {

    public static void main(String[] args) {

        // Defino mi Array 
        int arr[] = new int[10];
        //Escaner para leer los numeros por teclado
        Scanner sc = new Scanner(System.in);
        //leo el primer valor
        System.out.println("Ingrese un valor (0=>fin): ");
        int v = sc.nextInt();
        int i = 0;

        //mientras v sea distinto de cero AND i sea menor que 10
        while (v != 0 && i < 10) {
            //Asigna v en arr [i] y luego incrementa el valor de i
            arr[i++] = v;

            //Leo el siguiente valor
            System.out.println("Ingresa el siguiente valot (0=> fin): ");
            v = sc.nextInt();
        }
        //recorro el array mostrando su contenido

        for (int j = 0; j < i; i++) {
            System.out.println(arr[j]);
        }
    }

}
