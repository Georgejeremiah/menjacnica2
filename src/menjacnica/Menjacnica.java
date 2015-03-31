package menjacnica;

import java.util.LinkedList;

import valute.Valuta;

public class Menjacnica {
	private LinkedList<Valuta>valute=new LinkedList<Valuta>();

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(Valuta valuta) {
		valute.add(valuta);
	}

}
