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
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getDatumValute().equals(datum)&&valute.get(i).getNaziv().equals(nazivValute)){
				valute.get(i).setKupovniKurs(kupovni);
				valute.get(i).setProdajniKurs(prodajni);
				valute.get(i).setSrednjiKurs(srednji);
			}
		}
	}
	public void obrisiKursValute(GregorianCalendar datum, String nazivValute){
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getDatumValute().equals(datum)&&valute.get(i).getNaziv().equals(nazivValute)){
				valute.get(i).setKupovniKurs(0);
				valute.get(i).setProdajniKurs(0);
				valute.get(i).setSrednjiKurs(0);}
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
