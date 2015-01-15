
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
	
	

}
