
public class Rechner {
	
	private char zustand = '1';
	private double puffer1 = 0;
	private double puffer2 = 0;
	private double ergebnis = 0;
	private char operand;
	
	
	
	public char getZustand(){
		
		return zustand;
	}
	
	public void rechnen(char eingabe){
		
		switch (zustand){
		
		case '1':
			
			switch (eingabe){
					
				case '+':
				case '-':
				case '/':
				case '*':
					zustand = '2';
					operand = eingabe;
					
					break;
				
				case '=':
					//ergebnis = berechnung(puffer1, puffer2, operand);
					puffer1 = 0;
					puffer2 = 0;
					//System.out.println(ergebnis);
					break;
				
				//case ',':
					//zustand = 4
				case 'c':
					puffer1 = 0;
					puffer2 = 0;
					
					break;
					
					
					
				
				default:
					ergebnis = ergebnis *10 + Character.getNumericValue(eingabe);
					//System.out.println(ergebnis);
					break;
					
			}
			break;
			
		case '2':
			
				switch (eingabe){
			
				case '+':
				case '-':
				case '/':
				case '*':
					ergebnis= berechnung(ergebnis, puffer2, operand);
					operand = eingabe;
					puffer2=0;
					break;
				
				case '=':
					zustand = '3';
					ergebnis = berechnung(ergebnis, puffer2, operand);
					//System.out.println(ergebnis + ""+ operand + "" + puffer2 + "= " + ergebnis);	
					puffer1 = 0;
					puffer2 = 0;
					break;
					
				case 'c':
					
					puffer2 = 0;
					//System.out.println(puffer2);
					break;
					
				
				default:
					puffer2 = puffer2 *10 + Character.getNumericValue(eingabe);
					System.out.println(puffer2);
					break;		
			
			
				}
				break;
			
		case '3':
			switch (eingabe){
			
				case '+':
				case '-':
				case '/':
				case '*':
					zustand = '2';
					puffer1 = ergebnis;
					operand = eingabe;
					break;
				
				case '=':
					//System.out.println(ergebnis + ""+ operand + "" + puffer2 + "= " + ergebnis);	
					//System.out.println("zustand: "+zustand);
					break;
					
				case 'c':
					puffer1 = 0;
					puffer2 = 0;
					zustand = 1;
					break;
					
					
				
				default:
					zustand = '1';
					puffer1 = puffer1 *10 + Character.getNumericValue(eingabe);
					puffer2 = 0;
					break;		
			
		
			}
			
		//case '4':
			
			break;
		
		}
		
		
	}
	
	public double berechnung(double zahl1, double zahl2, char operand){
		
		switch (operand){
			
			case '+':
				ergebnis = zahl1 + zahl2;
				ausgabe(zahl1,zahl2,operand,ergebnis);
				
				return ergebnis;
				
				
			case '-':
				ergebnis = zahl1 - zahl2;
				ausgabe(zahl1,zahl2,operand,ergebnis);
				return ergebnis;
				
			case '*':
				ergebnis = zahl1 * zahl2;
				ausgabe(zahl1,zahl2,operand,ergebnis);
				return ergebnis;
				
			case '/':
				ergebnis = zahl1 / zahl2;
				ausgabe(zahl1,zahl2,operand,ergebnis);
				return ergebnis;
				
				
			default:
			
				return ergebnis;
				
		
		}
	}
	
	public String ausgabe(double zahl1, double zahl2, char operand, double ergebnis){
		
		String ausgabeString = zahl1+""+""+operand+""+""+zahl2+""+"="+ergebnis;
		return ausgabeString;
	}
	
	

}
