package Split;

public class SplitMain {

	public static void main(String[] args) {
		String string= "Hallo schöne neue Welt";
		

	}

	public static String[] split(String string){
		if (string =="") return null;
		
		String[] array =
		return split(string, 0, 0);
	}
	
	private static String[] split(String string, int index, int counter){
		if(index>string.length()-1){
			String[] array = new String[counter];
			int puf = string.indexOf(" ", 0);
			array[0] = string.substring(0, puf);
		}
	}
}
