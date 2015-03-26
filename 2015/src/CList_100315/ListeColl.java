package CList_100315;

import java.util.Iterator;
import java.util.Collection;


public class ListeColl<T> implements Collection<T> {
private Element first;
	
	
	public boolean add(T value){
		if(first==null){
			first = new Element(value);
			return true;
		}else{
			Element tmp = first;
			first = new Element(value);
			first.next=tmp;
			return true;
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
	

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
