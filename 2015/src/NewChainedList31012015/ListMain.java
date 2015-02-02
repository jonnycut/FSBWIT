package NewChainedList31012015;

public class ListMain {

	public static void main(String[] args) {
		
		CList CL = new CList();
		
		for(int i=0;i<5;i++){
			CL.add((int)(Math.random()*10));
		}
//		System.out.println(CL.getLow().getValue());
//		System.out.println("Normal:  " +CL.toString());
//		//System.out.println("Reverse: " + CL.toStringReverse());
//		System.out.println("L�nge der Liste: "+CL.getSize());
//
//		System.out.println("An index 0 steht: "+CL.atIndex(0));
//		System.out.println("First ist: " + CL.first.getValue());
//		//CL.addAtIndex(20,6);
//		//System.out.println("Neue Liste: "+ CL.toString());
//		//System.out.println("Neues first: " +CL.first.getValue());
//		System.out.println("das Gr��ste Element ist: " +CL.getHighest().getValue());
		CL = CL.sort();
		System.out.println("Absteigend: "+CL.toString());
		CL = CL.sortAuf();
		System.out.println("Aufsteigend: "+CL.toString());
		
		
		
		
	}

}
