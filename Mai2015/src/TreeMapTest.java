
public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<String, String> telefonbuch = new TreeMap<>();
		
		telefonbuch.put("Rüdiger","0171-1234");
		telefonbuch.put("Wolfgang","0171-5678");
		telefonbuch.put("Andreas","0171-91011");
		
		System.out.println(telefonbuch.get("Rüdiger"));
		
		System.out.println(telefonbuch.getReverse("0171-1234"));
	}

}
