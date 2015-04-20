

public class HashTable<T> {
	
	private T[] eimer;
	
	public HashTable(int size){
		this.eimer =  (T[]) new Object[size];
		
		
	}
	
	
	public void add(T value){
			
		int index = (value.hashCode()&0x7fffffff)%eimer.length;
		int counter = 0;
		
			if(eimer[index]==null){
				eimer[index] = value;
				
			}else{
				while(eimer[index]!= null){
					index++;
					counter++;
					if(counter >= eimer.length)
						return;
					if (index >= eimer.length)
						index = 0;
				}
				eimer[index] = value;
					
			}
		
		
	}
	
	public boolean contains(T value){
		int index = (value.hashCode()&0x7fffffff)%eimer.length;
		int counter = 0;
		
		while(index<=eimer.length){
			if(eimer[index]!=value){
				index ++;
				counter++;
			
				if(index<=eimer.length)
					index=0;
				if(counter<=eimer.length)
					return false;
				
			}else
				break;
		}
		return eimer[index]==value;
	}

	
}//end HashTable

