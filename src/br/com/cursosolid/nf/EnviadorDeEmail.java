package br.com.cursosolid.nf;

import java.util.Observable;
import java.util.Observer;

public class EnviadorDeEmail implements Observer {

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

	@Override
	public void update(Observable o, Object arg) {		
		enviaEmail(((NotaFiscal)arg));
		((GeradorDeNotaFiscal)o).imprimeCliente();
	}
}