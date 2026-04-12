/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import model.Cadastro;
import util.ConectaDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan Lima
 */
public class CadastroDAO {
    // Cadastrar
    public boolean cadastrar(Cadastro cad) throws ClassNotFoundException{
        Connection conexao = null;
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO cadastro (id, nome, cpf, email, cell, livro) values('" + cad.getId() 
                    + "', '" + cad.getNome() 
                    + "', '" + cad.getCPF() 
                    + "', '" + cad.getEmail() 
                    + "', '" + cad.getCell() 
                    + "', '" + cad.getLivro() 
                    + "')";
            
            stmt.executeUpdate(sql);
            return true;
        }
        catch(SQLException ex){
            System.out.println("Erro: " + ex);
            return false;
        }
    }
    
    // Consultar
    public List consultaGeral() throws ClassNotFoundException{
        List lista = new ArrayList();
        
        // Conectar no Banco de Dados
        Connection conexao = null;
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM cadastro";
            ResultSet rs = stmt.executeQuery(sql);
            
            int n_reg = 0;
            while (rs.next()) {
                // Objeto Produto
                Cadastro cad = new Cadastro();
                cad.setId(Integer.parseInt(rs.getString("id")));
                cad.setNome(rs.getString("nome"));
                cad.setCPF(rs.getString("cpf"));
                cad.setEmail(rs.getString("email"));
                cad.setCell(rs.getString("cell"));
                cad.setLivro(rs.getString("livro"));
                lista.add(cad);
                n_reg++;
            }
        }
        catch(SQLException ex){
            System.out.println("Erro: " + ex);
        }
        return lista;
    }
}
