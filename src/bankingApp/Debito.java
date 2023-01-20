


package bankingApp;

import Base.Base;


public class Debito extends Card{
    
    private double movimentosDia;
    //private Base base;
    
    public Debito(double limiteDiario, Base base, Conta conta, Cliente cliente){
        super();
        this.movimentosDia = limiteDiario;
        //this.base = base;
        //cliente.getCardList().include(this);
    }

    public double getMovimentosDia() {
        return movimentosDia;
    }

    public void setMovimentosDia(double movimentosDia) {
        this.movimentosDia = movimentosDia;
    }
    
}
