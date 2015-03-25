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
		return tmp.value;
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
	
	public T remove(Element ele){
		Element act = first;
		T tmp;
		if(first==ele){
			tmp = first.value;
			first=first.next;
			return tmp;
			
		}else{
			while(act.next!=null){
				if(act.next==ele){
					tmp = act.next.value;
					act.next = act.next.next;
					return tmp;
				}
				ele = ele.next;
			}
		}
		
		return null;
	
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


		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
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
