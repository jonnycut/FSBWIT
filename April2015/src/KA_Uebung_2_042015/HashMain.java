package KA_Uebung_2_042015;

public class HashMain {

	public static void main(String[] args) {
		HashTable<String> ht = new HashTable<>(10);
		
		ht.add("ab");
		
		ht.add("ef");
		ht.add("gh");
		ht.add("ij");
		ht.add("kl");
		
		
		for(String k:ht){
			System.out.println(k);
		}

	}

}
