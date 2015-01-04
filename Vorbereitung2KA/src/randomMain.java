import java.util.Scanner;


public class randomMain {

	
	public static void main(String[] args) {
		
		String[][] array = {{"OFR","MIST","GROßER"},
						   	{"OFR","ZUNDER","BRENNTWIE"},
						   	{"OFR","PELZ","PASCAL"},
						   	{"OFR","TIME","JUSTIN"},
						   	{"OFR","ENHEIM","FRANK"},
						   	{"OFR","ANFANG","ALEX"}};
		
		randomArray rA = new randomArray();
		Scanner s = new Scanner(System.in);
		
		for(;true;){
			int auswahl = 0;
			
			
			
			System.out.println("Was möchten Sie tun?");
			System.out.println("1. - Datensatz hinzufügen");
			System.out.println("2. - Array sortieren");
			System.out.println("3. - Array anzeigen");
			System.out.println("4. - Zufallsausgabe eines Datensatzes");
			System.out.println("0. - Programm beenden");
			
			auswahl = s.nextInt();
			
			switch(auswahl){
			
				case 1:
					
					System.out.println("Bitte nächsten Datensatz eingeben: (DG;Nachname;Vorname");
					array = rA.fuellen(s.next(), array);
					break;
					
				case 2:
					array = rA.sortieren(array);
					break;
					
				case 3:
					rA.ausgabe(array);
					break;
				
				case 4:
					rA.random(array);
					break;
				
				case 0:
					System.out.println("Programm wird beendet");			
					return;
				
				default:
					System.out.println("Ungültige Eingabe");
					break;
					
			}
		} //end for:ture
		
		
		

	} //end main

}
