package Sportfest;
import java.util.*;



public class HAMain {
	
	public static Set<Simpson> frauen = new HashSet<>();
	public static Set<Simpson> maenner = new HashSet<>();
	public static Set<Simpson> AKWmitarbeiter = new HashSet<>();
	public static Set<Simpson> moes = new HashSet<>();
	public static Map<Simpson, Set<Simpson>> kindVon = new HashMap<>();
	
	public static void main(String[] args) {
		frauen.add(new Simpson("March"));
		frauen.add(new Simpson("Maggie"));
		frauen.add(new Simpson("Fitch"));
		frauen.add(new Simpson("Mudder von Milhouse"));
		
		maenner.add(new Simpson("Homer"));
		maenner.add(new Simpson("Lenny"));
		maenner.add(new Simpson("Barney"));
		maenner.add(new Simpson("bart"));
		maenner.add(new Simpson("Milhouse"));
		maenner.add(new Simpson("Vadder von Milhouse"));
		
		AKWmitarbeiter.add(new Simpson("Homer"));
		AKWmitarbeiter.add(new Simpson("Lenny"));
		AKWmitarbeiter.add(new Simpson("Fitch"));
		
		moes.add(new Simpson("Homer"));
		moes.add(new Simpson("Lenny"));
		moes.add(new Simpson("Barney"));
		
		Set<Simpson> eltern = new HashSet<>();
		
		eltern.add(new Simpson("Homer"));
		eltern.add(new Simpson("March"));
		
		kindVon.put(new Simpson("Bart"), eltern);
		kindVon.put(new Simpson("Lisa"), eltern);
		
		eltern = new HashSet<>();
		
		eltern.add(new Simpson("Vadder von Milhouse"));
		eltern.add(new Simpson("Mudder von Milhouse"));
		
		kindVon.put(new Simpson("Milhouse"),eltern);
		
		
		
	
		
		printEinladungen();
		

	}
	
	public static void printEinladungen(){
		
		for(Simpson s: AKWmitarbeiter){
			
			if(frauen.contains(s))
				System.out.println("Werte Mrs. "+s.getName()+",");
			else
				System.out.println("Werter Mr. "+s.getName()+",");
			
			System.out.println("hiermit lade ich Sie ");
			
			int kinder =0;
			
			for(Set<Simpson> eltern:kindVon.values()){
				if(eltern.contains(s))
					kinder++;
			}
			
			if(kinder ==1)
				System.out.println("und Ihr Kind");
			if(kinder >1)
				System.out.println("und Ihre Kinder");
			
			System.out.println(" zum Gerätefest ein!");
			
			
		}
		
	}

}
