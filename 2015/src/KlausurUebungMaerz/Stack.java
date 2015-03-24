package KlausurUebungMaerz;

public class Stack<T> {
	private Element first;
	private int size=0;
	private int maxSize;
	
	public Stack (int maxSize){
		this.maxSize = maxSize;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	public void push(T value){
		if(maxSize!=0){
			if(size<maxSize){
				if(first==null){
					first = new Element(value);
					size ++;
				}else{
					Element tmp = first;
					first = new Element(value);
					first.next = tmp;
					size++;
				}
				
			}else{
				System.out.println("Stack full - nothing changed");
				return;
		    }
			
		}else{
			if(first==null){
				first = new Element(value);
				size ++;
			}else{
				Element tmp = first;
				first = new Element(value);
				first.next = tmp;
				size++;
			}
		}
	}
	
	public T pop(){
		Element tmp = first;
		first = first.next;
		size--;
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
