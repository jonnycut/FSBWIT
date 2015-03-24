package KlausurUebungMaerz;

import java.util.Iterator;


public class Liste<T> implements Iterable<T> {
	private Element first;
	
	
	public void add(T value){
		if(first==null){
			first = new Element(value);
		}else{
			Element tmp = first;
			first = new Element(value);
			first.next=tmp;
		}
	}
	
	public void addEnd(T value){
		if(isEmpty()){
			first = new Element(value);
			return;
		}
			Element ele = first;
			while(ele.next!=null)
				ele=ele.next;
			
			ele.next = new Element(value);
	}
	
	public T pop(){
		if(isEmpty())
			return null;
		
		Element tmp=first;
		first = first.next;
		return first.value;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public String toString(){
		Element ele = this.first;
		String ret = "";
		
		while(ele !=null){
			ret = ret + ele.value+"|";
			ele=ele.next;
		}
		
		return ret;
			
	}
	
	
	
	public Iterator<T> iterator(){
		return new Aufzaehler();
	}
	
	private class Aufzaehler implements Iterator<T>{
		private Element next=first;
		
		public boolean hasNext() {
			
			return next!=null;
		}

		
		public T next() {
			T ret = next.value;
			next = next.next;
			return ret;
		}
		
	}
	private class Element{
		T value;
		Element next;
		
		public Element(T value){
			this.value=value;
			this.next=null;
		}
	}

}
