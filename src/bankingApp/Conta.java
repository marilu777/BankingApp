
package bankingApp;

import java.util.ArrayList;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Card card;
    public double depositar;
    public double retirar;
    public double transferir;
    private Cliente titularPrincipal;
    private ArrayList<Cliente> clienteLista;
    private ArrayList<Card> cardLista;
    private ArrayList<Conta> contaLista;
    //private ArrayList<> cardLista;

    
    public ArrayList<Card> getcardLista(){
        return cardLista;
    }
    
    
    public Conta(Cliente titularPrincipal, double saldo, Cliente cliente){
        this.numeroConta = (int)(Math.random()+100);
        this.titularPrincipal = titularPrincipal;
        if(saldo < 100){
            System.out.println("Deve dar entrada com pelo menos 100 euros");
            return;
        }else{this.saldo = saldo;
            cliente.getContaList();
        }
    }
            
    public void depositar(double valor) {
        setSaldo(this.getSaldo() + valor);
    }
    public void retirar(double valor, int numeroConta){
        setSaldo(this.getSaldo() - valor);
    }
    public void transferir(double valor, Conta enviar, Conta receber){
        enviar.setSaldo(enviar.getSaldo() - valor);
        receber.setSaldo(receber.getSaldo() + valor);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getTransferir() {
        return transferir;
    }

    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }

    public Cliente getTitularPrincipal() {
        return titularPrincipal;
    }

    public void setTitularPrincipal(Cliente titularPrincipal) {
        this.titularPrincipal = titularPrincipal;
    }

    public ArrayList<Cliente> getClienteLista() {
        return clienteLista;
    }

    public void setClienteLista(ArrayList<Cliente> clienteLista) {
        this.clienteLista = clienteLista;
    }

    public ArrayList<Card> getCardLista() {
        return cardLista;
    }

    public void setCardLista(ArrayList<Card> cardLista) {
        this.cardLista = cardLista;
    }
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

    /*public void depositar(double pValor) {
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
    }*/

    double getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    

}
