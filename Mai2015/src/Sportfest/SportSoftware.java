package Sportfest;


import java.util.*;



public class SportSoftware {
	
	@SuppressWarnings("unused")
	private Map<String, Map<Simpson, Integer>> leistungen = new HashMap<>();
	
	
	private Set<Simpson> teilnehmer = new HashSet<>();
	
	
	public void neuerDatensatz(String s){
		
		String puffer[] = s.split(",");
		
		Simpson tmpSimpson = new Simpson(puffer[1]);
		String tmpDisZi = puffer[2];
		int tmpWert = Integer.parseInt(puffer[3]);
		
		teilnehmer.add(tmpSimpson);
		
		Map<Simpson,Integer> werte = leistungen.get(tmpDisZi);
		if(werte ==null){
			werte = new HashMap<>();
			werte.put(tmpSimpson, tmpWert);
			leistungen.put(tmpDisZi,  werte);
			
		}
		else{
			Integer alt = werte.get(tmpSimpson);
			if(alt==null||new Vergleicher(tmpDisZi).compare(tmpWert, alt)>0)
				
				werte.put(tmpSimpson, tmpWert);
		}
		
		
		
		
	}
	
	public int getTeilnehmerzahl(){
		
		return teilnehmer.size();
	}
	
	public List<Simpson> getTeilnehmer(){

		return new ArrayList<>(teilnehmer);
		
		
	}
	
	public List<String> getDisziplin(){
		
		return new ArrayList<>(
		leistungen.keySet());  //liefert alle Schluessel ohne die verknuepften Daten zurück!
		
	}
	
	public String erstelleUrkunde(Simpson s){
		
		String ret = s.getName()+"";
		
		for(String d : leistungen.keySet()){
			Map<Simpson, Integer> werte = leistungen.get(d);
			Integer i = werte.get(s);
			if(i!=null)
				ret += "\n "+d+""+i;
		}
		
		return ret;
	}
	
	public String erstelleTop3Fuer(String disziplin){
		
		Map<Simpson, Integer> werte = leistungen.get(disziplin);
		Comparator<Integer> comp = new Vergleicher(disziplin);
		
		TreeSet<Integer> besteValues = new TreeSet<>(comp);
		besteValues.addAll(werte.values());
		
		int platz = 1;
		String ret = disziplin +"\n";
		
		for(Integer i:besteValues){
			String zeile = "\n "+platz+".";
			
			for(Simpson s: werte.keySet()){
				if(werte.get(s).equals(i))
					ret+=zeile+s.getName()+"("+i+")";
				platz++;
			}
			if(platz>3) break;
				
		}
		
		return ret;
		
		
		
		
		
	}
	
	public List<Simpson> getSieger(){
		Map<Simpson, Integer> tabelle = new HashMap<>();
		
		for(String disziplin: leistungen.keySet()){
			
			Map<Simpson, Integer> werte = leistungen.get(disziplin);
			Comparator<Integer> comp = new Vergleicher(disziplin);
			
			TreeSet<Integer> besteValues = new TreeSet<>(comp);
			besteValues.addAll(werte.values());
			
			int punkte = 3;
			
			
			for(Integer i:besteValues){
				int temp = punkte;
				
				for(Simpson s: werte.keySet()){
					if(werte.get(s).equals(i)){
						Integer bisher = tabelle.get(s);
						if(bisher==null)
							tabelle.put(s, temp);
						else
							tabelle.put(s, bisher+temp);
						punkte--;
						
					}
					if(punkte<=0) break;
				}
				
			}
			
		}
		List<Simpson> ret = new ArrayList<>();
		
		if(tabelle.size()>0){
			int max = Collections.max(tabelle.values());
			
			for(Simpson s: tabelle.keySet())
				if(tabelle.get(s)==max)
					ret.add(s);
		}
		return ret;
	}
	
	private class Vergleicher implements Comparator<Integer>{

		private boolean kleinerIstBesser;
		
		public Vergleicher(String disziplin){
			kleinerIstBesser = disziplin.contains("lauf");
			
		}
		
		public int compare(Integer i1, Integer i2){

			return kleinerIstBesser? i2-i1 : i1-i2;
				
		}
	}
		

	
	

}
