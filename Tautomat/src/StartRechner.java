import java.util.Scanner;

public class StartRechner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		/*Rechner r = new Rechner();
		
		
		
		for (;true;){
				String eingabe = s.next();
				if (eingabe.charAt(0) == 'x'){
					System.out.println("Abgebrochen");
					break;
				}
				
		for (int i=0; i <= eingabe.length() - 1;i++){
			
			r.rechnen(eingabe.charAt(i));
					
			
		}
				
		

		
		
			
		}
	*/
	Display display = new Display();
	for(;true;){
			String rechenWeg = s.next();
			if (rechenWeg.charAt(0) =='x') break;
					
			display.ausgabe(rechenWeg);
		
	}
	
	
	
	
	
	
		
		
		
	}

}
