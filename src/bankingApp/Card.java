package bankingApp;

public abstract class Card {

    //public Conta conta;
    private int numeroCartao;
    private int pin;
    //private double saldo;

    public Card() {
        this.numeroCartao = (int) (Math.random() * (9999 - 1000) + 1000);
        this.pin = (int) (Math.random() * (9999 - 1000) + 1000);
    }

    public void levantamento(double valor, Conta conta) {
        if (conta.getSaldo() >= valor && valor <= 400) {
            conta.setSaldo(conta.getSaldo() - valor);
        }
    }

    public void depositar(double valor, Conta conta) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
        }
    }

    public void tranferir(double valor, Conta enviar, Conta receber) {
        if (valor <= 200) {
            enviar.setSaldo(enviar.getSaldo() - valor);
            receber.setSaldo(receber.getSaldo() + valor);
        }

    }

    public double checkSaldo(Conta conta) {
        return conta.getSaldo();
    }

} 
