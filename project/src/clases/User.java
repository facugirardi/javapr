package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class User {
    
    private String usuario;
    private String password;
    private boolean login;
    private String objetivo;
    private int peso;
    private int altura;
    private boolean act;
    
    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public User(String usuario, String objetivo, int peso, int altura) {
        this.usuario = usuario;
        this.objetivo = objetivo;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    
    public String getUser() {
        return usuario;
    }
    public void setUser(String usuario) {
        this.usuario = usuario;
    }

    
    public String getPass() {
        return password;
    }
    public void setPass(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    public void login(String user, String pass){
            
        try {
            ConexionDB mysql = new ConexionDB();
            Connection cn = mysql.conectar();

            PreparedStatement st = (PreparedStatement) cn.prepareStatement("SELECT name, password FROM users WHERE name = ? and password = ?");

            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                PreparedStatement st2 = cn.prepareStatement("INSERT INTO sesiones(usuario, activo)" + "VALUES ('"+user+"', true)");
                st2.executeUpdate();
                this.login = true;

            } else {
                this.login = false;
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }   

    
    }
    
    
    public void actualizar(){
        ConexionDB mysql = new ConexionDB();
        Connection cn = mysql.conectar();
        
        try{
            PreparedStatement st2 = cn.prepareStatement("UPDATE users SET objetivo = '"+ objetivo +"',peso = " + peso + ", altura = " + altura + " WHERE name = '"+usuario+"'");
            st2.executeUpdate();
            this.act = true;
            }
        catch(SQLException sqlException) {
                this.act = false;
                sqlException.printStackTrace();
            }

    
    }
    
    
    public void register(String name, String pass){
        List listUsers = new LinkedList();

        ConexionDB mysql = new ConexionDB();
        Connection cn = mysql.conectar();

        String sSQL = "INSERT INTO users(name, password)" + "VALUES(?, ?)";
       
        
        if (name.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresaste ningún dato.", "Error", JOptionPane.ERROR_MESSAGE);

    }   else {
            try{
             String SQL = "SELECT name FROM users";
             PreparedStatement pstmt = cn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery();            

             while (rs.next()) {
             String username = rs.getString("name");
             listUsers.add(username);
             }

             boolean userVerif = listUsers.contains(name);

             if (userVerif){
             JOptionPane.showMessageDialog(null, "Este usuario ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
             }

             else{
                 try{
                     PreparedStatement pst = cn.prepareStatement(sSQL);
                     pst.setString(1, name);
                     pst.setString(2, pass);
                     
                     int n = pst.executeUpdate();


                 } catch(SQLException ex){
                     JOptionPane.showMessageDialog(null, "Registro Fallido" + ex, "Error", JOptionPane.ERROR_MESSAGE);
                 }
             }

         } catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Hubo un error en el registro." + ex, "Error", JOptionPane.ERROR_MESSAGE);
         }

        }
    
}
    
    
}