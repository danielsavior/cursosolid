package br.com.cursosolid.calculadoradeprecos;

public class CalculadoraDePrecos {
	
	private TabelaDeFrete frete;
	private TabelaDePreco tabela;

	public CalculadoraDePrecos(TabelaDeFrete frete, TabelaDePreco tabela) {
        this.frete = frete;
        this.tabela = tabela;
	}
	
	public static void main(String[] args) {
		System.out.println("Valor da compra: " + new CalculadoraDePrecos(new Frete(), new TabelaDePrecoPadrao()).calcula(new Compra("Divinolândia",256.32)));
	}
	
    public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double valorFrete = frete.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + valorFrete;
    }
}
