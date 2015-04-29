package KA_Uebung_2_042015;

public class HashMain {

	public static void main(String[] args) {
		HashTable<String> ht = new HashTable<>(4);
		
		
		ht.add("Hallo");
		ht.add("Welt");
		System.out.println(ht);
		ht.add("test");
		
		
		
		System.out.println(ht);
		ht.remove("Hallo");
		System.out.println(ht);
	

	}

}
