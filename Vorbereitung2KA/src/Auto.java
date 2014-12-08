
public class Auto {
	
	
	@Override
	public String toString() {
		return "Auto [kennzeichen=" + kennzeichen + ", hubraum=" + hubraum
				+ ", sitzplaetze=" + sitzplaetze + ", farbe=" + farbe + ", FgNr = " + fgNr + "]";
	}


	private String kennzeichen;
	public String getFgNr() {
		return fgNr;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	private double hubraum;
	private int sitzplaetze = 0;
	private String farbe;
	private String fgNr;
	
	
	public Auto(String farbe, String kennzeichen, double hubraum, int sitzplaetze, String fgNr){
		this(fgNr);
		this.farbe = farbe;
		this.kennzeichen = kennzeichen;
		this.hubraum = hubraum;
		this.sitzplaetze = sitzplaetze;
		
	}
	
	public Auto(String fgNr){
		this.fgNr = fgNr;
	}
	
	public String getFarbe() {
		return farbe;
	}
	

	
	public String getKennzeichen() {
		return kennzeichen;
	}
	

	
	public double getHubraum() {
		return hubraum;
	}
	

	
	public int getSitzplaetze() {
		return sitzplaetze;
	}
	
	
	
	
}
