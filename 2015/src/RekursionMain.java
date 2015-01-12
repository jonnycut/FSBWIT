
public class RekursionMain {

	public static void main(String[] args) {
		//System.out.println(fib(10));
		//System.out.println(stringDrehen("ABCD"));
		
	
	} //end Main
	
	public static void runterZaehlen(int zahl){
		
		System.out.println(zahl);
		if(zahl == 0) return;
		zahl --;
		runterZaehlen(zahl);
		
	}
	
	public static int fib(int x){
		int x1 = x;
		
		if(x==1){
			
			return 1;
		}else if(x==2){
			
			return 1;
		}else{
			
			return fib(x-1)+fib(x-2);
			
		}
		
	} //end fib
	
	public static String stringDrehen(String string){
		if(string.length()!=0){
			return stringDrehen(string.substring(1)) + string.charAt(0);
			
		}
		return string;
	}//end drehen
	
	public static int[] drehen(int[] array, int pos){
		if(pos>= array.length) return new int[array.length]; 	//Abbruchbedingung
		
		int[] arrayBlau = drehen(array, pos+1); 				//pos+1 = Hinweg Schrittzähler
		arrayBlau[array.length-1-pos] = array[pos];				//rückweg 
		
		return arrayBlau; 										//rückweg
	}
	
	public static void drehen2(int[] array, int pos){
		if (pos>=array.length) return;
		int apfel = array[pos];
		drehen(array, pos+1); 
		array[array.length -1-pos] = apfel; //ohne rückgabe
	}

}
