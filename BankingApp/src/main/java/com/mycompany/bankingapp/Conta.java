/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapp;

/**
 *
 * @author Maria
 */
public class Conta {
    
    private static int numeroDaConta = 1;
    
    private int numeroConta;
    private double saldo;
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
}
