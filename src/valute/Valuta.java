package valute;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datumValute;
	private int prodajniKurs;
	private int kupovniKurs;
	private int srednjiKurs;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv.equals(null)||naziv.equals(" ")){
			System.out.println("Polje naziv mora imati konkretne vrednosti");}
		else{
		this.naziv = naziv;}
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv.equals(null)||skraceniNaziv.equals(" ")){
			System.out.println("Polje skraceniNaziv mora imati konkretne vrednosti");}
		else{
	       this.skraceniNaziv = skraceniNaziv;}
	}
	public GregorianCalendar getDatumValute() {
		return datumValute;
	}
	public void setDatumValute(int dan,int mesec,int godina) {
		if(dan<0||dan>7||mesec<0||mesec>12||godina<2000){
			System.out.println("Uneti podaci nisu validni");}
		else{
			datumValute.set(mesec-1, dan, godina);
		}
		
	}
	public int getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(int prodajniKurs) {
		if(prodajniKurs<=0){
			System.out.println("Uneta vrednost prodajnog kursa nije validna");}
		else{
		this.prodajniKurs = prodajniKurs;}
	}
	public int getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(int kupovniKurs) {
		if(kupovniKurs<=0){
			System.out.println("Uneta vrednost kupovnog kursa nije validna");}
		else{
		this.kupovniKurs = kupovniKurs;}
	}
	public int getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(int srednjiKurs) {
		if(srednjiKurs<=0){
			System.out.println("Uneta vrednost srednjeg kursa nije validna");}
		else{
		this.srednjiKurs = srednjiKurs;}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datumValute == null) ? 0 : datumValute.hashCode());
		result = prime * result + kupovniKurs;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + prodajniKurs;
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		result = prime * result + srednjiKurs;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datumValute == null) {
			if (other.datumValute != null)
				return false;
		} else if (!datumValute.equals(other.datumValute))
			return false;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Naziv valute: "+naziv+" Prodajni kurs: "+prodajniKurs+" Kupovni kurs: "+kupovniKurs;
	}

}
