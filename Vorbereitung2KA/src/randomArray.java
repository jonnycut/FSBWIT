
public class randomArray {
	
	

public String[][] fuellen(String eingabe, String[][] array){
	
	String[][] newArray = new String[array.length +1][3];
	
	
	for(int i=0; i<array.length; i++){
		
		newArray[i] = array[i];
	}
	newArray[newArray.length -1] = eingabe.split(";");
	
	
	return newArray;
	
	} //ende fuellen

	public void ausgabe(String[][] array){
		
		
		System.out.println("DG    |Name      | Vorname");
		System.out.println("-------------------------");
		for(int i=0; i< array.length;i++){
			for (int j=0; j<array[i].length; j++){
				System.out.print(array[i][j]+"     | ");
			}
			System.out.println();
		}
	} //end ausgabe
	
	
	public String[][] sortieren(String[][] array){
		
		String[] pufferArray = new String[array[0].length];
		boolean tausch = true;
		
		for (int j=0;tausch;j++){
			tausch = false;			
			
			for(int i=0; i< array.length -1;i++){
				if (array[i][1].compareTo(array[i+1][1])>0){
					pufferArray =array[i];
					array[i] = array[i+1];
					array[i+1] = pufferArray;
					tausch = true;
					
				}
			}
		}
		
		return array;
		
		
	}
	
	public void random(String[][] array){
		int random;
		
		do{
			random = (int) (Math.random()*10);
		} while(random > array.length -1);
		
		System.out.print(array[random][0]+"  |");
		System.out.print(array[random][1]+"  |");
		System.out.print(array[random][2]+"  |");
	
			
	}

} //end class
