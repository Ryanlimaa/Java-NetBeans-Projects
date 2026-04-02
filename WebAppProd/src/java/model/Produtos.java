/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ryan Lima
 */
public class Produtos {
    // Atributos
    
    private int cod;
    private String nome;
    private float valor;
    private int qtd;
    
    // Met. Construtor
    
    public Produtos() {
    }

    public Produtos(int cod, String nome, float valor, int qtd) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    
    
    // Metodos

    public void setCod(int p_cod) {
        this.cod = p_cod;
    }
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }
    public void setValor(float p_valor) {
        this.valor = p_valor;
    }
    public void setQtd(int p_qtd) {
        this.qtd = p_qtd;
    }

    public int getCod() {
        return this.cod;
    }
    public String getNome() {
        return this.nome;
    }
    public float getValor() {
        return this.valor;
    }
    public int getQtd() {
        return this.qtd;
    }
    
    // Met. Calculo
    public float CalcProdValorFinal(float p_vr, int p_qtd, int p_perc) {
        //float vr_p = (p_vr * p_qtd) * (p_perc/100);
        return ((p_vr * p_qtd) - (p_vr * p_qtd * p_perc)/100);
    }
    
}
