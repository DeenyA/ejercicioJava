
package demiarray2;

import java.util.Scanner;

public class DemiArray2 {

    public static void main(String[] args) {
       
        String dias [] = {"Lunes", "Martes", "Miercoles", "Jueves", "viernes","Sabado", "Domingo"};
        
        Scanner sc  = new Scanner (System.in);
        System.out.println("Ingresoa un día de la semana numero: ");
        int v = sc.nextInt();
        
        if(v <= dias.length){
        //Recordemos que los Array se numeran desde cero
          System.out.println(dias[v -1]); 
        }
        else {
            System.out.println("Dia incorrecto: ");
        }
    }
    
}
