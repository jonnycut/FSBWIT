package CList_100315;
import java.util.Comparator;

public class Auto implements Comparable <Auto> {
	private String kennzeichen;
	private int hubraum;
	
	public Auto(String kennZ, int hubR){
		this.kennzeichen = kennZ;
		this.hubraum = hubR;
	}
	
	public static final Comparator<Auto>
		HUBRAUM_ORDER = new Comparator<Auto>(){
			public int compare(Auto a1, Auto a2){
				return a1.hubraum-a2.hubraum;
			}
		}; //wird aufgerufen mit "Auto.HUBRAUM_ORDER"
	

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
	
	public String toString(){
		
		return this.kennzeichen+"\t"+this.hubraum;
	}
	
	

}
