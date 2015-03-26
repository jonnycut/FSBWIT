package OsterUebung;

public class Ei implements Comparable<Ei>{
	
	private String farbe;
	private int gewicht;
	
	public Ei(int gewicht, String farbe){
		
		this.farbe=farbe;
		this.gewicht=gewicht;
	}

	public String getFarbe() {
		return farbe;
	}

	public int getGewicht() {
		return gewicht;
	}

	@Override
	public int compareTo(Ei ei2) {
		
		return this.gewicht-ei2.gewicht;
	}
	
	public String toString(){
		return "Farbe: "+this.farbe+"\t|\tGewicht: "+this.gewicht+"|";
	}
	
	

}
