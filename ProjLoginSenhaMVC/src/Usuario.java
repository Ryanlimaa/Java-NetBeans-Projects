
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Lima
 */
public class Usuario {
    
    public String login;
    public int senha;
    
    public boolean VerificarUsuario() {
        if(this.login.equals("ryan") && this.senha == 1234) {
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Usuário/Senha Incorretos!");
            return false;
        }
    }
}
