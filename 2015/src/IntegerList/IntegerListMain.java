package IntegerList;

public class IntegerListMain {

	public static void main(String[] args) {
		IntList IL = new IntList();
		
		for(int i=5;i!=0;i--){
			IL.add(i);
		}
		
		System.out.println(IL.toString());

		System.out.println(IL.copy());
		
		
		

	}

}
