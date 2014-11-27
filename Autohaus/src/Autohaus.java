
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
	
	public void anzeigen(){   //gibt den Inhalt des Arrays "autos" zeilenweise aus. (inkl. der Farbe)
		
		for (int i = 0; i < autos.length; i++){
			System.out.print(autos[i]);
			System.out.println("  "+ autos[i].getFarbe());
		}

	}
	
	public int zaehle(String farbe){ //gibt die Anzahl von Autos einer bestimmten Farbe zurück
		int anzahl = 0;
		
		for (int i = 0; i<autos.length; i++){
			
			if (autos[i].getFarbe().equals(farbe))  anzahl++; //es muss die Farbe eines Objektes 
															  //an stelle i von autos  mit der eingegebenen Farbe verglichen werden
		}													  //deswegen muss mit .getFarbe() die Farbe abgefragt werden
		return anzahl;
	}
	
	public int entferne(String farbe){
		
		int anzahl = 0;
		
		for (int i = 0; i< autos.length; i++){
			
			if (autos[i].getFarbe().equals(farbe)){			// schreibt an die Stelle, an der ein objekt (->getFarbe) die geforderte Farbe hat "null"
				autos[i] = null;
				anzahl ++;
			}
		}
		aufraeumen();										//aufräumen wird aufgerufen, um NullPointerException zu vermeiden
		return anzahl;
	}
	
	public void aufraeumen(){								
		int laenge = 0;
		
		for (int i = 0; i< autos.length; i++){				//misst die Anzahl der Autos, die nicht "null" sind
			
			if (autos[i] != null) laenge++;
		}
		
		Auto[] parkplatz = new Auto[laenge];				//ein neues Array der Klasse Autos[] mit der vorher berechneten Länge
		
		for (int i = 0, j = 0; i<autos.length;i++){
			
			if (autos[i] != null){ 							// es werden zwei zähler benötigt (j und i), damit das kürzere Array nicht in einen outOfBounds läuft
				parkplatz[j] = autos[i];
				j++;
			}	
		}
		
		autos = parkplatz;									//der Klassenvariable autos (altes Array) wird das neue - kürzere - zugewiesen
		
	}
}
