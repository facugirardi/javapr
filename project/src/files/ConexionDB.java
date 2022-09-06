package files;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionDB {
    Connection conectar = null;
    private final String SQL_SESSIONS_SELECT = "SELECT * FROM sesiones";

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
    
    
    public boolean checkSession(){  
        ResultSet rs = null;
        try{
            ConexionDB mysql = new ConexionDB();
            Connection cn = mysql.conectar();

            PreparedStatement st = cn.prepareStatement(SQL_SESSIONS_SELECT);

            rs = st.executeQuery();
            if(rs.next()){
                return true;
            }
           
        }    
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }   
        
        return false;
    }

    
    
}
