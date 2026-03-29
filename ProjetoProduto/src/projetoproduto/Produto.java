
package projetoproduto;

import javax.swing.JOptionPane;


public class Produto {
    public int cod_prod;
    public String descricao;
    public double valor_prod;
    public int qtde_estoque;
    public double peso;
    public double tot_vendas;
    
    // metodo get peso
    public double getPeso() {
        return this.peso;
    }
    
    // metodo set peso
    public void setPeso(double ps) {
        this.peso=ps;
    }
    
    // construtor 
    public Produto(double vp, int qt, double totv) {
        this.valor_prod = vp;
        this.qtde_estoque = qt;
        this.tot_vendas = totv;
    }
    
    // metodo para exibir
    public void Exibir() {
        JOptionPane.showMessageDialog(null, "Codigo do produto : "
                + this.cod_prod
                + "\nDescrição: "
                + this.descricao
                + "\nValor produto: "
                + this.valor_prod
                + "\nQuantidade de estoque: "
                + this.qtde_estoque
                + "\nPeso: "
                + this.peso
        );
    }
    
    public void EfetuarVenda(int qt) {
        if (qt <= this.qtde_estoque) {
            this.tot_vendas += (this.valor_prod * qt);
            this.qtde_estoque -= qt;
            JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!" );
        }
        else {
            JOptionPane.showMessageDialog(null, "Quantidade em estoque insufuciente!" );
        }
    }
    
    public void VerificarVendas() {
        JOptionPane.showMessageDialog(null, "Total Vendido: "
                + this.tot_vendas
                + "\nEstoque atual: "
                + this.qtde_estoque
        );
    }
    
    public void Atualizarproduto() {
        this.valor_prod = Double.parseDouble(JOptionPane.showInputDialog("Novo Valor"));
        this.qtde_estoque += Integer.parseInt(JOptionPane.showInputDialog("Quantidade desejada: "));
    }
}