
public class arraySort {
	
	public void sortieren(int[] array){
		boolean tausch = true;
		
		for (int a = 1; tausch; a++){
			tausch = false;
			for(int i = 0; i < array.length -a; i++){
				if (array[i] > array[i+1]){
					int help = array[i];
					array[i] = array[i+1];
					array[i+1] = help;
					tausch = true;
					
				}
			}
		}
	}
	
	public void sortierenAuto(Auto[] garage){
		boolean tausch = true;
		Auto puffer;
		
		for(int j=0; tausch; j++)
			tausch = false;
			for(int i=0; i < garage.length-1;i++){
				
				if (lexi(garage[i].getKennzeichen(),garage[i+1].getKennzeichen()) == true){
					puffer = garage[i];
					garage[i]=garage[i+1];
					garage[i+1] = puffer;
					tausch = true;
				}
				
				
			}
		
		
	}
	
	public boolean lexi(String s1, String s2){
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		
		
		for (int i=0; i < s1.length()&& i < s2.length();i++){	
		
			if (s1.charAt(i) > s2.charAt(i))
				return true;
			else if (s1.charAt(i) < s2.charAt(i)) 
				return false;
			
			
		}
		
		return s1.length() > s2.length();
			
	}
	
	public void obstSort(Orange[] orangen){
		
		boolean tauschen = true;
		Orange puffer = null;
		
		for(int j = 1; tauschen; j++){
			tauschen = false;
			for(int i=0; i<orangen.length-j;i++){
				if(orangen[i].getGewicht() > orangen[i+1].getGewicht()){
					puffer = orangen[i];
					orangen[i]=orangen[i+1];
					orangen[i+1] = puffer;
					tauschen = true;
					
				}
			}
				
				
			}
		}

}
