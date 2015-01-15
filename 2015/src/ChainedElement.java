
public class ChainedElement {
	
	private String Value;
	private ChainedElement next;
	
	
	public ChainedElement(String value) {
		super();
		Value = value;
		this.next = null;
	}	
	
	public String getValue() {
		return Value;
	}
	
	public void setValue(String value) {
		Value = value;
	}
	
	public ChainedElement getNext() {
		return next;
	}
	
	public void setNext(ChainedElement next) {
		this.next = next;
	}
	
	
	
	
	

}
