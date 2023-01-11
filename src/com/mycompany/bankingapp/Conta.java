/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapp;

/**
 *
 * @author Maria
 */
public class Conta extends Operaçoes{
    
    private static int numeroDaConta = 1;
    
    private int numeroConta;
    private String titular;
    private double saldo;
    static int qtdContas = 0;
    private Card card;

    public Conta(Cliente cliente){
        this.numeroConta = numeroDaConta;
        this.cliente = cliente;
        numeroDaConta += 1;
        //this.saldo = saldo;
    }

    void associar(Card card){
        this.card = Card;
    }
    
    public void DadosBancarios(){
        System.out.println("-- Dados Bancarios --"); 
        System.out.println("- Numeros: " + this.numeroConta);
        System.out.println("- Titular: " this.titular);
        System.out.println("- Saldo:" this.saldo);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String aux;
        
        System.out.println("Titular");
        aux = in.nextLine();
        
        
        
        
        
    }
    
    
}
