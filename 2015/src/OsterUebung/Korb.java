package OsterUebung;

public class Korb {
	
	private Liste<Ei> korb = new Liste<>();
	
	
	public void rein(Ei ei){
		korb.add(ei);
	}
	
	public Ei raus(){
		
		return korb.pop();
		
		
	}
	
	public int gewicht(){
		int gewicht=0;
		
		for(Ei x:korb)
			gewicht+=x.getGewicht();
		
		return gewicht;
	}
	
	
}
