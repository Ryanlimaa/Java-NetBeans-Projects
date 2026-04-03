
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Aluno aluno = new Aluno(3456,1000,"Ryan", 21);
        JOptionPane.showMessageDialog(null,"Nome do Aluno: "
                + aluno.nome
                + "\nRGM: "
                + aluno.rgm
                + "\nIdade: "
                + aluno.idade
                + "\nMensalidade: "
                + aluno.mens);
    }
    
}
