/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingApp;

import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class Conta {

    //private int contador = 1;
    private int numeroConta;
    // private String titular;
    private double saldo;
    // private int qtdContas = 0;
    // private ArrayList<Card> cardList;

    /*new Conta*/
 /*public Conta(Cliente cliente){
        this.numeroConta = contador;
        this.cliente = cliente;
        numeroDaConta += 1;
        //this.saldo = saldo;
    }
     */

 /*
    void associar(Card card){
        this.card = Card;
    }
     */
 /*
    public void DadosBancarios(){
        System.out.println("-- Dados Bancarios --"); 
        System.out.println("- Numeros: " + this.numeroConta);
        System.out.println("- Titular: " this.titular);
        System.out.println("- Saldo:" this.saldo);
    }
     */
 /*
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String aux;
        
        System.out.println("Titular");
        aux = in.nextLine();   
    }
     */
    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + '}';
    }

    public void depositar(double pValor) {
        this.saldo += pValor;
        System.out.println("- Saldo Atual" + this.saldo);
        System.out.println("Deposito efetuado");
    }

    public void levantar(double pValor) {

        if (pValor <= this.saldo) {
            this.saldo -= pValor;
            System.out.println("- Saldo Atual:" + this.saldo);
        } else {
            System.out.println("- Saldo insuficiente");
        }
    }

}
