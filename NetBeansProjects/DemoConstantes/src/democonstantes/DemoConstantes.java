
package democonstantes;

import java.util.Scanner;


public class DemoConstantes {

    //Definimos las constantes 
        public static final int LUNES = 1;
        public static final int MARTES = 2;
        public static final int MIERCOLES = 3;
        public static final int JUEVES = 4;
        public static final int VIERNES =5 ;
        public static final int SABADO = 6;
        
    public static void main(String[] args) {
        
        System.out.println("Ingrese el número de día que desea: ");
        Scanner sc = new Scanner (System.in);
        int v = sc.nextInt();
        String dia ;
        
        switch (v)
        {
            case 1:
                dia ="LUNES";
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
            case 5 :
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Debes de ingresar un numero valido ente 1 y 7 ";
                            
        }
        System.out.println(dia);
        
                
 }
    
}
