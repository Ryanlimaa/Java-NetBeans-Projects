
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryan Lima
 */
public class Autonomo extends Funcionario {
    public double valortotal;
    public double comissao;
    
    public void Cadastrar(String nm, int reg, double vlr, double com){
        this.nome = nm;
        this.registro = reg;
        this.valortotal = vlr;
        this.comissao = com;
        JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
    }
    
    public String Exibir() {
        return (this.nome + ";" + this.registro + ";" + this.valortotal + ";" + this.comissao);
    }
    
    public double CalcularComissao() {
        return this.valortotal * this.comissao;
    }
}
