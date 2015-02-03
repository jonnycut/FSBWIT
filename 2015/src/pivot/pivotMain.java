package pivot;

public class pivotMain {

	public static void main(String[] args) {
		String s = "UBPGATNS";
		char[] array = {'C','B','P','G','U','T','N','S'};
		
		//System.out.println(s);
		//System.out.println(quickSort(s));
		
		for(char k:array){
			System.out.print(k +";");
		}
		quickSort(array,0,array.length-1);
		System.out.println();
		for(char k:array){
			System.out.print(k +";");
		}
		

	}//end main
	
	public static String quickSort(String s){
		
		if (s.length() <2) return s;
		
		char pivot =s.charAt(0);
		String links = "";
		String rechts = "";
		for (int i=1; i<s.length();i++){
			if(pivot > s.charAt(i)) links +=s.charAt(i);
			else rechts +=s.charAt(i);
		}
		return quickSort(links)+pivot+quickSort(rechts);
		
		
		
	}//end quickSort
	
//-----------------------------------------START: MISTSORT---------------------------------------------------//
	public static char[] quickSort(char[] array){
		char pivot = array[0];
		char[] arrayNeu = new char[array.length];
		int l =0;
		int r=array.length-1;
		
		for(int i=1;i<array.length;i++){
			if(array[i] > pivot){
				arrayNeu[l] = array[i];
				l++;
			}else{
				arrayNeu[r] = array[i];
				r--;
			}//end if
			
		}//end for
		
		arrayNeu[l]=pivot;
		if (l>2){
			char[] links=new char[l];
			for(int i=0; i<l;i++) links[i] = arrayNeu[i];
			links=quickSort(links);
		
			
			for(int i=0;i<l;i++) arrayNeu[i]=links[i];
			
		}//end if
		if(r<array.length){
			r++;
			char[] rechts = new char[arrayNeu.length -r];
			for(int i=r; i<arrayNeu.length;i++)
					rechts[i-r]=arrayNeu[i];
			rechts= quickSort(rechts);
			for(int i=r;i<arrayNeu.length;i++)
					arrayNeu[i]=rechts[i-r];
			
		}
	
		return arrayNeu;
	}//end quicksortArray
	
//-----------------------------------------END: MISTSORT---------------------------------------------------//
	
//-----------------------------------------START:BESSERERSORT----------------------------------------------//
public static void quickSort(char[] array, int l, int r){
	
	int i=l;
	int j=r;
	char pivot =array[(l+r)/2];
	
	while(i<=j){
		while(array[i]<pivot) i++;
		while(array[j]>pivot) j--;
		if(i<=j){
			char puffer = array[i];
			array[i]=array[j];
			array[j]=puffer;
			i++;
			j--;
		}
	}
	if(j>l) quickSort(array,l,j);
	if(i<r) quickSort(array,i,r);
	
	
}
	

	
	
	
//-----------------------------------------END:BESSERERSORT------------------------------------------------//


		
		
	



































}//end class
