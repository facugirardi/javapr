package files;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author facug
 */
public class ConexionDB {
    Connection conectar = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
              
        } 
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexion a la base de datos fallida." + e, "Conexion Fallida", JOptionPane.ERROR_MESSAGE);
        
        }
    return conectar;   
    }
}
