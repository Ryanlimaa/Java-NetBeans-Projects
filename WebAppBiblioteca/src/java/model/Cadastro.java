/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Ryan Lima
 */
public class Cadastro {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String cell;
    private String livro;
    
    public Cadastro() {
    }
    
    public Cadastro(int c_id, String c_nome, String c_cpf, String c_email, String c_cell, String c_livro) {
        this.id = c_id;
        this.nome = c_nome;
        this.cpf = c_cpf;
        this.email = c_email;
        this.cell = c_cell;
        this.livro = c_livro;
    }
    
    public void setId(int c_id) {
        this.id = c_id;
    }
    public void setNome(String c_nome) {
        this.nome = c_nome;
    }
    public void setCPF(String c_cpf) {
        this.cpf = c_cpf;
    }
    public void setEmail(String c_email) {
        this.email = c_email;
    }
    public void setCell(String c_cell) {
        this.cell = c_cell;
    }
    public void setLivro(String c_livro) {
        this.livro = c_livro;
    }
    
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCPF() {
        return this.cpf;
    }
    public String getEmail() {
        return this.email;
    }
    public String getCell() {
        return this.cell;
    }
    public String getLivro() {
        return this.livro;
    }
}
