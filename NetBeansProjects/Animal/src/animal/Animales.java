
package animal;


public class Animales {
     private String nombre;
          private int edad;
          private String apodo;

    public Animales() {
    }

    public Animales(int edad, String apodo) {
        this.edad = edad;
        this.apodo = apodo;
    }

    public Animales(String nombre, int edad, String apodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
    }

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
      if(edad ==12){
      this.edad= edad;
      }
      else {
          System.out.println("Solo acepto 12: ");
    }
    }

    public String getApodo() {
        return apodo;
        
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
        if (apodo == "marranito") {
            this.apodo = apodo;
        }else {
            System.out.println("No es su apodo");
        }
    }
          
          
          
}
