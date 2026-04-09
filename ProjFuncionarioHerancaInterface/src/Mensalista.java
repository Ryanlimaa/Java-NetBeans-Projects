
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryan Lima
 */
public class Mensalista extends Funcionario{
    public double salariobruto;
    public double desconto;
    
    // Metodos que recebe dados da interface e inseri nos atributos
    public void Cadastrar(String nm, int reg, double sb, double dsc) {
        this.nome = nm;
        this.registro = reg;
        this.salariobruto = sb;
        this.desconto = dsc;
        JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
    }
    
    public String Exibir() {
        return (this.nome + ";" + this.registro + ";" + this.salariobruto + ";" + this.desconto);
    }
    
    public double CalcularSalario() {
        return (this.salariobruto - this.desconto);
    }
}
