
public class ChainedList {
	
	private ChainedElement first;
	
	public void add (String value){
		
		ChainedElement element = new ChainedElement(value);
		if (isEmpty() == true){ 
			first = element;
		}else{		
			element.setNext(first);;
			first = element;	
		}
		
	}
	
	public boolean isEmpty(){
		
		if(first == null) return true;
		
		return false;
	}
	
	public int getSize(){
		
		ChainedElement pointer = first;
		int counter = 0;
				
			while(pointer != null){
				
				pointer = pointer.getNext();
				counter ++;
				
			}			
		return counter;
	}
	
	
	public void delete(String value){
		
		if(first.getValue() == null) return;
		if(first.getValue().equalsIgnoreCase(value)){
			first = first.getNext();
			return;
		}
		
		ChainedElement ele = first.getNext();
		ChainedElement last = first;
		while(ele != null){
			
			if(ele.getValue().equalsIgnoreCase(value)){
				last.setNext(ele.getNext());
				break;
			}
			last = ele;
			ele = ele.getNext();
		}
		
	}
	
	public String pop(){
	
		ChainedElement puffer = first;
		first = first.getNext();
		return puffer.getValue();
	}
	
	public void push(String value){
		add(value);
		
	}
	
	
	
//-----------------------------------------------Rekursion----------------------------------------------------------------------//
	public int getSizeRekursiv(){
		if (isEmpty()) return -1;
		return getSizeRekursiv(first);
	}
	
	private int getSizeRekursiv(ChainedElement element){
				
		if(element.getNext() != null){
		return getSizeRekursiv(element.getNext()) +1;
		}else return 1;
	}
	
	public int getIndex(String text){
		if (isEmpty()) return -1;
		return getIndex(text, first, getSize() -1);
		
		
	}
	private int getIndex(String text, ChainedElement element, int counter){
	
		if(text.equals(element.getValue())) {
			return counter;
		}else if (element.getNext() == null){
			return -1;
		}else return getIndex(text,element.getNext(),counter-1);
				
				
	}
	
	public String atIndex(int index){
		if(isEmpty()) return "Liste leer";
		return atIndex(index,first,getSize()-1);
	}
	
	private String atIndex(int index, ChainedElement element,int counter){
		
		if(counter == index){ 
			return element.getValue();
		}else if (element.getNext() ==null){
			return "index " + index + " nicht vorhanden";
		}else return atIndex(index,element.getNext(),counter -1);
		
	}
	
	public String removeAt(int index){
		if(isEmpty()) return "Index "+index + " nicht vorhanden";
		return removeAt(index,first,getSize()-1);
	}
	
	private String removeAt(int index, ChainedElement element, int counter){
		ChainedElement puffer;
		if(element.getNext()==null) 
			return "Index "+index+" nicht vorhanden!";
		if(index == getSize()-1){
			puffer = first;
			first = first.getNext();
			return puffer.getValue();
		}
		if(counter -1 ==0){ 
			puffer = element.getNext();
			element.setNext(null);
			return puffer.getValue();
		}
		if(counter-1 ==index){
			puffer = element.getNext();
			element.setNext(element.getNext().getNext()); 
			return puffer.getValue();
			
		}else return removeAt(index, element.getNext(), counter -1);
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
//-----------------------------------------------EndRekursion-------------------------------------------------------------------//	

}
