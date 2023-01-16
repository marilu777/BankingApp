
package bankingApp;


public class Card {
    
    public Conta conta;
    private int ID;
    private int pin;
    
    public Card(){
        this.ID = (int)(Math.random() * (9999-1000) + 1000);
        this.pin = (int)(Math.random() * (9999-1000) + 1000);
    }
    public void levantamento(double valor, Conta conta){
        if(conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
        }
    }
    public void depositar(double valor, Conta conta){
        conta.setSaldo(conta.getSaldo() + valor);
    }
    public void tranferir(double valor, Conta enviar, Conta receber){
        enviar.setSaldo(enviar.getSaldo() - valor);
        receber.setSaldo(receber.getSaldo() + valor);
    }
    public double checkSaldo(Conta conta){
        return conta.getSaldo();
    }
    
    
    

}
