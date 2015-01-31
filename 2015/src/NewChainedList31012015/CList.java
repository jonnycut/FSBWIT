package NewChainedList31012015;

public class CList {
	
	CElement first;
	
	public void add(int value){
		
		if(isEmpty()){ 
			first=new CElement(value);
		}else{
			CElement puffer;
			puffer = first;
			first = new CElement(value);
			first.setNext(puffer);
		}
		
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int pop(){
		
		if(isEmpty()){ 
			return -1;
		}else{
			CElement puffer;
			puffer = first;
			first = first.getNext();
			return puffer.getValue();
		}
			
			
	} //end pop
//----------------------------------------------------------------------//	
	public int getSize(){
		if(isEmpty()) return 0;
		return getSize(first);
	}
	
	private int getSize(CElement element){
		if(element.getNext() ==null) return 1;
		return getSize(element.getNext()) +1;
		
	}
//----------------------------------------------------------------------//	
	public int getIndex(int value){
		
		if(isEmpty()) return -1;
		
		return getIndex(first, value, getSize()-1);
		
	}
	
	private int getIndex(CElement element, int value, int index){
		
		if(element.getValue() == value) return index;
		if(element.getNext() == null) return -1;
		
		return getIndex(element.getNext(), value, index-1);
		
	}
//----------------------------------------------------------------------//
	
	public int atIndex(int index){
		if(isEmpty()) return -1;
		if(index > getSize()-1) return -1;
		int current = getSize()-1;
		return atIndex(first, index, current);
	}
	
	private int atIndex(CElement element, int index, int current){
		if(current == index) return element.getValue();
		return atIndex(element.getNext(), index, current -1);
	}
//----------------------------------------------------------------------//	
	public String toString(){
		if(isEmpty()) return "[LEER]";
		return "[" +toString(first);
	}
	
	private String toString(CElement element){
		if(element.getNext() ==null) return element.getValue()+"]";
		return +element.getValue() +";"+ toString(element.getNext());
	}
//----------------------------------------------------------------------//		
	public String toStringReverse(){
		if(isEmpty()) return "[LEER]";
		return "[" +toStringReverse(first)+"]";
	}
	
	private String toStringReverse(CElement element){
		if(element.getNext() ==null) return element.getValue()+"";
		return  toStringReverse(element.getNext())+";"+element.getValue();
	}
//----------------------------------------------------------------------//
	public void addAtIndex(int value, int index){
		if(index > getSize()) return;
		if(index ==getSize()|isEmpty()){
			add(value);
			return;
		}
		int current= getSize()-1;
		addAtIndex(first, value, index, current);
	}
	
	private void addAtIndex(CElement element, int value, int index, int current){
		if(current == index){
						
			CElement puffer = element.getNext();
			element.setNext(new CElement(value));
			element.getNext().setNext(puffer);
			
		}else{
			addAtIndex(element.getNext(),value,index, current-1);
		}
	}

//----------------------------------------------------------------------//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class body
