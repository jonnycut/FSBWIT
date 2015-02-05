package doubleChainedList05022015;

public class Element {
	
	private Falk value;
	private Element next;
	private Element prev;
	
	
	public Element (Falk value){
		this.value = value;
	}
	
	public Falk getValue() {
		return value;
	}
	public void setValue(Falk value) {
		this.value = value;
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	public Element getPrev() {
		return prev;
	}
	public void setPrev(Element prev) {
		this.prev = prev;
	}
	
	
	
	
	
}
