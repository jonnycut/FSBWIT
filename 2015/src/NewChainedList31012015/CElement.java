package NewChainedList31012015;

public class CElement {
	private int value;
	
	public CElement(int value){
		this.value = value;
		this.next = null;
	} 
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public CElement getNext() {
		return next;
	}


	public void setNext(CElement next) {
		this.next = next;
	}


	private CElement next;
	

	
	
	

}
