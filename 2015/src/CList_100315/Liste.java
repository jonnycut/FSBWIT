package CList_100315;

import java.util.Iterator;

public class Liste<T extends Comparable<T>> implements Iterable<T> {
	private Element<T> first;
	private int size;
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void add(T value){
		Element<T> neu = new Element<T>(value);
		if(isEmpty()) 
			first = neu;
		else{
			neu.next=first;
			first = neu;
		}
		size++;
				
	}
	
	public String toString(){
		String rueck="";
		Element act = first;
		for(int i=0; i<getSize();i++){
			rueck += act.value+";";
			act =act.next;
		}
		return rueck;
	}
	
	public int getSize(){
		return size;
	}
	public int contains(T value){
		int anzahl =0;
		Element<T> act =first;
		while(act!=null){
			if(act.value==value)anzahl++;
			act = act.next;
		}
		
		
		return anzahl;
	}
	
	public void addEnd(T value){
		Element<T> neu = new Element<T>(value);
		if(first ==null){
			first = neu;
		}else{
			Element<T> help = first;
			while(help.next != null){
				
				help = help.next;
				
			}
			help.next=neu;
		}
	}
	
	public void sort(){
		Liste<T> sorted = new Liste<>();
	
		
		while(!this.isEmpty()){
			Element<T> help = this.first.next;
			Element<T> small = first;
			if(help==null){
				sorted.add(small.value);
				this.remove(small);
				
				break;
			}
			
			while(help != null){
				if(small.value.compareTo(help.value)<0){
					small = help;
				}
				help=help.next;
				
			}
			sorted.add(small.value);
			this.remove(small);
		}
		this.first = sorted.first;
		this.size = sorted.size;
		
		
	}
	
	public void remove(Element<T> rem){
		Element<T> help = first;
		
		if(first == rem){
			first=first.next;
			size--;
		}else{
			for(int i=0; i<this.size;i++){
				if(help.next == rem){
					help.next=rem.next;
					size--;
					break;
				}
				help = help.next;
			}
		}
	}
	
	
	public Iterator<T> iterator() { //-> sorgt dafür, dass "for:each" funktioniert
	
		return new Aufzaehler();
	}
	
	private class Aufzaehler implements Iterator<T>{
		
		private Element<T> next=first;
		
		public boolean hasNext() {
			
			return next !=null;
		}

		
		public T next() {
			T ret = next.value;
			next = next.next;
			
			return ret;
		}

		
		//nicht nötig
		public void remove() {}
		
	}
	
	
	public class Element<S>{
		private S value;
		private Element<S> next;
		
		public Element(S value){
			this.value=value;
			this.next=null;
		}
		
		
		
	}


	

}
