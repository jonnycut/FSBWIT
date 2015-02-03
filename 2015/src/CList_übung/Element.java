package CList_übung;

public class Element {
	private Auto auto;
	private Element next;
	
	public Element(Auto auto){
		this.auto=auto;
		this.next=null;
	}
	
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	
	
	
	
}
