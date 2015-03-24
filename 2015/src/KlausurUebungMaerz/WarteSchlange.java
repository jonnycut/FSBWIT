package KlausurUebungMaerz;


public class WarteSchlange<T> {
	private Element first;
	private Element last;
	
	
	public boolean isEmpty(){
		return first==null;
	}
	public void push(T value){
		
			if(first==null){
				first = new Element(value);
				last = first;
				
			}else{
				last.next = new Element(value);
				last = last.next;
				
			}
	}
	
	
	public T pop(){
		Element tmp = first;
		first = first.next;
		return tmp.value;
	}
	
	private class Element{
		T value;
		Element next;
		
		public Element (T value){
			this.value = value;
			this.next=null;
		}
		
	}

}
