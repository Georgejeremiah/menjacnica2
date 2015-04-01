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
	public void dodajKursValute(GregorianCalendar datum,String nazivValute,int prodajni, int kupovni,int srednji){
	String skraceniNaziv=nazivValute.substring(3);
	Valuta valuta=new Valuta();
	valuta.setKupovniKurs(kupovni);
	valuta.setNaziv(nazivValute);
	valuta.setSkraceniNaziv(skraceniNaziv);
	valuta.setProdajniKurs(prodajni);
	valuta.setSrednjiKurs(srednji);
	valuta.setDatumValute(datum.get(GregorianCalendar.DAY_OF_WEEK), datum.get(GregorianCalendar.MONTH), datum.get(GregorianCalendar.YEAR));
		valute.add(valuta);
	}
	public void obrisiKursValute(GregorianCalendar datum, String nazivValute){
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getDatumValute().equals(datum)&&valute.get(i).getNaziv().equals(nazivValute)){
				valute.remove(valute.get(i));}
			}
	}
	public Valuta pronadjiKurs(String nazivValute, GregorianCalendar datum){
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getDatumValute().equals(datum)&&valute.get(i).getNaziv().equals(nazivValute)){
			return valute.get(i);}
			}
		return null;
		
		
	}

}
