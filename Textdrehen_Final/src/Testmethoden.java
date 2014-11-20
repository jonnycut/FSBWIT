import java.util.Scanner;


public class Testmethoden {

	public static void main(String[] args) {
		
		Hilfsmethoden hm = new Hilfsmethoden();
		//String message = new String();
		//String cryptoMessage = new String();
		//int zahl = 1234;
		//int qS = 0;
		

		int[] array1 = hm.baue(5);
		int[] array2 = hm.baue(3);
		int[] zusammen = hm.verbinde(array1, array2);
		System.out.println(hm.toString(zusammen));
		
		//for (int i=0; i<=10; i++)		//verwendung der Methoden toString und baue
			//System.out.println(hm.toString(hm.baue(i)));
		
		
		//qS = hm.quersumme(zahl);
		//System.out.println(qS);
		//message = "Hallo Test";
		//Crypto cr = new Crypto();
		//cryptoMessage = cr.encrypt(message);
		
		
		
		
		//System.out.println("Plain: " + message);
		//System.out.println("Encrypted: " + cryptoMessage);
		
		//System.out.println("Fertig");
		//String stringA = "test1";
		//String stringB = "Test";
		//System.out.println(hm.vergleich(stringA, stringB));
		//int [] array = {1, 3, 7};
		
		//System.out.println("Die Summe des Arrays beträgt: " + hm.intAddieren(array));
		
		//System.out.println("Der Durchschnitt beträgt: " + hm.schnitt( array));
		/*Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie p ein:");
		double p = s.nextDouble();
		System.out.println("Bitte geben Sie q ein:");
		double q = s.nextDouble();
		
		
		double[] erg = hm.nullstellen(p,q);
		if (erg == null) System.out.println("Es gibt keine Nullstellen");
		if (erg.length == 1) System.out.println("Es gibt eine Lösung: " + erg[0]);
		if (erg.length == 2){
			for (int i=0; i<= erg.length -1; i++)
				System.out.println(erg[i]);
				
		}*/
		
		
	}

}
