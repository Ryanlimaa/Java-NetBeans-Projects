
import javax.swing.JOptionPane;


/**
 *
 * @author Ryan Lima
 */
public class Principal {

    public static void main(String[] args) {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            JOptionPane.showMessageDialog(null, "Idade: " + idade);
            int valor = idade / 0;
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!");
        }
        catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!");
        }
    }
    
}
