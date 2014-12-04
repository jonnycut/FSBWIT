
public class Auto {
	
	private String kennzeichen;
	private double hubraum = 0.0;
	private int sitzplaetze = 0;
	private String farbe;
	
	
	
	public Auto(String farbe, String kennzeichen, double hubraum, int sitzplaetze){
		this.farbe = farbe;
		this.kennzeichen = kennzeichen;
		this.hubraum = hubraum;
		this.sitzplaetze = sitzplaetze;
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
