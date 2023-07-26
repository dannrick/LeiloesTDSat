/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.SQLException;
import java.sql.Statement;

public class ProdutosDAO {

    public void cadastrarProduto (ProdutosDTO produto){
        
        try {
            conectaDAO conector = new conectaDAO();
            conector.conectar();
            Statement stmt = conectaDAO.conn.createStatement();
            
            String sql = "INSERT INTO produtos(nome, valor, status) VALUES('" + produto.getNome() + "','" + produto.getValor() + "','" + produto.getStatus() + "')";
            stmt.executeUpdate(sql);
            
        } catch (SQLException sqle) {
           System.out.println( "Erro inserindo : " + sqle.getMessage() );
        }   
    }
        
}

