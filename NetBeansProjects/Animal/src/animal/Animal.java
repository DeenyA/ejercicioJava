
package animal;

public class Animal {

         
    public static void main(String[] args) {
     
             Animales an = new Animales ();
             an.setApodo("marranito");
             an.setEdad(12);
             an.setNombre("Pedrito");
             
             System.out.println(an.getApodo()+" "+ an.getNombre()+" "+ an.getEdad());
    }

   
    
}
