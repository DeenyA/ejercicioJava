
package demoarray2;

import java.util.Scanner;

public class DemoArray2 {

    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
         System.out.print("Ingresa el primer valor (0=>fin): ");
        int valor = sc.nextInt();
        int i = 0;

        while (valor != 0 && i < 9) {
            arr[i++] = valor;

            System.out.print("Ingresa el siguiente valor: ");
            valor = sc.nextInt();
        }
        
        for (int j = 0; j < 10; j++) 
        {
            System.out.println( arr[j]);
        }

    }

}
