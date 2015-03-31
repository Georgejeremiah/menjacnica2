package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterface;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterface {
	private LinkedList<Valuta>valute=new LinkedList<Valuta>();

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(Valuta valuta) {
		valute.add(valuta);
	}
	public void dodajKursValute(GregorianCalendar datum,String nazivValute,int prodajni, int kupovni,int srednji){}
	public void obrisiKursValute(GregorianCalendar datum, String nazivValute){}
	public Valuta pronadjiKurs(String nazivValute, GregorianCalendar datum){}

}
