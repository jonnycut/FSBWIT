package CList_100315;

public class Liste<T extends Comparable<T>> {
	private Element<T> first;
	private int size;
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void add(T value){
		Element<T> neu = new Element<T>(value);
		if(isEmpty()) 
			first = neu;
		else{
			neu.next=first;
			first = neu;
		}
		size++;
				
	}
	
	public String toString(){
		String rueck="";
		Element act = first;
		for(int i=0; i<getSize();i++){
			rueck += act.value+";";
			act =act.next;
		}
		return rueck;
	}
	
	public int getSize(){
		return size;
	}
	public int contains(T value){
		int anzahl =0;
		Element<T> act =first;
		while(act!=null){
			if(act.value==value)anzahl++;
			act = act.next;
		}
		
		
		return anzahl;
	}
	
	
	public class Element<T>{
		private T value;
		private Element<T > next;
		
		public Element(T value){
			this.value=value;
			this.next=null;
		}		
		
	}

}
