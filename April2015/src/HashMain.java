
public class HashMain {

	public static void main(String[] args) {
		HashTable<String> table = new HashTable<>(9);
		
		
		
		table.add("Hallo");
		table.add("Welt");
		table.add("Abc");
		
		System.out.println(table);
		table.remove("Hallo");
		System.out.println(table);
	
		
		//test
		
	

	}

}
