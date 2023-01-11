/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapp;

/**
 *
 * @author Maria
 */
public class Operaçoes implements Conta{
    
    public void depositar(double pValor){
        this.saldo += pValor;
        System.out.println("- Saldo Atual" + this.saldo);
        System.out.println("Deposito efetuado");
    }
    
    public void Levantamento(double pValor){
        
        if(pValor <= this.saldo){
            this.saldo -= pValor;
            System.out.prinln("- Saldo Atual:" + this.saldo);
        }else{
            System.out.println("- Saldo insuficiente");
        }
    }
}
