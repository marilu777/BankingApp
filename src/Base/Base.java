
package Base;
import bankingApp.Card;
import bankingApp.Cliente;
import bankingApp.Conta;
//import com.mycompany.bankingapp.Conta;
import java.util.ArrayList;


public class Base { 

    private final static Base operaçoes;
    //private static Base db;
    //public final static Base serviços;
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Conta> contas = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    
 
    static {
        operaçoes = new Base();
    }
    private String Conta;

   
    public Base(){
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
        cards = new ArrayList<>();
    };
    
    // Resgistrar novos clientes
    public Cliente signinNovoCliente(String nomeCompleto, String profissao, String email, int NIF, int telefone, int pin){
        Cliente novoCliente = new Cliente(nomeCompleto, profissao, email, NIF, telefone, pin);
        clientes.add(novoCliente);
        return novoCliente;
    }
    
    //Fazer o login do cliente
    public Cliente loginCliente(int NIF, int pin){
        for(Cliente clientes : clientes){
            if((clientes.getNIF()) == NIF && clientes.getPin() == pin){
                System.out.println("Seja Bem vindo");
                return clientes;
            }
        }
        return null;
    };
    
    
    // fazer depoisito de dinheiro
    public void depositar(Conta conta, double dep) {
        conta.depositar = (dep);
        //System.out.println();
        System.out.println("Deposito efetuado");
    }
    
    // fazer o levantamento de dinheiro
    public void levantar(Conta conta, double lev){
        conta.retirar = (lev);
        System.out.println("levantamento efetuado");
    }
    
    
   // fazer 
    public void transferir(Conta conta, double trans){
        conta.transferir = (trans);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    
    
}
