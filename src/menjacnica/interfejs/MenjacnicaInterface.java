package menjacnica.interfejs;

import java.util.GregorianCalendar;

import valute.Valuta;

public interface MenjacnicaInterface {
	public void dodajKursValute(GregorianCalendar datum,String nazivValute,int prodajni, int kupovni,int srednji);
	public void obrisiKursValute(GregorianCalendar datum, String nazivValute);
	public Valuta pronadjiKurs(String nazivValute, GregorianCalendar datum);

}
