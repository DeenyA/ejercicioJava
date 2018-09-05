
package matrizdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conexion = null;
   Statement comando = null;
   ResultSet registro;
   PreparedStatement ps ; 
           //  String pass = "deeny";
   public Connection MySQLConnect() {
 
       try {
           //Driver JDBC
           Class.forName("com.mysql.jdbc.Driver");
           //Nombre del servidor. localhost:3306 es la ruta y el puerto de la conexión MySQL
           //panamahitek_text es el nombre que le dimos a la base de datos
           String servidor = "jdbc:mysql://localhost:3306/matris";
           //El root es el nombre de usuario por default. No hay contraseña
           String usuario = "root";
          String pass = "deeny";
           //Se inicia la conexión
           conexion = DriverManager.getConnection(servidor, usuario, pass);

       } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
           conexion = null;
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
           conexion = null;
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
           conexion = null;
       } finally {
           JOptionPane.showMessageDialog(null, "Conexión Exitosa");
           return conexion;
       }
       
      
}       
       
        public void insertarDatos(Datos valor) throws SQLException{
          
            String url ="jdbc:mysql://localhost:3306/matris?user=root"+"pass = deeny" ;
            conexion = DriverManager.getConnection(url);
            comando = conexion.createStatement();
            ps = conexion.prepareStatement("INSERT INTO array1(valor )"+ "value(?)");
            
            ps.setInt(1, valor.getValor());
            
            ps.executeUpdate();
   }
       
   }