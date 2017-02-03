package br.com.cursosolid.encapsulamento.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.cursosolid.encapsulamento.Boleto;
import br.com.cursosolid.encapsulamento.Fatura;
import br.com.cursosolid.encapsulamento.ProcessadorDeBoletos;


public class ProcessadorDeBoletosTest {
	
	@Test
	public void testaProcessa(){
		ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
		Fatura fatura = new Fatura("Juca Feliz", 300.0);
		List<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		boletos.add(new Boleto(100.0));
		
		processadorDeBoletos.processa(boletos, fatura);
		
		
	}
}
