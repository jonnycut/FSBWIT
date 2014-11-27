
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
		return anzahl;
	}
	
	public Auto[] aufraeumen(){
		int laenge = 0;
		
		for (int i = 0; i< autos.length; i++){
			
			if (autos[i] != null) laenge++;
		}
		
		parkplatz = new Auto[laenge];
		
		
		return autos;
	}
}
