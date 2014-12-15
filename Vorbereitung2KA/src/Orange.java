
public class Orange {
	private boolean reif;
	private double gewicht;
	private boolean kerne;
	
	
	
	public Orange(boolean kerne, String sorte) {
	
		this.kerne = kerne;
		this.sorte = sorte;
	}
	
	public Orange(boolean kerne, String sorte, double gewicht){
		this(kerne, sorte);
		this.gewicht = gewicht;
		
		
	}
	
	public Orange(boolean kerne, String sorte,boolean reif, double gewicht){
		this(kerne, sorte, gewicht);
		this.reif = reif;		
	}


	private String sorte;
	
	
	
	public boolean isReif() {
		return reif;
	}


	public void setReif(boolean reif) {
		this.reif = reif;
	}


	public double getGewicht() {
		return gewicht;
	}


	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}


	public boolean isKerne() {
		return kerne;
	}


	public String getSorte() {
		return sorte;
	}


	
	


}
