
package primerosnumeros1;

import java.util.Scanner;

public class PrimerosNumeros1 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el número que deseaa : ");
        //Es hasta el número que se va a reflejar
        int n = sc.nextInt();
        
        int i =1;
        
        while (i <= n)
        {
            // muestro el valor de 1
            System.out.println(i);
            //incremento el valor de i 
             i ++;
        }
    }
    // ¿Cuando utilizar un for y un while ?
}
