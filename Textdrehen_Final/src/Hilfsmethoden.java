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
	
	public int quersumme(int zahl){
		
		int querSumme =0;
		int zahlLenght = 0;
		double ex = 0;
		String zahlString = new String();
		zahlString = ""+zahl;
		
		for(int i = 0;i <= zahlString.length() -1; i++){
			
			querSumme += Character.getNumericValue(zahlString.charAt(i));	
			
		}		
		return querSumme;
	}
	
	public int[] baue (int laenge){
		int[] array = new int[laenge];
		
		for (int i = 0; i< laenge; i++){
			
			array[i] = (int) (Math.random() * 10);
			
			
		}
		return array;
		
	}
	
	public String toString(int[] array){

		
		String s = "[";
		
		
		for (int i = 0; i < array.length; i++){
			
			s += array[i];
			if (i < array.length-1) s += ",";
			
		}
		
		
		return s +"]";
		
		
	}
	
	public int[] verbinde(int[] array1, int[] array2){
		
		int gesamtLaenge = array1.length + array2.length;
		int[] zusammen = new int[gesamtLaenge];
		
		for (int i=0; i < array1.length; i++)
			
			zusammen[i]= array1[i];
		
		for (int i = 0; i < array2.length; i++)
			
			zusammen[i + array1.length] = array2[i];
		
		
		
		
		return zusammen;
	}
}
