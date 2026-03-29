
package projetoproduto;


import javax.swing.JOptionPane;


public class ProjetoProduto {

    public static void main(String[] args) {
        Produto prod = new Produto(200,100,0);
        int op = 10;
        String mens = "1 - Cadastrar Produto \n2 - Exibir Produto "
                + "\n3 - Vender Produto \n4 - Exibir Total Vendas \n5 - Atualizar Valor  \n0 - Sair";
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(mens));
            switch(op){
                case 1:
                prod.cod_prod = Integer.parseInt(JOptionPane.showInputDialog("Codigo do Produto"));
                prod.descricao = JOptionPane.showInputDialog("Descrição do Produto");
                prod.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!" );
            break;
            case 2:
                prod.Exibir();
            break;
            case 3:
                int qtdade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade desejada: "));
                prod.EfetuarVenda(qtdade);
            break;
            case 4:
                prod.VerificarVendas();
                break;
            case 5:
                prod.Atualizarproduto();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Encerrando..." );
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
            }
        }while(op!= 0);
    }
}

