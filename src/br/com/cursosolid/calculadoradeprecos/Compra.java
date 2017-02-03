package br.com.cursosolid.calculadoradeprecos;

public class Compra {
	private double valor;
	private String cidade;
	
	public Compra(String cidade, double valor) {
		this.cidade = cidade;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
