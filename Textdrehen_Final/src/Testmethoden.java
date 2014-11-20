import java.util.Scanner;


public class Testmethoden {

	public static void main(String[] args) {
		
		Hilfsmethoden hm = new Hilfsmethoden();
		//String stringA = "test1";
		//String stringB = "Test";
		//System.out.println(hm.vergleich(stringA, stringB));
		//int [] array = {1, 3, 7};
		
		//System.out.println("Die Summe des Arrays beträgt: " + hm.intAddieren(array));
		
		//System.out.println("Der Durchschnitt beträgt: " + hm.schnitt( array));
		Scanner s = new Scanner(System.in);
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
		}
		
		
	}

}
