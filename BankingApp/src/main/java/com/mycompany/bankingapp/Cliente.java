
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
    
    static int quantidade;

    private Conta[] contas = new Conta[2];
    String nomeCompleto;
    String nomeSegTitutar;
    String profissao;
    String email;
    int NIF;
    int telefone;
    int dinheiroInicial;
    private List<Conta> contaList;
    private List<Cliente> clienteList;
    
    

    public Cliente(String nomeCompleto, String nomeSegTitutar,String profissao, String email, int NIF, int telefone, int dinheiroInicial){
        this.nomeCompleto = nomeCompleto;
        this.nomeSegTitutar = nomeSegTitutar;
        this.profissao = profissao;
        this.email = email;
        this.NIF = NIF;
        this.telefone = telefone;
        this.dinheiroInicial = dinheiroInicial;
        criarConta(a);
    }

    Cliente(String email)  {
        if (email.length() < 2)
            throw new RuntimeException("O nome \"" + email + "\" deve conter ao mínimo 2 carateres.");
        this.email = email;
    }
    public String getEmail() {
        return email;
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
}
