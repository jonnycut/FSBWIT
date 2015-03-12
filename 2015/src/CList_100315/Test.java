package CList_100315;

public class Test {

	public static void main(String[] args) {
		String[] daten = {"B","D","A","C"};
		Liste<String> l = new Liste<String>();
		for(int i=0; i< daten.length;i++){
			l.add(daten[i]);
		}
		
		System.out.println(l);
		l.sort();
		System.out.println("Sortiert:");
		System.out.println(l);

	
	
	Integer[] daten2 = {4,1,3,2};
	
	Liste<Integer> l2 = new Liste<>();
	
	for(int i=0; i< daten2.length;i++){
		l2.add(daten2[i]);
	}
	System.out.println(l2);
	l2.sort();
	System.out.println("Sortiert");
	System.out.println(l2);

}
}