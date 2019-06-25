package exercicio10;


public class Pessoa {


     private String Nome;
     private int Idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade)throws IdadeInvalidaException {
        if(Idade<=0) {
        throw new IdadeInvalidaException("Idade invalida"); 
        } else {       
           this.Idade = Idade; 
         }
         
    
    }
    
    public Pessoa(String n, int i) throws IdadeInvalidaException{
        this.setNome(n);
        this.setIdade(i);
    }
    
}
