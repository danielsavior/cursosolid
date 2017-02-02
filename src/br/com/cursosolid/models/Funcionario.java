package br.com.cursosolid.models;

public class Funcionario {
	
	private Cargo cargo;
	private double salarioBase;
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calculaSalario() {
		return  cargo.getRegra().calcula(this);
	}
	
}
