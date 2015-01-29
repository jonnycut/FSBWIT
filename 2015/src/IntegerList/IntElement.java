package IntegerList;

public class IntElement {
	IntElement next;
	int value;
	
	public IntElement(int value){
		this.value = value;
		this.next=null;
	}
	
	public IntElement getNext() {
		return next;
	}
	public void setNext(IntElement next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	

}
