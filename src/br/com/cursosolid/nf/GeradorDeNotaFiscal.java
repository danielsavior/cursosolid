package br.com.cursosolid.nf;

import java.util.Observable;
import java.util.Observer;

public class GeradorDeNotaFiscal extends Observable {
	
	public static void main(String[] args) {
		new GeradorDeNotaFiscal(new Observer[]{new EnviadorDeEmail(),new NotaFiscalDao()}).gera(new Fatura(325.0, "Juca Feliz"));
	}
	
    public GeradorDeNotaFiscal(Observer... observers) {
      for (Observer observer:observers ){
    	  this.addObserver(observer);            
      }
    	
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
        
        setChanged();
        notifyObservers(nf);                

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
    
    public void imprimeCliente(){
    	System.out.println("Juca");
    }
}
