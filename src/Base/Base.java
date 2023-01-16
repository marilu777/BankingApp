/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private Base(){  
    };
   
    
    // Resgistrar novos clientes
    public Cliente signinNovoCliente(String nomeCompleto, String profissao, String email, int NIF, int telefone, int pin){
        Cliente novoCliente = new Cliente(nomeCompleto, profissao, email, NIF, telefone, pin);
        clientes.add(novoCliente);
        return novoCliente;
    }
    
    //
    
    
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
    
    /*
    public Boolean loginAutenticaçao(String nif, int pin){
        for(Cliente clientes : clientes)
    }
    */
    
}
