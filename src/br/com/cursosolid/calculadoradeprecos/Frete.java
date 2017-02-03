package br.com.cursosolid.calculadoradeprecos;

public class Frete implements TabelaDeFrete {
    
	@Override
	public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }

}