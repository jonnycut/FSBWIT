package merge_HA28012015;

public class MergeMain {

	public static void main(String[] args) {
		
		


		
	}
//-----------------------------------------Start MergeSort-------------------------------------------------//

	public static char[] merge(char[] array){
		if(array.length == 1){ 
			return array;
		}else if(array.length ==2){
			
			
		}else{
			int counter = 0;
			char[] pufferArrayA = new char[array.length/2];
			char[] pufferArrayB = new char[array.length/2];
			
			for(int i=0; i<pufferArrayA.length; i++){
				pufferArrayA[i] = array[i];
				counter = i;
			}
			
			for(int i=0; i<pufferArrayB.length && counter < array.length;i++){
				pufferArrayB[i] = array[counter];
				counter ++;
			}
			
			pufferArrayA = merge(pufferArrayA);
			pufferArrayB = merge(pufferArrayB);
			 //TODO: SORT 
		}
	
	}

}
