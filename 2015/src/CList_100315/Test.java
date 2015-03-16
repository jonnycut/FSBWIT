package CList_100315;

public class Test {

	public static void main(String[] args) {
		
		
		
		Liste<Auto> l = new Liste<>();
		for(int i=0; i<15;i++){
			l.add(new Auto(baueKennZ(), ((int)(Math.random()*1000))));
		}
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		
		
		
// Testablauf für String und Int Arrays:
		
		
//		String[] daten = {"z","u","g","a"};
//		Liste<String> l = new Liste<String>();
//		for(int i=0; i< daten.length;i++){
//			l.add(daten[i]);
//		}
//		System.out.println("Unsortiert:");
//		System.out.println(l);
//		l.sort();
//		System.out.println();
//		System.out.println("Sortiert:");
//		System.out.println(l);
//
//	
//	
//	Integer[] daten2 = {434,31,2223,21};
//	
//	Liste<Integer> l2 = new Liste<>();
//	
//	for(int i=0; i< daten2.length;i++){
//		l2.add(daten2[i]);
//	}
//	System.out.println();
//	System.out.println("Unsortiert:");
//	System.out.println(l2);
//	l2.sort();
//	System.out.println();
//	System.out.println("Sortiert");
//	System.out.println(l2);

