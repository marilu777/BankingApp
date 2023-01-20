package bankingApp;

import Base.Base;

public class Credito extends Card { // talvez extends Debito

    private double movimentosCredito;
    private double plafond;
    //private Base base;

    public Credito(double limiteDiario, double palfond, Base base, Conta conta, Cliente cliente) {
        super();
        this.movimentosCredito = limiteDiario;
        this.plafond = plafond;
        //this.base = base;
    }

    public void tranferirPlafond(double plafond, Conta enviar, Conta receber) {
        if (plafond <= 200) {
            enviar.setSaldo(enviar.getSaldo() - plafond);
            receber.setSaldo(receber.getSaldo() + plafond);
        }
    }

    public double getMovimentosCredito() {
        return movimentosCredito;
    }

    public void setMovimentosCredito(double movimentosCredito) {
        this.movimentosCredito = movimentosCredito;
    }

    public double getPlafond() {
        return plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }

}
