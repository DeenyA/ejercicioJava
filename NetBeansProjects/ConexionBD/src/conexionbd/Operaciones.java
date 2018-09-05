package conexionbd;

import java.util.Scanner;

public class Operaciones {
 int filas = 0;
 int columnas =0;

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
        
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Operaciones() {
    }

    
     public void envioDatos  (){    
     Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingresa la cantidad de filas de A:");
        filas = sc.nextInt();
        System.out.println("Ingresa la cantida de columnas de A: ");
        columnas = sc.nextInt();
    
}
}