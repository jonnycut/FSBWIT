import java.util.Scanner;


public class randomMain {

	
	public static void main(String[] args) {
		
		String[][] array = {{"OFR","MIST","GRO�ER"},
						   	{"OFR","ZUNDER","BRENNTWIE"},
						   	{"OFR","PELZ","PASCAL"},
						   	{"OFR","TIME","JUSTIN"},
						   	{"OFR","ENHEIM","FRANK"},
						   	{"OFR","ANFANG","ALEX"}};
		
		randomArray rA = new randomArray();
		Scanner s = new Scanner(System.in);
		
		for(;true;){
			int auswahl = 0;
			
			
			
			System.out.println("Was m�chten Sie tun?");
			System.out.println("1. - Datensatz hinzuf�gen");
			System.out.println("2. - Array sortieren");
			System.out.println("3. - Array anzeigen");
			System.out.println("4. - Zufallsausgabe eines Datensatzes");
			
			auswahl = s.nextInt();
			
			switch(auswahl){
			
				case 1:
					
					System.out.println("Bitte n�chsten Datensatz eingeben: (DG;Nachname;Vorname");
					array = rA.fuellen(s.next(), array);
					break;
					
				case 2:
					array = rA.sortieren(array);
					break;
					
				case 3:
					rA.ausgabe(array);
					break;
				
				case 4:
					//random
					break;
				
				default:
					System.out.println("Ung�ltige Eingabe");
					break;
					
			}
		} //end for:ture
		
		
		

	} //end main

}
