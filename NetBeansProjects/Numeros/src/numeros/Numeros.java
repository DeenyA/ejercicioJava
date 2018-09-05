
package numeros;

import java.util.Scanner;


public class Numeros {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
            int numeroPotenciar [] = new int [4];
            int potencias       [] = new int [4];
           
            System.out.println("Ingrese las potencias");
            
            for (int i = 0; i < 4; i++) {
             potencias [i]= sc.nextInt();
            
        }
            System.out.println("Introduce numeros a potenciar: ");
            for(int j = 0; j<4; j++)
            {
            numeroPotenciar [j]= sc.nextInt();
            }
                
            for(int a=0;a<4;a++){
                System.out.print((int) Math.pow(potencias[a], numeroPotenciar[a])+" ");
            }
            }
            
            
            
        
    }
    

