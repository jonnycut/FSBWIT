package KlausurUebungMaerz;
import java.util.Comparator;

public class Auto implements Comparable<Auto> {
	
	private int hubraum;
	private String kennZ;
	private String farbe;
	
	public Auto(int hubraum, String kennZ, String farbe){
		this.hubraum=hubraum;
		this.kennZ=kennZ;
		this.farbe=farbe;
	}

	public String getKennZ() {
		return kennZ;
	}

	public void setKennZ(String kennZ) {
		this.kennZ = kennZ;
	}

	public int getHubraum() {
		return hubraum;
	}
	
	public String toString(){
		return this.hubraum +"\t"+ this.kennZ+"\t"+this.farbe;
	}

	@Override
	public int compareTo(Auto auto2) {
		
		return this.kennZ.compareTo(auto2.kennZ) ;
	}
	
	public static final Comparator<Auto>
		HUBRAUM_ORDER= new Comparator<Auto>(){
			public int compare(Auto a1, Auto a2){
				return a1.hubraum-a2.hubraum;
			}
		};
		
	public static final Comparator<Auto>
		FARB_ORDER=new Comparator<Auto>(){
			public int compare(Auto a1, Auto a2){
				return a2.farbe.compareToIgnoreCase(a1.farbe);
			}
		};
		
	}


