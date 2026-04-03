
public class Aluno extends Pessoa {
    
    public int rgm;
    public double mens;
    
    public Aluno(int num_rgm,double ms,String nm,int id){
        // na primeira linha deve-se elevar os dados ao
        //construtor da classe Pessoa (comando super)
        super(nm,id);
        this.rgm=num_rgm;
        this.mens=ms;
    }
    
}
