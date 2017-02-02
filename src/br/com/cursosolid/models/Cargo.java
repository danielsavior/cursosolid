package br.com.cursosolid.models;

import br.com.cursosolid.calc.DezOuVintePorCento;
import br.com.cursosolid.calc.QuinzeOuVinteECincoPorCento;
import br.com.cursosolid.calc.RegraDeCalculo;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new DezOuVintePorCento()),
    TESTER(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra)  {
	    this.regra = regra;
	}
	public RegraDeCalculo getRegra()  {
	    return regra;
	}
}
