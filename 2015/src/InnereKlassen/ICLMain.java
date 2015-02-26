package InnereKlassen;

public class ICLMain {

	public static void main(String[] args) {
		ICL liste = new ICL();
		String[] help = {"A","B","C","A","B","G","C","H","Z","A"};
		int zaehler=0;
		
		for(String act:help)
			liste.add(act);
		
	Iterator aussen = liste.new Aufzaehler();
	
	
	
	while(aussen.hasNext()){
		String aktuell = aussen.next();
		Iterator innen = liste.new Aufzaehler();
		while(innen.hasNext()){
			if(aktuell.equalsIgnoreCase(innen.next())) 
				zaehler++;
		}
		
	}
	System.out.println(zaehler-liste.getSize());
	
		
	}

}
