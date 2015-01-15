
public class ChainedListMain {

	public static void main(String[] args) {
		ChainedList CL = new ChainedList();
		String[] stringArray = {"erster","zweiter","dritter","vierter","fünfter","sechster","siebter"};
		
		for(int i=0; i<stringArray.length;i++)
			CL.add(stringArray[i]);
		
		
		
		System.out.println(CL.getSize());
		
			
		
	}

}
