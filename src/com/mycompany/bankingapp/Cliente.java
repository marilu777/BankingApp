package com.mycompany.bankingapp;

import java.util.List;

public class Cliente {

    private String nomeCompleto;
    private String profissao;
    private String email;
    private int NIF;
    private int telefone;
    private float dinheiro;
    private int pin;
    private List<Conta> contaList;

    public Cliente(String nomeCompleto, String nomeSegTitutar, String profissao, String email, int NIF, int telefone, float dinheiro, int pin) {
        this.nomeCompleto = nomeCompleto;
        // this.nomeSegTitutar = nomeSegTitutar;
        this.profissao = profissao;
        this.email = email;
        this.NIF = NIF;
        this.telefone = telefone;
        this.dinheiro = dinheiro;
        this.pin = pin;
        // criarConta(a);
    }

    /*
    public void criarConta(List<Client> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNIF() == NIF) {
                System.out.println("Já existe conta com esse NIF");
            }
        }
    }

    
    class ValidNif {

        public static boolean isValid(final String number) {
            int result = Integer.parseInt(number);
            if (result % 9 == 0) {
                return true;
            } else {
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

        public static ValidPinint pinValido

        
            ){
        if (pinValido.length() = 4) {
            } else {
                return false;
                System.out.println("Deve ter 4 digitos");
            }
        }

        public static void main(String[] args) {
            ValidPinint = new ValidPinint();
            System.out.println(isValid("9999"));
        }

    }
    
     */
    public String getEmail() {
        return email;
    }

}
