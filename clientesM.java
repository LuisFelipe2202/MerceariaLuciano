import java.util.ArrayList;

public class clientesM {
    
    private ArrayList<dadosClientes> lista = new ArrayList<>();

    public void adiciona(dadosClientes adic){
        this.lista.add(adic);//lista.add(adic);
    }  
    
    public String listarCleintes(){
        int i;
        String cliente ="";

        for(i=0; i < this.lista.size(); i++){
            dadosClientes dados = this.lista.get(i);
            cliente = "Nome:"+dados.getNome();
        }
    return cliente;
    }

}
