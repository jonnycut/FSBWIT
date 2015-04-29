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
			voll+= (1.0/(table.length)*100);
		}
		//bei 70% füllstand erweitern
		
		if(voll>=70.0){
			HashTable<T> puffer = new HashTable<>(table.length*2);
			
			for(int i=0;i<table.length;i++){
				if(table[i]!=null)
					puffer.add((T) table[i]);
			}
			
			
			this.table=puffer.table;
			
			
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
	
	public void remove(T value){
		int index = ((value.hashCode()&0x7fffffff)%table.length);
		int pos=index;
		int lastPos = -1;
		
		while(table[pos]!=null){
			if(table[pos].equals(value)){
				table[pos] = null;
				break;
			}
			
			pos++;
			if(pos==table.length)pos=0;
			if(pos==index) return;
		}
		
		T tmp=null;
		pos++;
		
		while(table[pos]!=null){
			if(((table[pos].hashCode()&0x7fffffff)%table.length) == (value.hashCode()&0x7fffffff)%table.length){
				tmp = (T) table[pos];
				lastPos=pos;
			}
			pos++;
			
			if(pos==table.length) pos=0;
			if(pos==index) break;
		}
		
		if(lastPos!=-1){
			table[index]=tmp;
			table[lastPos]= null;
		}
	}//end remove
	
	public String toString(){
		String ret="";
		for(Object k : table){
			ret+=" | " + k;
		}
		
		return ret;
			
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
