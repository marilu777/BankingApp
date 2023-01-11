
import com.mycompany.bankingapp.Conta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria
 */
public class Cliente {

    private Conta[] contas = new Conta[2];
    private String nomeCompleto;
    private String nomeSegTitutar;
    private String profissao;
    private String email;
    private int NIF;
    private int telefone;
    private float dinheiro;
    private int pin;
    private List<Conta> contaList;
    private List<Cliente> clienteList;
    
    
    public Cliente(int NIF,int pin) {
		this.NIF=NIF;
		this.pin=pin;
	}
    
    public Cliente(String nomeCompleto, String nomeSegTitutar,String profissao, String email, int NIF, int telefone, float dinheiro, int pin){
        this.nomeCompleto = nomeCompleto;
        this.nomeSegTitutar = nomeSegTitutar;
        this.profissao = profissao;
        this.email = email;
        this.NIF = NIF;
        this.telefone = telefone;
        this.dinheiro = dinheiro;
        this.pin = pin;
        criarConta(a);
    }

    Cliente(String email)  {
        if (email.length() < 2)
            throw new RuntimeException("O nome \"" + email + "\" deve conter ao mínimo 2 carateres.");
        this.email = email;
    }


    public void criarConta(List<Client> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getNIF() == NIF){
                System.out.println("Já existe conta com esse NIF");
            }
        }
        
    } 
    class ValidNif {
    public static boolean isValid(final String number){
        int result = Integer.parseInt(number);
        if(result % 9 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
       ValidNif validator = new ValidNif();
       System.out.println(validator.isValid("999999990"));
       System.out.println(validator.isValid("999999999"));
        }
    }  
    
    class ValidPin {
    public static ValidPinint pinValido){
        if(pinValido.length()=4){
        }else{
            return false;
            System.out.println("Deve ter 4 digitos");
        }
    }
    public static void main(String[] args){
        ValidPinint = new ValidPinint();
        System.out.println(isValid("9999"));
    }
        
    }
    
    
    
    
    
    public String getEmail() {
        return email;
    }
}
