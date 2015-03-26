package KlausurUebungMaerz;

import java.util.Comparator;
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
		String ret = "HR\tKennZ\t\tFarbe\n--\t-----\t\t-----\n";
		
		while(ele !=null){
			ret = ret + ele.value+"\n";
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
				act = act.next;
			}
		}
		
		return null;
	
	}
	
	public void sort(Comparator<T> vergl){
		Liste<T> sorted = new Liste<>();
		
		
		while(!this.isEmpty()){
			Element small = this.first;
			Element act = this.first;
			
			while(act!=null){
				if(vergl.compare(act.value, small.value)<0){
					small =act;
				}
				act=act.next;
			}//end while
			sorted.add(small.value);
			this.remove(small);
		}
		
		this.first = sorted.first;
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
