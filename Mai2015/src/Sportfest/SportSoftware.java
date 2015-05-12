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
