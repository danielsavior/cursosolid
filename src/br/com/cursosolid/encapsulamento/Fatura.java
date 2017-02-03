package br.com.cursosolid.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;
	private double total;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return (List<Pagamento>) Collections.unmodifiableCollection(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

    private void setPago(boolean pago) {
        this.pago = pago;
    }

	public void addPagamento(Pagamento pagamento) {		
		pagamentos.add(pagamento);
		total = 0;
		total += pagamento.getValor();
		setPago(total>=getValor());
		System.out.println("total>=getValor() " + (total>=getValor()));
	}


}
