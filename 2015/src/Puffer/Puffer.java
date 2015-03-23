package Puffer;

public class Puffer<T> {
	
	private Element lesen;
	private Element schreiben;
	
	public Puffer(int size){
		
		lesen = new Element();
		Element tmp = lesen;
		
		for(int i=0; i<=size; i++){
			tmp.next = new Element();
			tmp = tmp.next;
			
		}
		tmp.next=lesen;
		schreiben = lesen;
	}
	
	public boolean isEmpty(){
		return (lesen==schreiben);
	}
	
	public boolean isFull(){
		return (schreiben.next == lesen);
		
	}
	
	public T lesen(){
		T tmp = lesen.value;
		lesen = lesen.next;
		return tmp;
	}
	
	public void schreiben(T value){
		schreiben.value = value;
		schreiben = schreiben.next;
		
	}
	
	private class Element{
		private T value;
		private Element next;
		
	}

}
