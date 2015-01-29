package IntegerList;

public class IntList {
	IntElement first = null;
	
	public void add(int value){
		IntElement puffer;
		if(first==null)
			first = new IntElement(value);
		else{
			puffer = first;
			first= new IntElement(value);
			first.setNext(puffer);
			}
		
	}
	
	public String toString(){
		
		return toString(first);
	}
	
	private String toString(IntElement element){
		String string="";
		if(element.getNext() == null) return string += element.getValue();
		return string += element.getValue() + ":" + toString(element.getNext());
	}
	public void umsortieren(){
		
		IntList ILS = new IntList();
		IntElement altEle = this.first;
		ILS.first = umsortieren(altEle,altEle, ILS.first);
		IntElement element=altEle;
		IntElement elementA = ILS.first;
		
		System.out.println(ILS.toString());
		while (element!= null){
		elementA.setNext(umsortieren(element,element,elementA));
		
		element = element.getNext();
		elementA = elementA.getNext();
		}
		
		System.out.println(ILS.toString());
		
		
	}
	
	private IntElement umsortieren(IntElement element, IntElement high, IntElement first){
		if(element==null||element==first)
			return high;
		
		if(element.getValue()> high.getValue()){
			
			return high = umsortieren(element.getNext(),element,first);
		}else{
			
			return high = umsortieren(element.getNext(),high,first);
		}
		
	}
	
	public IntList copy(){
		if(this.first == null) return new IntList();
		IntList neu = new IntList();
		IntElement elementNeu = neu.first;
		IntElement elementAlt = this.first;
		
		neu.first = this.first;
		while(elementAlt.getNext()!=null && elementNeu !=null){
			elementNeu.setNext(elementAlt.getNext());
			elementNeu = elementNeu.getNext();
			elementAlt = elementAlt.getNext();
		}
		
		
		
		
		return neu;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
