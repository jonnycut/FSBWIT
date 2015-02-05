package doubleChainedList05022015;

public class Falk {
	private String kevin;
	private String farbe;
	
	public Falk(String kevin, String farbe){
		this.kevin=kevin;
		this.farbe=farbe;
	}
	
	public String toString(){
		return "[Kevin= "+kevin+"\t|| Farbe:\t"+farbe+"\t]"; 
	}

	public String getKevin() {
		return kevin;
	}

	public void setKevin(String kevin) {
		this.kevin = kevin;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	
	
}
