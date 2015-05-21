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
		kindVon.put(new Simpson("Maggie"),eltern);
		
		eltern = new HashSet<>();
		
		eltern.add(new Simpson("Vadder von Milhouse"));
		eltern.add(new Simpson("Mudder von Milhouse"));
		
		kindVon.put(new Simpson("Milhouse"),eltern);
		
		
		
	
		
		printEinladungen();
		System.out.println();
		System.out.println();
		
		zeigeAnzahl();
		

	}
	
	public static void printEinladungen(){
		
		for(Simpson s: AKWmitarbeiter){
			
			if(frauen.contains(s))
				System.out.println("Werte Mrs. "+s.getName()+",");
			else
				System.out.println("Werter Mr. "+s.getName()+",");
			
			System.out.println("hiermit lade ich Sie ");
			
			int kinder =0;
			
			for(Set<Simpson> eltern : kindVon.values()){
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
	
	public static void zeigeAnzahl(){
		
		int counterMoe = 0;
		Set<Simpson> kinder = new HashSet<>();
		
		for(Simpson s: AKWmitarbeiter){
			for(Simpson kind : kindVon.keySet()){
				if (kindVon.get(kind).contains(s))
					kinder.add(kind);
					
			}	
		}
		
		for(Simpson s: moes)
			if(AKWmitarbeiter.contains(s))
				counterMoe ++;
		
		
		System.out.println("Gesamtpersonen: "+(AKWmitarbeiter.size()+kinder.size()));
		System.out.println("Kinder: " +kinder.size());
		System.out.println("Moes: "+counterMoe);
		
	}
	
	public static void printEinladungen2(){
		List<Simpson> mitarbeiter = new ArrayList<>(AKWmitarbeiter);
		Collections.sort(mitarbeiter, new Comparator<Simpson>(){
			public int compare(Simpson s1, Simpson s2){
				if(frauen.contains(s1))
					if(frauen.contains(s2))
						return s1.compareTo(s2);
					else return -1;
				else
					if(frauen.contains(s2))
						return 1;
					else return s1.compareTo(s2);
			};
			
			});
	}
	
	


}
