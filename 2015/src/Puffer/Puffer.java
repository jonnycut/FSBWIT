package Puffer;

public class Puffer<T> {
	
	private Element lesen;
	private Element schreiben;
	
	public Puffer(int size){
		
		lesen = new Element();
		Element tmp = lesen;
		
		for(int i=0; i<=size; i++){
			tmp.next = new Element();
			
		}
		tmp.next=lesen;
		schreiben = lesen;
	}
	
	private class Element{
		private T value;
		private Element next;
		
	}

}
