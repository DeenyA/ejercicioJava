
package arreglos1;

import java.util.Scanner;

public class Arreglos1 {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner (System.in);
        System.out.print("Ingrese una palabra: ");
        String pal = sc.next();
        
        char p [] = pal.toCharArray();
        
        for (int i = 0; i < p.length; i++) {
            System.out.println(p [i]);
            
        }
        
    }
}
