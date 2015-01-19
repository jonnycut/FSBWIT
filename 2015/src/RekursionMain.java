
public class RekursionMain {

	public static void main(String[] args) {
		//System.out.println(fib(10));
		//System.out.println(stringDrehen("ABCD"));
		//System.out.println(fak(4));
		int[] array = {10,9,8,7,6,5,4,3,2,1,0,-1,-502};
		System.out.println(minimal(array));
	
	} //end Main
	
	public static void runterZaehlen(int zahl){
		
		System.out.println(zahl);
		if(zahl == 0) return;
		zahl --;
		runterZaehlen(zahl);
		
	}
	
	public static int fib(int x){
		
		if(x==1){
			
			return 1;
		}else if(x==2){
			
			return 1;
		}else{
			
			return fib(x-1)+fib(x-2);
			
		}
		
	
		
	} //end fib
	
	public static void fibOpt(long x){
		long ergebnis=0;
		long a=1;
		long b=1;
		
		for (long i=1; i<=x;i++){
			if(i>2){ 
				ergebnis=a+b;
				System.out.println(ergebnis);
				a=b;
				b = ergebnis;
			} //end if
			
			if(i <=2)System.out.println("1");	
		} //end for
	}//end fibOpt
	
	public static int summe(int a, int b){
		if(b==0) return a;
		return summe(a+1,b-1);
	} //end summe
	
	public static int multi(int a,int b){
		
		if (b<=1) return a;
		
		return summe(a,multi(a,b-1));
	} //end multi
	
	public static int pot(int a, int b){
		if (b==0) return 1;
		return multi(pot(a,b-1),a);
	} //end potenz
	
	public static int fak(int a){
		if(a==1) return 1;
		return multi(a,fak(a-1));
	}
		
	
	
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
	
	public static int minimal(int[] array){ //Schnittstelle nach außen, weil public, ruft die private Methode auf, um falsche übergabeparameter zu vermeiden
		return minimal(array,1,array[0]);
	}
	
	private static int minimal(int[] array, int pos, int min){
		if(pos>=array.length)
			return min;
		if(array[pos] < min)
			min = array[pos];
			return minimal(array,pos+1,min);
	}

}
