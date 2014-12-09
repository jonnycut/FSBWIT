
public class TestSort {

	public static void main(String[] args) {
		
		int[] array = {5,8,9,0,7,1,4,2,3,6,10,2300,2135,12};
		arraySort aS = new arraySort();
		
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] +";");
		
		System.out.println();
		aS.sortieren(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] +";");
	}

}
