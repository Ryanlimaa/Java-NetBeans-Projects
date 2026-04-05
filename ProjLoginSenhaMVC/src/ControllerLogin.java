
/**
 *
 * @author Ryan Lima
 */
public class ControllerLogin {
    
    Usuario usuario = new Usuario();
    
    public void Logar(String login, int senha) {
        // o metodo logar deve receber da interface o 
        // login e senha digitados e armazenar nos atributos
        usuario.login = login;
        usuario.senha = senha;
        // em seguida chama o metodo VerificarUsuario() da classe Usuario
        // o qual retornará true ou false, retornando true deve chamar a 
        // interface do sistema, se false chamar a tela de login
        if(usuario.VerificarUsuario() == true) {
            // habilitando a interface deixando-a visível
            new FormSistema().setVisible(true);
        }
        else {
            // habilitando a interface deixando-a visível
            new FormLogin().setVisible(true);
        }
    }
}
