package CList_100315;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		String text =
				"Russland sei an Krieg nicht interessiert "+
				"Russlands Präsident Wladimir Putin sieht nach den "+
				"Minsker Friedensgesprächen für die Ostukraine eine "+
				"Chance für eine schrittweise Normalisierung der Lage "+
				"im Kriegsgebiet Donbass."+
				" "+
				"\"Wenn das Minsker Abkommen für eine Lösung des "+
				"Konflikts in der Ostukraine erfüllt wird, dann bin "+
				"ich überzeugt, dass die Situation sich schrittweise "+
				"normalisiert\", sagte Putin. Russland sei wie Europa "+
				"nicht an Krieg interessiert, betonte der Präsident "+
				"nach Kreml-Angaben in einem Interview des "+
				"Staatsfernsehens."+
				" "+
				"\"Ich denke, dass ein solch apokalyptisches Szenario "+
				"wohl kaum möglich ist - und hoffe, dass es dazu nicht "+
				"kommt\", sagte der Kremlchef. Demnach sehe Putin auch "+
				"Anzeichen dafür, dass durch die Verhandlungen in "+
				"Minsk allmählich wieder Vertrauen zwischen Russland, "+
				"Deutschland und Frankreich entstehe. Er erklärte "+
				"zudem, ein weiteres Treffen mit Deutschland, "+
				"Frankreich und der Ukraine zum Ukraine-Konflikt sei "+
				"nicht erforderlich. Er hoffe, dass die zuletzt in "+
				"Minsk getroffenen Verabredungen umgesetzt würden.";
		
		
		String[] woerter = text.split(" ");
		Liste<String> l = new Liste<>();
		for(String add:woerter){
			l.add(add);
		}
		
		class vergleichQ implements Comparator<String>{

			
			public int compare(String s1, String s2) {
				
				return s1.substring(s1.length()-1).compareTo(s2.substring(s2.length() -1));
			}
			
		}
		
			
		
		l.sort2(new vergleichQ());
		
		//(Comparator)Collator.getInstance(Locale.GERMAN) --> Sortierung inkl. Umlaute
		
		for(String k:l){
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Testlauf für eine AutoListe	
//		Liste<Auto> l = new Liste<>();
//		for(int i=0; i<15;i++){
//			l.add(new Auto(baueKennZ(), ((int)(Math.random()*10000))));
//		}
//		System.out.println(l);
//		
//		class HubraumVAb implements Comparator<Auto>{
//
//			
//			public int compare(Auto auto1, Auto auto2) {
//				
//				return auto1.getHubraum()-auto2.getHubraum();
//			}
//			
//			
//			
//		}//end vergleicher absteigend
//		
//		class HubraumVAuf implements Comparator<Auto>{
//
//			
//			public int compare(Auto auto1, Auto auto2) {
//				
//				return auto2.getHubraum()-auto1.getHubraum();
//			}
//			
//		}// end Vergleicher aufsteigend
//		
//		System.out.println("\nAbsteigend:\n");
//		l.sort2(new HubraumVAb());
//		System.out.println(l);
//		
//		System.out.println("\nAufsteigend: \n");
//		l.sort2(new HubraumVAuf());
//		System.out.println(l);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private static String baueKennZ(){
		String ret = "";
		ret += ((char) ((Math.random()*26)+'A'));
		ret +="-";
		ret += ((char) ((Math.random()*26)+'A'));
		ret += ((char) ((Math.random()*26)+'A'));
		ret += " ";
		ret +=(int) (Math.random()*100);
		
		
		
		return ret;
	}
}		
		
		


