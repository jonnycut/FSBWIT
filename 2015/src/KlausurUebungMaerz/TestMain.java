package KlausurUebungMaerz;

public class TestMain {

	public static void main(String[] args) {

/*Stack Test
		
		Stack<Integer> s_limit = new Stack<>(10);
		
		for(int i=0; i<12;i++)
			s_limit.push(i);
		
		while(!s_limit.isEmpty())
			System.out.println(s_limit.pop());
		
		System.out.println("\n\n\nUnlimited Stack:\n\n\n");
		Stack<Integer> s = new Stack<>(0);
		
		for(int i=0;i<12;i++)
			s.push(i);
		
		while(!s.isEmpty())
			System.out.println(s.pop());
*/
	
/*WarteSchlange Test	
		WarteSchlange<Integer> wS = new WarteSchlange<>();
		
		for(int i=0;i<12;i++){
			System.out.println("Push: " +i);
			wS.push(i);
		}
		
		System.out.println("\n\n");
		
		while(!wS.isEmpty())
			System.out.println(wS.pop());
			
*/	
		

		Liste<Auto> liste = new Liste<>();
		
		for(int i=0;i<15;i++)
			liste.add(new Auto((int)(Math.random()*1000), baueKennZ(),baueFarbe()));
		
		for(Auto a:liste)
			System.out.println(a);
			
		
		
		 
		
		
			
			
		}
	public static String baueKennZ(){
		
		String ret = "";
		ret += (char) ((Math.random()*26)+'A');
		ret += (char) ((Math.random()*26)+'A');
		ret += "-";
		ret += (char) ((Math.random()*26)+'A');
		ret += (char) ((Math.random()*26)+'A');
		ret += " ";
		ret += (int) (Math.random()*1000);
		
		return ret;
	}
	
	public static String baueFarbe(){
		String[] farbgedoens ={"Gelb","Blau","Grün","Beige","Grau","IbisWeiß","KackBraun","UrinGelb","SaftWeiß","Rot"};
		
		return farbgedoens[(int) (Math.random()*10)];
		
	}
}

		
