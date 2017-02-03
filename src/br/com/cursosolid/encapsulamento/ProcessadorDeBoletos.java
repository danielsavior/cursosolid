package br.com.cursosolid.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeBoletos {
	
	public static void main(String[] args) {
		ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
		Fatura fatura = new Fatura("Juca Feliz", 300.0);
		List<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		
		processadorDeBoletos.processa(boletos, fatura);
		
		Fatura fatura2 = new Fatura("Juca Feliz", 600.0);
		boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		
		processadorDeBoletos.processa(boletos, fatura2);
	}
	
    public void processa(List<Boleto> boletos, Fatura fatura) {

        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.addPagamento(pagamento);
        }
    }
}
