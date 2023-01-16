package bankingApp;

import java.util.ArrayList;
import java.util.List;

// 1102482577
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maria
 */
public class Cliente extends Object {
    /**
     *
     * @param string
     * @return
     */

    private String nomeCompleto;
    private String nomeSegTitutar;
    private String profissao;
    private String email;
    private int NIF;
    private int telefone;
    private double dinheiro;
    private int pin;
    private List<Conta> contas;
    private List<Card> cards;
    //private ArrayList<Object> contas;

    // Criar conta
    public Cliente(String nomeCompleto, String profissao, String email, int NIF, int telefone, int pin) {
        /* vai para a base
        ArrayList<Cliente> a = Base.getInstance().getClientes();
        for(int i=0; i < a.size();i++){
            if(a.get(i).getNIF() == NIF){
                System.out.println("Ja existe cliente com esse NIF");
                return;
            }
        }*/

        this.nomeCompleto = nomeCompleto;
        //this.nomeSegTitutar = nomeSegTitutar;
        this.profissao = profissao;
        this.email = email;
        //this.dinheiro = dinheiro;
        // agora queremos validar o formato do NIF
        boolean validNif = Cliente.validarNIF("" + NIF);
        if (validNif) {
            this.NIF = NIF;
        }
        boolean validTelefone = Cliente.validarTelefone("" + telefone);
        if (validTelefone) {
            this.telefone = telefone;
        }
        boolean validPin = Cliente.validarPin("" + pin);
        if (validPin) {
            this.pin = pin;
        }

        //criarConta(a);
        System.out.println("Cliente criado");
    }

    /*
    // tentar o login
    public Cliente(int NIF,int pin) {
        System.out.println("Coloque os seus dados");
		this.NIF=NIF;
		this.pin=pin;
                this.contasList = new ArrayList<>();
	}
    
    // tentar editor
    public Cliente(String profissao, String email, int telefone){
        System.out.println("Edite os seus dados");
        this.profissao = profissao;
        this.email = email;
        this.telefone = telefone;
    }
     */
    void alterarPin(int pin) {
        this.pin = pin;
    }

    // Filtro para o telefone
    /*
    Telefone(String telefone){
        if (telefone.length() != 9)
            throw new RuntimeException("O numero \"" + telefone + "\" deve conter 9 numeros.");
        this.telefone = telefone;
    }
     */
 /* TODO
    public void criarConta(List<Client> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNIF() == NIF) {
                System.out.println("Já existe conta com esse NIF");
            }
        }

    }
     */
    //class ValidNif {
    public static boolean validarNIF(final String NIF) {
        if (NIF.length() == 9) {
            return true;
        } else {
            System.out.println("O NIF deve ter 9 digitos");
            return false;
        }
    }

    // class validarTelefone
    public static boolean validarTelefone(final String telefone) {
        if (telefone.length() == 9) {
            return true;
        } else {
            System.out.println("O numero de telefone deve ter 9 digitos");
            return false;
        }
    }

    // class validarPin {
    public static boolean validarPin(final String pin) {
        if (pin.length() == 4) {
            return true;
        } else {
            System.out.println("O pin deve ter 4 digitos");
            return false;
        }
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSegTitutar() {
        return nomeSegTitutar;
    }

    public void setNomeSegTitutar(String nomeSegTitutar) {
        this.nomeSegTitutar = nomeSegTitutar;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    
    
    
    @Override
    public String toString() {
        return "Cliente" + "nomeCompleto = " + nomeCompleto + ", NIF = " + NIF;
    }

    Object getContaList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
