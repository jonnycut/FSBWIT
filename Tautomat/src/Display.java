
public class Display {
	private Rechner rechner;
	
	
	
	
	public void ausgabe(String rechenWeg){
		String eins ="      |   | ";
		String zwei =" __  __||__ ";
		String drei =" __  __| __|";
		String vier ="     |_|   |";
		String fuenf =" __ |__  __|";
		String sechs = " __ |__ |__|";
		String sieben = " __    |   |";
		String acht = " __ |__||__|";
		String neun = " __ |__|   |";
		String zero = " __ | /||/_|";
		String plus ="     _|_  | ";
		String minus = "     __     ";
		String mal = "     \\/  /\\ ";
		String geteilt = "   /  /  /  ";
		String gleich = "     __  __ ";
		String komma = "  0";
		byte start = 0;
				
	
	
	
		
		for (int zeile = 0; zeile <=2; zeile++){
			
			
				
			for (int i= 0; i<rechenWeg.length();i++){
				
							 
					switch (rechenWeg.charAt(i)) {
						
						case '1':
							System.out.print(eins.substring(start,start+4));					
							break;
						case '2':
							System.out.print(zwei.substring(start,start+4));
							break;
							
						case '3':
							System.out.print(drei.substring(start,start+4));
							break;
						case '4':
							System.out.print(vier.substring(start,start+4));
							break;
						case '5':
							System.out.print(fuenf.substring(start,start+4));
							break;
						case '6':
							System.out.print(sechs.substring(start,start+4));
							break;
						case '7':
							System.out.print(sieben.substring(start,start+4));
							break;
						case '8':
							System.out.print(acht.substring(start,start+4));
							break;
						case '9':
							System.out.print(neun.substring(start,start+4));
							break;
						case '0':
							System.out.print(zero.substring(start,start+4));
							break;
						case '+':
							System.out.print(plus.substring(start,start+4));
							break;
						case '-':
							System.out.print(minus.substring(start,start+4));
							break;
						case '*':
							System.out.print(mal.substring(start,start+4));
							break;
						case '/':
							System.out.print(geteilt.substring(start,start+4));
							break;
						case '=':
							System.out.print(gleich.substring(start, start+4));
							break;
						case ',':
						case '.':
							
							System.out.print(komma.charAt(zeile));
							
							break;
						default:
							System.out.println("Zeichen an Stelle " + i + " des Strings nicht darstellbar");
							break;
					}
					
				
			 	
					
					 
				}
			start += 4;
			if (zeile==2) start = 0;
			
			System.out.println();
		}
	}
}
