import java.util.Scanner;

public class AutoTest {

	public static void main(String[] args) {
		
		Autohaus ah = new Autohaus();
		Scanner s = new Scanner(System.in);
		String farbe = "";
		int auswahl = 0;
		
		ah.fuellen();
		
		for(;true;){
			System.out.println();
			System.out.println();
			System.out.println("Was möchten Sie tun?");
			System.out.println("0 - abbrechen");
			System.out.println("1 - zaehlen");
			System.out.println("2 - entfernen");
			System.out.println("3 - anzeigen");
		
				
			auswahl = s.nextInt();
			s.nextLine();		//nextLine() liefert ab dem ersten unbehandelten Zeichen, deswegen wird hier die Zeile "geleert" 
			
			switch (auswahl){  //abfrage, was gemacht werden soll
				
				case 0: 
					System.out.println("ABGEBROCHEN!");
					break;
				
				case 1:
					System.out.println("Welche Farbe möchten Sie zählen?");
					
					farbe = s.nextLine();
					System.out.println("Es gibt "+ ah.zaehle(farbe) +" Autos der Farbe " +farbe);
					break;
				
				case 2:
					System.out.println("Autos welche Farbe sollen entfernt werden?");
					farbe = s.nextLine();
					System.out.println("Es wurden" + ah.entferne(farbe) +" Autos der Farbe " + farbe +" entfernt");
					break;
				case 3:
					ah.anzeigen();
					break;			
				
				default:
					System.out.println("Falsche Eingabe. Abgebrochen.");
					break;
					
			}
		}

	}

}
