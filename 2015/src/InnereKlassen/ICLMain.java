package InnereKlassen;

import java.util.Iterator;


public class ICLMain {

	public static void main(String[] args) {
		ICL liste = new ICL();
		String[] help = {"A","B","C","A","B","G","C","H","Z","A"};
		int zaehler=0;
		
		for(String act:help)
			liste.add(act);
		
		for(Object act:help){
			for(Object next:help){
				if(act.equals(next))
					zaehler++;
			}
		}
		
	System.out.println(zaehler-liste.getSize());
	
		
	}

}
