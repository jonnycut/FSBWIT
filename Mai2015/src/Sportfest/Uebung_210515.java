package Sportfest;
import java.util.*;

public class Uebung_210515 {
	
	public static Set<Simpson> kinder = new HashSet<>();
	public static Set<Simpson> kinderM = new HashSet<>();
	public static Set<Simpson> kinderW = new HashSet<>();
	public static Map<Simpson,Set<Simpson>> simpsons = new HashMap<>();
	public static Map<Simpson,Set<Simpson>> milhouses = new HashMap<>();
	public static Map<Simpson,Set<Simpson>> wiggoms = new HashMap<>();
	public static Map<Simpson,Set<Simpson>> bewohner = new HashMap<>();
	

	public static void main(String[] args) {
		
		kinder.add(new Simpson("Bart"));
		kinder.add(new Simpson("Lisa"));
		kinder.add(new Simpson("Maggie"));
		
		kinderM.add(new Simpson("milhouse"));
		
		kinderW.add(new Simpson("Ralph"));
		
		simpsons.put(new Simpson("Homer"),kinder);
		simpsons.put(new Simpson("Marge"),kinder);
		
		
		milhouses.put(new Simpson("Körk"),kinderM);
		milhouses.put(new Simpson("Luän"), kinderM);

		
		wiggoms.put(new Simpson("Chief W"), kinderW);
		
		bewohner.put(new Simpson("Lenny"), null);
		bewohner.put(new Simpson("Carl"),null);
		bewohner.put(new Simpson("Barney"),null);
		
		
		for(Simpson s:simpsons.keySet())
			bewohner.put(s,simpsons.get(s));
		
		for(Simpson s:milhouses.keySet())
			bewohner.put(s, milhouses.get(s));
		
		for(Simpson s:wiggoms.keySet())
			bewohner.put(s, wiggoms.get(s));
		
		System.out.println("Einwohner\t-\tKinder");
		System.out.println();
		
		for(Simpson s:bewohner.keySet())
			if(bewohner.get(s)==null)
				System.out.println(s+"\t\t-\tKEINE BLAGEN");
			else
				System.out.println(s+"\t\t-\t"+bewohner.get(s));
		
		Set<Simpson> kinderlos=kinderlos();
		
		System.out.println("\n\nKinderlos:");
		for(Simpson s:kinderlos)
			System.out.println(s);
		
		
		System.out.println("\nKinder von Homer:");
		System.out.println(gebeKinderVon("Homer"));
		
		System.out.println("\nKinder von Marge:");
		System.out.println(gebeKinderVon("Marge"));
		
		System.out.println("\nKinder von Lenny:");
		System.out.println(gebeKinderVon("Lenny"));
		
		System.out.println();
		System.out.println();
		System.out.println("Familie Simpson:");
		familieSimpson();
		
		
		

	}
	
	
	
	public static Set<Simpson> kinderlos(){
		
		Set<Simpson> kinderlos = new HashSet<>();
		
		for(Simpson s:bewohner.keySet())
			if(bewohner.get(s)==null)
				kinderlos.add(s);
		
		return kinderlos;
	}
	
	public static Set<Simpson> gebeKinderVon(String name){
		
		
		
		
		for(Simpson s:bewohner.keySet())
			if(s.getName().equals(name))
				return bewohner.get(s);
		
			return null;
		
		
		
		
		
	}
	
	public static void familieSimpson(){
		
		Set<Simpson> familieS = new HashSet<>();
		List<Simpson> temp = new ArrayList<>();
		
		for(Simpson s: simpsons.keySet()){
			familieS.add(s);
			temp = new ArrayList<>(simpsons.get(s));
			for(Simpson s2:temp)
				familieS.add(s2);
		}	
		
		
		
		
		System.out.println(familieS);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//end main
