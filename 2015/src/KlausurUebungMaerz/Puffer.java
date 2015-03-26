package KlausurUebungMaerz;

import java.util.Iterator;

public class Puffer<T> implements Iterable<T> {
	private Element lesen;
	private Element schreiben;
	
	public Puffer(int size){
		lesen = new Element();
		Element tmp = lesen;
		
		for(int i=0; i<size;i++){
			tmp.next = new Element();
			tmp=tmp.next;
		}
		
		tmp.next = lesen;
		schreiben = lesen;
	}
	
	public void schreiben(T value){
		schreiben.value=value;
		schreiben=schreiben.next;
		
	}
	
	public T lesen(){
		T temp = lesen.value;
		lesen = lesen.next;
		return temp;
	}
	
	public boolean isEmpty(){
		return schreiben==lesen;
	}
	
	public boolean isFull(){
		return schreiben.next==lesen;
	}
	
	private class Element{
		private T value;
		private Element next;
		
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Aufzaehler();
	}
	
	private class Aufzaehler implements Iterator<T>{
		private Element act = lesen;
		private Element last = schreiben;
		
		@Override
		public boolean hasNext() {
			
			return act!=last;
		}

		@Override
		public T next() {
			T value = act.value;
			act=act.next;
			return value;
		}
		
	}

}
