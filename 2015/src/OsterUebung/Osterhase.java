package OsterUebung;
import java.util.Comparator;


public class Osterhase implements Comparator<T> {
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
				
				return 0;
			}
	};
			
	
}
