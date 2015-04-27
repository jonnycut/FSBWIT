package KA_Uebung042015;

public class Fahrrad implements Comparable <Fahrrad>{
	
	private String typ;
	private int schaltung;
	private String farbe;
	private int groesse;
	private int km;
	
	
	public Fahrrad(String typ, int schaltung, String farbe, int groesse, int km) {

		this.typ = typ;
		this.schaltung = schaltung;
		this.farbe = farbe;
		this.groesse = groesse;
		this.km = km;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public String getTyp() {
		return typ;
	}


	public int getSchaltung() {
		return schaltung;
	}


	public String getFarbe() {
		return farbe;
	}


	public int getGroesse() {
		return groesse;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
		result = prime * result + groesse;
		result = prime * result + schaltung;
		result = prime * result + ((typ == null) ? 0 : typ.hashCode());
		return result;
	}




	@Override
	public int compareTo(Fahrrad f) {
		
		int ret = typ.compareTo(f.typ);
		if(ret!=0)return ret;
		
		ret = schaltung -f.schaltung;
		if(ret!=0) return ret;
		
		ret = farbe.compareTo(f.farbe);
		if(ret !=0) return ret;
		
		ret = groesse - f.groesse;
		if(ret != 0) return ret;
		
		
		
		
		return 0;
	}
	
	public boolean equals(Object o){
		
		if(o == null) return false;
		if(!(o instanceof Fahrrad)) return false;
		
		Fahrrad f = (Fahrrad) o;
		return typ.equals(f.typ) &&
				(schaltung == f.schaltung) &&
				farbe.equals(f.farbe) &&
				(groesse == f.groesse);
	}
	
	
	
	
	
	
	

}
