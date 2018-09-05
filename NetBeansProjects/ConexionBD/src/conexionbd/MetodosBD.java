
package conexionbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MetodosBD {
    
Operaciones metodospool = new Operaciones();
    
public int Guardar(String nombres, String apellidos, String email, String celular, 
                   String direccion, String sexo){

int resultado = 0;

Connection con = null;

String SSQL = "INSERT INTO array1 (valor) "
            + "VALUES (?)";


    try {
    
        con = metodospool.dataSource.getConnection();
        
        PreparedStatement psql = con.prepareStatement(SSQL);
        psql.setString(1, nombres);
        psql.setString(2, apellidos);
        psql.setString(3, email);
        psql.setString(4, celular);
        psql.setString(5, direccion);
        psql.setString(6, sexo);
        
        resultado = psql.executeUpdate();
        
        psql.close();
                    
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
    }finally{
    
        try {
            
            if(con!=null){
            
                con.close();
                
            }
            
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                     + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }

    return resultado;
    
}    
    
    
    
}    

