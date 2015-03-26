package OsterUebung;
import java.util.Comparator;


public class Osterhase implements Comparable<Osterhase> {
	private Korb korb = new Korb();
	private int groesse;
	
	
	public Osterhase(int groesse){
		this.groesse = groesse;
		String[] farben={"Rot","Blau","Gelb","Rosa","Gruen","Lila"};
		int anzahl= (int)((Math.random()*8)+7);
		
		
		for(int i=0; i<=anzahl;i++){
			int gewicht = (int)((Math.random()*31)+50);
			korb.rein(new Ei(gewicht,farben[(int)(Math.random()*farben.length)]));
		}
	}


	public static final Comparator<Osterhase>
		KORB_ORDER= new Comparator<Osterhase>(){
			public int compare(Osterhase o1, Osterhase o2) {
				
				return o1.korb.gewicht() - o2.korb.gewicht();
			}
	};






	public int compareTo(Osterhase o) {
		
		return this.groesse-o.groesse;
	}
	
	public String toString(){
		
		return "Groesse: " +this.groesse +"\nKorb:\tGesamtgewicht:\t"+ this.korb.gewicht()+"\n"+ this.korb;
		
	}
			
	
}
