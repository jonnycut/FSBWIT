import java.util.Scanner;

public class Hilfsmethoden {
	
	
	public boolean vergleich(String s1, String s2){
		boolean gleich = false; 
			
		if (s1.length() == s2.length()){
			
			for (int i = 0; i <=s1.length() -1 ; i ++)
				
				if (s1.charAt(i) != s2.charAt(i)) {
					
					gleich = false;
					break;
				}else {
					gleich = true;
				}
			
		
		}else{
			
			gleich = false;
		}
		
	
		return gleich;
	}
	
	public int intAddieren(int[] array){
		
		int summe = 0;
		
		for(int z: array){
			
			summe = summe +z;
		}
		
		
		
		return summe;
	}
	
	
	public double schnitt(int[] array){
		
		int summe= intAddieren(array);
		
		
		double schnitt = (double) summe / array.length;
		
		return schnitt;
	}
	
	public double[] nullstellen(double p, double q){
		
		double inWurzel = (p/2)*(p/2) - q;
		if (inWurzel < 0) return null;
		if (inWurzel == 0)
			return new double[] {-p/2};
		double wurzel = Math.sqrt(inWurzel);
		return new double[] {
				(-p/2) + wurzel, (-p/2) - wurzel};
		
	}
	
	
}
