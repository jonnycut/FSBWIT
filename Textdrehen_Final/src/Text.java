import java.util.Scanner;

public class Text {
	//private String eingabe = new String("Das ist ein Beispiel! Oder?");
	private int wStart;
	private int wEnd = 0;
	private int end = 0;
	private int endSub = 0;
	private char leer = ' ';
	private int i = 0;
	private int a;
	private String ausgabe = "";
	

	
	

	
	
	public void subString(String eingabe) {
		
		
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Geben Sie das Trennzeichen ein:");
		//leer = s1.next();
		
		
		
		end = eingabe.length(); 			//länge des Strings messen
		
		
		for (a = 0; a <= end ; a++) {      //solange, bis das Ende des gesamten Satzes erreicht ist
		
			
		
		wEnd = eingabe.indexOf(leer, wEnd+1);  //ende des Wortes bestimmen
		if (wEnd ==-1) {							//abfangen, falls keine leerstelle gefunden wird, ist das Wortende, das Ende des Strings
			wEnd = end;
			
		}
		
		
		
		String sub = eingabe.substring(wStart, wEnd);  //Substring aus dem eigentlichen String erstellen. Start: nach der letzten gefundenen Leerstelle, Ende vor der nächsten
		
		
			endSub = sub.length();							//länge des neu erstellten SubStrings messen 
			for (i = endSub - 1; i >= 0; i--) {					//für jedes Zeichen des Substrings: sub, beginnend beim letzten, ende beim ersten (wStart)
				ausgabe += sub.charAt(i);
				//System.out.print(sub.charAt(i));		
				if (i ==0){										// Wenn das letzte Zeichen erreicht ist, wird ein Leerzeichen eingefügt
					ausgabe += " ";
					//System.out.print(" ");
				}
				
			}
			wStart = wEnd +1;								//wStart wird auf das Ende des letzten Wortes gesetzt (Damit von da an weitergesucht wird)
			if (wStart > end){								//wenn der Anfang des "nächsten Wortes" größer als die Länge des gesamten Strings ist, wird abgebrochen
				break;
			}
			
			
			
		}
		
		
			
		
	
		
		
	}
	
	public void subStringOut() {
		
		System.out.println(ausgabe);
	
	}
}
