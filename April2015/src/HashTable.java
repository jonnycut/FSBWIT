

public class HashTable<T> {
	
	private Object[] eimer;
	
	public HashTable(int size){
		this.eimer = new Object[size];
		
		
	}
	
	
	public void addAlt(T value){

			
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
		
		
	}//end addAlt

	public boolean containsAlt(T value){
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
	}//end containsAlt

	
	public void add(T value){
		int index = (value.hashCode()&0x7fffffff)%eimer.length;
		int pos = index;
		
		while(eimer[pos] != null){
			if(eimer[pos].equals(value)) return;
			pos = ++pos % eimer.length;
			if(pos==index) eimer[-1]= "voll";
			
		}
		
		eimer[pos]=value;
	}
	
	public boolean contains(T value){
		
		
		int index = (value.hashCode()&0x7fffffff)%eimer.length;
		int pos = index;
		
		while(eimer[pos]!=null){
			if(eimer[pos].equals(value))return true;
			pos = ++pos % eimer.length;
			if(pos==index) return false;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void remove(T value){
		int index = (value.hashCode()&0x7fffffff)%eimer.length;
		int foundIndex = -1;
		int pos = index;
		int lastPos=-1;
		Object tmp = null;
		
		while(eimer[pos]!=null){
			if(eimer[pos].equals(value)){
				eimer[pos] = null;
				foundIndex =pos;
				pos++;
				break;
				}
			if(++pos == eimer.length) pos=0;
			if(pos == index) return;
			}
		
		while(eimer[pos]!=null){
			if((eimer[pos].hashCode()&0x7fffffff)%eimer.length== (value.hashCode()&0x7fffffff)%eimer.length){
				tmp = eimer[pos];
				lastPos=pos;
			}
			pos++;
			if(pos==eimer.length)pos=0;
			if(pos==index)break;
			
		}
		if(lastPos !=-1){
			eimer[foundIndex]=tmp;
			eimer[lastPos]=null;
			
		}
		
	}
	
	public String toString(){
		String ret="";
		for(Object o:this.eimer){
			ret +=";"+o;
		}
		return ret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end HashTable

