package KA_Uebung_2_042015;

import java.util.Iterator;

public class HashTable<T> implements Iterable<T> {
	
	private Object[] table;
	private double voll=0.0;
	
	public HashTable(int size){
		
		this.table = new Object[size];
	}
	
	public void add(T value){
		int index = (value.hashCode()&0x7fffffff)%table.length;
		
		if(table[index]==null){
			table[index] = value;
			voll+= (1.0/(table.length)*100);
			
		}else{
		
			int counter = 0;
			int pos = index;
			
			while(table[pos]!=null){
				if(table[pos].equals(value)) return;
				pos++;
				counter++;
				if(pos>=table.length) pos=0;
				if(pos==index) table[-1]="voll";
			}
			table[pos]=value;
		}
		//bei 70% füllstand erweitern
		
		if(voll>=70.0){
			Object[] puffer = new Object[table.length*2];
			int posNew=0;
			
			for(Object k:table){
				puffer[posNew]=k;
				posNew++;
			}
			
			this.table=puffer;
			
		}
		
	}//end add

	public boolean contains(T value){
		int index = (value.hashCode()&0x7fffffff)%table.length;
	
			if(table[index].equals(value)) return true;
		
		int pos=index;
		
		while(table[pos]!=null){
			
			if(table[pos].equals(value)) return true;
			pos++;
			if(pos>=table.length) pos=0;
			if(pos==index) break;
			
		}
		return false;
		
		
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>(){
			private int i=0;
			@Override
			public boolean hasNext() {
				
				if(voll!=0.0){
					if(i>=table.length) return false;
					return true;
				}
				return false;
			}
			@Override
			public T next() {
				
				while(table[i]==null){
					i++;
					if(i==table.length)
						
						break;
				}
				
				T ret = (T) table[i];
				
				i++;
				
				while(table[i]==null){
					i++;
					if(i==table.length)
						
						break;
				}
			
				
				return ret;
			}
			
		};
	}
}
