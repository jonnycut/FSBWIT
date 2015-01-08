
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
		if(!isEmpty()){
				
			for(;pointer.getNext() != null;){
				
				pointer = pointer.getNext();
				counter ++;
				
			}
		}
			
		return counter;
	}
	
	

}
