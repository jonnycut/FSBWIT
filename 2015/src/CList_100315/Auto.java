package CList_100315;

public class Auto implements Comparable <Auto> {
	private String kennzeichen;
	private int hubraum;
	
	public Auto(String kennZ, int hubR){
		this.kennzeichen = kennZ;
		this.hubraum = hubR;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public int getHubraum() {
		return hubraum;
	}

	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}
	
	public int compareTo(Auto auto2){
		
		return this.kennzeichen.compareToIgnoreCase(auto2.kennzeichen);
		
	}
	
	

}
