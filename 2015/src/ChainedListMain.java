
public class ChainedListMain {

	public static void main(String[] args) {
		ChainedList CL = new ChainedList();
		String[] stringArray = {"erster","zweiter","dritter","vierter","fünfter","sechster","siebter","achter"};
		
		for(int i=0; i<stringArray.length;i++)
			CL.add(stringArray[i]);
		
		
		System.out.println("Alte:");
		for (int i=0; i<CL.getSize(); i++){
			System.out.println(CL.atIndex(i));
		}
		System.out.println(CL.getSizeRekursiv());
		System.out.println(CL.getIndex("erster"));
		System.out.println("Deleted String: " +CL.removeAt(7));
		System.out.println();
		//CL.add("a");
		//CL.addEnd("NULLTER");
		
		System.out.println("Neue Liste:");
		for (int i=0; i<CL.getSize(); i++){
			System.out.println(CL.atIndex(i));
		}
		
//		System.out.println();
//		System.out.println("kleinster ist: " + CL.min());
//		System.out.println("Kürzester ist: " + CL.shortest());
//		
			
		
	}

}
