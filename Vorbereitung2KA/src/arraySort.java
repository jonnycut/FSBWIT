
public class arraySort {
	
	public void sortieren(int[] array){
		boolean tausch = true;
		
		while (tausch){
			tausch = false;
			for(int i = 0; i < array.length -1; i++){
				if (array[i] > array[i+1]){
					int help = array[i];
					array[i] = array[i+1];
					array[i+1] = help;
					tausch = true;
					
				}
			}
		}
	}

}
