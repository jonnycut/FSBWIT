package CList_übung;

public class CList {
	Element first=null;
	
	public void add(Auto auto){
		if(first==null) 
			first = new Element(auto);
		else{
			Element puffer = first;
			first =new Element(auto);
			first.setNext(puffer);
			}
			
	}
	
//-----------------------------------------------------------------------------------------------------------//
	public Auto pop(){
		if(first==null) return null;
		Auto puffer = first.getAuto();
		first = first.getNext();
		return puffer;
	}
//-----------------------------------------------------------------------------------------------------------//
	public boolean isEmpty(){
		return first==null;
	}
	
}
