package br.com.cursosolid.nf;

import java.util.Observable;
import java.util.Observer;

public class NotaFiscalDao implements Observer{

    public void persiste(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

	@Override
	public void update(Observable o, Object arg) {		
		persiste(((NotaFiscal)arg));
	}
}