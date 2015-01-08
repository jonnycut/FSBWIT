
public class RekursionMain {

	public static void main(String[] args) {
		//System.out.println(fib(10));
		System.out.println(stringDrehen("ABCD"));
	}
	
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
	}

}
