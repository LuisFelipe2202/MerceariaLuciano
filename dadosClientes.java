import java.util.ArrayList;

public class dadosClientes {
    //cpf, nome, sobrenome, data de nascimento

    public String nome;
    public String sobrenome;
    public String dataNascimento;
    public int cpf;   
   // ArrayList <dadosClientes>listaClientes; 
   
    /*public dadosClientes(){
        listaClientes = new ArrayList<>();
    }*/

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

   
  /*  @Override
    public String toString() { 
        return getNome()+" "+getSobrenome()+" "+getCpf()+" "+getDataNascimento();
    }

	public String add(String toString) {
        return getNome()+" "+getSobrenome()+" "+getCpf()+" "+getDataNascimento();

	}*/
       
}
