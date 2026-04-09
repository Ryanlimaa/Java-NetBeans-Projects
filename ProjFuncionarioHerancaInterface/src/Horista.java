
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryan Lima
 */
public class Horista extends Funcionario{
    public double numhora;
    public double valorhora;
    
    public void Cadastrar(String nm, int reg, double num, double vlr) {
        this.nome = nm;
        this.registro = reg;
        this.numhora = num;
        this.valorhora = vlr;
        JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
    }
    
    public String Exibir() {
        return (this.nome + ";" + this.registro + ";" + this.numhora + ";" + this.valorhora);
    }
    
    public double CalcularHora() {
        return (this.numhora * this.valorhora);
    }   
}
