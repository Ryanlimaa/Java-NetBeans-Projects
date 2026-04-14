
import javax.swing.JOptionPane;


/**
 *
 * @author Ryan lima
 */
public class Pesquisa {
    public int totIdade;
    public int totEntrevistados;
    public int num_otimo;
    public int num_bom;
    public int num_ruim;
    
    public void SomarDados(int idade) {
        this.totIdade += this.totEntrevistados++;
    }
    
    public void AnaliseOpcao(int opiniao){
        if (opiniao == 1) {
            this.num_otimo++;
            JOptionPane.showMessageDialog(null, "Otimo!");
        }else if (opiniao == 2) {
            this.num_bom++;
            JOptionPane.showMessageDialog(null, "Bom!");
        }else if (opiniao == 3) {
            this.num_ruim++;
            JOptionPane.showMessageDialog(null, "Ruim!");
        }
    }
    
    public void Relatorio() {
        double media = (double)this.totIdade / this.totEntrevistados;
        double percOtimo = ((double)this.num_otimo / this.totEntrevistados) * 100;
        double percBom = ((double)this.num_bom / this.totEntrevistados) * 100;
        double percRuim = ((double)this.num_ruim / this.totEntrevistados) * 100;
        
        System.out.println("Relatório da Pesquisa:");
        System.out.println("Media de idade :" + media);
        System.out.println("Percentual de 'Otimo': " + percOtimo + "%");
        System.out.println("Percentual de 'Bom': " + percBom + "%");
        System.out.println("Percentual de 'Ruim': " + percRuim + "%");
    }
}
