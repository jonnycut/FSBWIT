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
			for(Simpson s: werte.keySet()){
				if(werte.get(s).equals(i))
					ret+="\n"+platz+"."+s.getName()+"("+i+")";
			}
				
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
