
public class Aluno {
    public int rgm;
    public String nome;
    public int idade;
    private double mensalidade;
    
    public double calcularNovaMensalidade (double desconto){
        double novaMensalidade = this.mensalidade - this.mensalidade * desconto / 100;
        return novaMensalidade;
    };
    
    public void exibirDados(){
        System.out.println("RGM: "+ this.rgm + " Nome: " + this.nome +
        " Idade: " + this.idade + " Mensalidade" + this.mensalidade);
    };
    
    public double getMensalidade(){
        return this.mensalidade;
    };
    
    
    public void setMensalidade (double mens){
        this.mensalidade = mens;
    }
}
