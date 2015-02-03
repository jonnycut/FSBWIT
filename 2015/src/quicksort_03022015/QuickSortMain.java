package quicksort_03022015;

public class QuickSortMain {
	
	
	
	public static void main(String[] args) {
	String[] array={"b","f","a","d","c","e"};
	String[][] array2={	{"1","c"},
						{"2","a"},
						{"3","b"},
						{"2","b"},
						{"1","b"},
						{"2","c"},
						{"1","a"},
						{"3","c"},
						{"3","a"}	};
	
	System.out.println("AltesArray:");
	for(int i=0;i<array2.length;i++){
		for(int j=0;j<array2[i].length;j++)
			System.out.print(array2[i][j]);
			System.out.println();
	}
			
	
	
	
	quickSort2(array2,0,array2.length-1);
	
	System.out.println("NeuesArray:");
	
	for(int i=0;i<array2.length;i++){
		for(int j=0;j<array2[i].length;j++)
			System.out.print(array2[i][j]);
			System.out.println();
	}
	
	
	

	
		

	}
	
	public static void quickSort(String[] array, int start, int ende){
		String pivot = array[(start+ende)/2];
		int cL=start;
		int cR=ende;
		
		while(cL<=cR){
			while(array[cL].compareToIgnoreCase(pivot) <0) cL++;
			while(array[cR].compareToIgnoreCase(pivot) >0) cR--;
				if(cL<=cR){
					String puffer = array[cL];
					array[cL]=array[cR];
					array[cR]=puffer;
					cL++;
					cR--;
					
				}
			
		}
		if(cR>start) quickSort(array,start,cR);
		if(cL<ende) quickSort(array,cL,ende);
			
	}//end quicksort einfach
	
	public static void quickSort2(String[][] array, int start, int end){
		String[] pivot=array[(start+end)/2];
		int cL=start;
		int cR=end;
		
		while(cL<=cR){
			while(array[cL][0].compareToIgnoreCase(pivot[0])<0 || (array[cL][1].compareToIgnoreCase(pivot[1]) <0 && array[cL][0].equalsIgnoreCase(pivot[0]))) cL++;
			while(array[cR][0].compareToIgnoreCase(pivot[0])>0 || (array[cR][1].compareToIgnoreCase(pivot[1]) >0 && array[cR][0].equalsIgnoreCase(pivot[0]))) cR--;
			if(cL<=cR){
				String[] puffer = array[cL];
				array[cL] = array[cR];
				array[cR]=puffer;
				cL++;
				cR--;
			}		
		}
		
		if(cR>start) quickSort2(array,start,cR);
		if(cL<end) quickSort2(array,cL,end);
		
	}
	

}


