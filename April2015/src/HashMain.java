
public class HashMain {

	public static void main(String[] args) {
		HashTable<String> table = new HashTable<>(9);
		
		table.add("hallo");
		table.add("nicht so tief Ruediger");
		table.add("wolfgang pass auf");
		table.add("welt");
		table.add("das war kein Meter");
		table.add("uhrzeit");
		table.add("keine Kapriolen");
		table.add("grade bei diesen Ballen dort");
		table.add("Letzter Wert");
		table.add("der nicht");
		//test
		
		System.out.println(table.contains("der nicht"));

	}

}
