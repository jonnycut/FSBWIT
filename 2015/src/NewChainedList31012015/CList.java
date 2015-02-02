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
			if(puffer== null) return -1;
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
// entfernt �bergebenes Element (rElement)
	
	public void remove(CElement rElement){
		if(isEmpty()) return;
		remove(rElement, first);
	}
	
	private void remove(CElement rElement, CElement element){
		if(element == null) return;
		if(first==rElement){
			pop(); //wenn das zu entfernende Element das erste der Liste ist, wird pop() genutzt.
			return;
		}
		if(element.getNext() == rElement){
			element.setNext(rElement.getNext()); //next des Elements auf das Folgeelement der Liste setzen (damit l�schen von rElement)
			return;
		}
		remove(rElement, element.getNext());
			
	}
	
//----------------------------------------------------------------------//
// Gibt höchstes Element einer Liste zurück
	
	public CElement getHighest(){
		if(isEmpty()) return null;
		
		return getHighest(this.first,this.first); 
	}
	
	private CElement getHighest(CElement element, CElement high){
		if(element==null)return high;
		
		if(element.getValue()>high.getValue())
			return getHighest(element.getNext(),element);
		else
			return getHighest(element.getNext(), high);
	}
//----------------------------------------------------------------------//
	
	public CElement getLow(){
		if(isEmpty()) return null;
		
		return getLow(this.first,this.first);
	}
	
	private CElement getLow(CElement element, CElement low){
		if(element == null) return low;
		
		if(element.getValue()< low.getValue())
			return getLow(element.getNext(), element);
		else
			return getLow(element.getNext(),low);
	}
	
//----------------------------------------------------------------------//
//erstellt eine neue Liste, in die die Elemente der alten Liste absteigend einsortiert werden.
//die alte Liste wird w�hrend des Vorgangs geleert.
	public CList sort(){
		if(isEmpty()) return this;
		CList CLS = new CList();
		CElement puffer = this.getHighest();
		
		CLS.first= puffer;
		remove(puffer);
		CLS.first.setNext(null);
		
		CElement newElement = CLS.first;
		
		while(!this.isEmpty()){
			puffer= this.getHighest(); 			//höchstes Element der alten Liste in Puffer schreiben
			newElement.setNext(puffer);			//höchstes Element der alten Liste als next des aktuellen Elements der neuen Liste setzen
			this.remove(puffer); 				//letztes h�chstes der alten Liste löschen (remove())
			newElement = newElement.getNext(); 	//zu bearbeitendes Element eins weiter setzen
			newElement.setNext(null); 			//next des Elements der sortierten Liste auf null 
												//-> um relationen der alten Liste zu löschen und StackOverflow zu verhindert
			
			
			
		}
		return CLS;
	}
	
//----------------------------------------------------------------------//
//liefert eine aufsteigend Sortierte neue Liste zurück
	public CList sortAuf(){
		if(isEmpty()) return this;
		
		CList CLS = new CList();
		CElement puffer = this.getLow();
		CLS.first = puffer;
		remove(puffer);
		CLS.first.setNext(null);
		
		CElement newElement = CLS.first;
		
		while(!this.isEmpty()){
			puffer = this.getLow();
			newElement.setNext(puffer);
			this.remove(puffer);
			newElement = newElement.getNext();
			
		}newElement.setNext(null);
		
		return CLS;
	}

//----------------------------------------------------------------------//
//Kopiert eine Liste 1:1 und gibt diese Kopie zurück
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class body
