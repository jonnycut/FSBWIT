
public class Autohaus {
		
	private Auto[] autos;
	
	
	public void fuellen(){
		
		autos = new Auto[100];
		String[] farbe = {"weiß", "rot", "blau", "schwarz", "grau", "gruen"};
		
		
		
		for(int i= 0; i< autos.length; i++){
			Auto auto = new Auto();
			int random = (int) (Math.random()*6);
			auto.setFarbe(farbe[random]);
			autos[i] = auto;
				
		}
	}
	
	public void anzeigen(){
		
		for (int i = 0; i < autos.length; i++){
			System.out.print(autos[i]);
			System.out.println("  "+ autos[i].getFarbe());
		}

	}
	
	public int zaehle(String farbe){
		int anzahl = 0;
		
		for (int i = 0; i<autos.length; i++){
			
			if (autos[i].getFarbe().equals(farbe))  anzahl++;
		}
		return anzahl;
	}
	
	public int entferne(String farbe){
		
		int anzahl = 0;
		
		for (int i = 0; i< autos.length; i++){
			
			if (autos[i].getFarbe().equals(farbe)){
				autos[i] = null;
				anzahl ++;
			}
		}
		aufraeumen();
		return anzahl;
	}
	
	public void aufraeumen(){
		int laenge = 0;
		
		for (int i = 0; i< autos.length; i++){
			
			if (autos[i] != null) laenge++;
		}
		
		Auto[] parkplatz = new Auto[laenge];
		
		for (int i = 0, j = 0; i<autos.length;i++){
			
			if (autos[i] != null){ 
				parkplatz[j] = autos[i];
				j++;
			}	
		}
		
		autos = parkplatz;
		
	}
}
