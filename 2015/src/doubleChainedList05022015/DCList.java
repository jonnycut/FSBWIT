package doubleChainedList05022015;

public class DCList {
	private Element first;
	private Element last;
	
	

	public boolean isEmpty(){
		return first==null;
		
	}
	
	public void add(Falk falk){
		
		Element element =new Element(falk);
		
		if(this.isEmpty()){
			first = element;
			last = first;
		}else{
			last.setNext(element);
			element.setPrev(last);
			last=element;
			
		}
	}
	
	public String toString(){
		if(isEmpty()) return "[LEER]";
		
		String ausgabe="";
		Element element = first;
		
		while(element!=null){
			ausgabe += element.getValue().toString() +";\n";
			element = element.getNext();
					
		}
		return ausgabe;
	
	}
	
	public String toStringRev(){
		if(isEmpty()) return "[LEER]";
			
		String ausgabe="";
		Element element = last;
		
		while(element!=null){
			ausgabe += element.getValue().toString() +";\n";
			element = element.getPrev();
					
		}
		return ausgabe;
	}
	
}
