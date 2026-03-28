
public class Principal {

    
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); 
        aluno.rgm = 1234;
        aluno.nome = "Antonio";
        aluno.idade = 25;
        aluno.setMensalidade(1000);
        
        aluno.exibirDados();
        
        double novamens = aluno.calcularNovaMensalidade(10);
        System.out.println("Nova mensalidade com desconto: " + novamens);
        
    }
    
}
