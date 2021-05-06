import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class clientes{

public static void main(String[] args) {
    
        int op=-1, laco=-1;
     
        var ler = new Scanner(System.in);
 

        //ArrayList<dadosClientes> lista = new ArrayList<>();
        //dadosClientes lista = new dadosClientes();
        
   /* while(laco != 0){
        System.out.println("Escolha uma das seguintes opções logo a baixo:"); 
        System.out.println("1..... Cadastrar");
        System.out.println("2..... Editar");
        System.out.println("3..... Listar");
        System.out.println("4..... Excluir"); 
        System.out.println("----------------------------------------------");        
        op = ler.nextInt();        
        
         if(op == 1)
         {  */
                
        
                // dadosClientes lista = new dadosClientes();
         
                 //Scanner lerCad = new Scanner(System.in);
                 //dadosClientes lClientes = new dadosClientes();


                 //dadosClientes s1 = new dadosClientes();
                // System.out.println("Escolha 1 para cadastrar, e 3 para listar:");        
                // op = ler.nextInt();
                
                 //if(op < 2){
                clientesM grava = new clientesM();
                dadosClientes CL = new dadosClientes();        
                dadosClientes CL1 = new dadosClientes();   
       
                                String nome;   

                                System.out.println("Adicionar cliente:");
                                 nome = ler.nextLine();                                                                                                                                             // nome = ler.nextLine();
                                 //CL.setNome(nome);                             //setNome(); // lista.add(nome);  
                                                                 
                                CL.setNome("Luis Felipe");
                                CL1.setNome("Nogueira da Silva");
                                //CL.setCpf(6666666);
                                //CL.setDataNascimento("22/02/1976");

                                /*CL.setNome("Fernando");
                                CL.setSobrenome("Vieria da Silva");
                                CL.setCpf(777777);
                                CL.setDataNascimento("02/05/1980");

                                CL.setNome("Márcio");
                                CL.setSobrenome("da Silva");
                                CL.setCpf(333333);
                                CL.setDataNascimento("12/10/1984");*/

                                 //clientesM grava = new clientesM();
                                 grava.adiciona(CL);
                                 grava.adiciona(CL1);

                                System.out.println("Listar");
                                //System.out.println(grava.listarCleintes());  
                                //lista.add(s1);                
                                System.out.println(grava.listarCleintes());  
                                
           
//-----------------------------------------------------------------------------------------------------
                 
               /*  
                 //if(op == 2){
                 String nome;   

                 System.out.println("Nome do cliente:");
                  nome = ler.nextLine();                                                                                                                                             // nome = ler.nextLine();
                  CL.setNome(nome);                             //setNome(); // lista.add(nome);  
                  
                  //clientesM grava = new clientesM();
                  grava.adiciona(CL);    
                 //} Vídeo muito interessante ---> https://www.youtube.com/watch?v=rQkDMVNx4DY
                if(op > 3){
                        System.out.println(grava.listarCleintes());
        
                       }
                  

                  System.out.println("Sair 0, 1 pra continuar:");
                   laco = ler.nextInt();     




                }  

               // }


               if(op > 3){
                System.out.println(grava.listarCleintes());

               }*/
                 //s1 = nome;
                                                                                                                        //dadosClientes lClientes = new dadosClientes();  
                 //lista.add(s1);                                                                                                                                             //lista.setNome(nome);
                                                                                                                                                                                //lista.add(index, nome);
                                                                                                                                                                                //lista.toString();

                  //}
        
      /*     if(op == 3){ 
        String listar= "";

        for(int i=0; i < lista.toString().length(); i++){//------------------------------ TERMINAR        
                
                //listar = lista.getNome();             
                //System.out.println(lista.toString()); 

               // System.out.printf(listar.toString()); 
        }
        //System.out.printf(listar); 
        System.out.println(lista.toString()); 
      
        //}
    
                


      switch(op){
        case 1:
                //System.out.println("Cadastrar");
                chamaClass.Cadastros(lista);//null 
                break;

        case 2:
                System.out.println("Editar");
                chamaClass.editar();
                break;

        case 3:
                System.out.println("Listar");
                chamaClass.listar();
                break;

        case 4:
                System.out.println("Excluir");
                chamaClass.excluir();
                break;

       default:
               System.out.println("Opção invalida.");
       }
        System.out.println("Digite  zero para sair:");
        laco = ler.nextInt(); 

    }
    //Cadastrar
        //Procurar
        //Editar
        //Mostrar
    }*/

    //public String Cadastros(chamaClass chama) {



       // if(op == 1){//chamaClass.Cadastros();
       // String nome;
        
       // dadosClientes lista = new dadosClientes();

        //Scanner lerCad = new Scanner(System.in);
            
       // System.out.println("Nome do cliente:");
       // nome = lerCad.nextLine();                                                                //nome = lerCad.nextLine();
        //ListaClientes.setNome(nome);
        //toString.ListaClientes.add(nome);
        //-------------------------------------lista.setNome(nome); Imprime o nome


        //System.out.print(lista.getNome());      
    //}

    //if(op == 2){//chamaClass.Cadastros();
        //public String listar() {
        //System.out.println("Teste listar");
        //dadosClientes ListaClientes = new dadosClientes();

      //  String listar= "";

       // for(int i=0; i < lista.toString().length(); i++){//------------------------------ TERMINAR        
       //         listar = lista.getNome();             
       //         //System.out.println(listar); 
        //}
        //System.out.printf(listar); 
       
       
         // return ListaClientes.getNome(); 
        
         //return listar();
    //}

  } 
//}

/*private static void extracted(ArrayList<dadosClientes> lista, String nome) {
        ((dadosClientes) lista).setNome(nome);
}*/
}