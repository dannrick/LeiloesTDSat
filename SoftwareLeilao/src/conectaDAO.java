
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    
    public static Connection conn;

    public String url = "jdbc:mysql://localhost:3306/uc11";
    public String user = "root";
    public String password = "mysql";
    
    
    public boolean conectar(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");    
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco "+ ex.getMessage());
            return false;
        }
    }
    
     public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
          
        }
    }
    
}
