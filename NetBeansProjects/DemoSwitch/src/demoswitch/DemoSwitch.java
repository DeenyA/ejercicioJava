
package demoswitch;

import java.util.Scanner;

public class DemoSwitch {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un día de la seman (numero): ");
        int v = sc.nextInt();
       String dia ; 
       
        switch (v){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                        break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia= "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto ... El valor debe de ser entre 1 y  7";
                
        }
        System.out.println(dia);
        
    }
    
}
