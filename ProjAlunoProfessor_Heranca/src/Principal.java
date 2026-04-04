
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       // criar as instâncias de classe para
       // Aluno e Professor
       Aluno aluno = new Aluno();
       Professor prof = new Professor();
       // entrando dados na classe Aluno
       // Percebam que o acesso aos atributos
       // da classe Pessoa estão disponíveis
       // para a classe Aluno (conceito de herança)
       aluno.nome = "Ryan";
       aluno.rgm = 1234;
       aluno.idade = 21;
       aluno.mensalidade = 500;
       // Exibindo dados dos alunos
       JOptionPane.showMessageDialog(null,"Nome do Aluno: "
               +aluno.nome
               + "\nRGM: "
               + aluno.rgm
               + "\nIdade: "
               + aluno.idade
               + "\nMensalidade: "
               + aluno.mensalidade);
       // entrando dados na classe Professor
       // idem a classe Aluno onde os atributos da superclasse 
       // Pessoa estão disponíveis
       prof.nome = "Maria";
       prof.idade = 40;
       prof.num_aulas = 20;
       prof.especialidade = "Engenharia de Software";
       // Exibindo dados do professor
       JOptionPane.showMessageDialog(null,"Nome do professor: "
               + prof.nome
               + "\nIdade: "
               + prof.idade
               + "\nNumero de aulas: "
               + prof.num_aulas
               + "\nEspecialidade: "
               + prof.especialidade);
    }
    
}
