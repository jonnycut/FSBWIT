package InnereKlassen;

import java.util.Iterator;


public class ICL<T> implements Iterable<T> {
	
	private Element first;
	
	

	
	
	public Element getFirst() {
		return first;
	}



	public void setFirst(Element first) {
		this.first = first;
	}



	

	public void add(T value){
		
		if(first==null){
			first=new Element(value);
		}else{
			Element puffer=first;
			first =new Element(value);
			first.next = puffer;
		}
	}
	

	
	
	public Element pop(){

		Element puffer = first;
		first = first.next;
		return puffer;
		
	}
	public int getSize(){
		Aufzaehler a = new Aufzaehler();
		int counter =0;
		while(a.hasNext()){
			counter++;
			a.next();
		}
		return counter;
	}
	
	public Iterator<T> iterator(){
		
		return new Aufzaehler();
		
	}
	
	
	


	
	private class Element{
		private Element next;
		private T value;

		public Element(T value){
			this.value=value;
			this.next=null;
			
		}
		
	}//end inner class element
	
	private class Aufzaehler implements Iterator{
		private Element current = first;
		
		public boolean hasNext(){
			return current !=null;
		}
		public T next(){
			T ret =current.value;
			current = current.next;
			return ret;
		}
		
	
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	} //end inner class Aufzaehler
	
}
