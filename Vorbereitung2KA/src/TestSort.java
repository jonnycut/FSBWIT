import java.util.Scanner;


public class TestSort {

	public static void main(String[] args) {
		
		arraySort aS = new arraySort();
		Scanner s = new Scanner(System.in);
		int eingabe = 0;
		
		for (;true;){
			
			System.out.println("1 = Array Sort");
			System.out.println("2 = String Sort");
			eingabe = s.nextInt();
			
		
			switch (eingabe){
				case 1:
						int[] array = {5,8,9,0,7,1,4,2,3,6,10,2300,2135,12};
						
		
						for (int i = 0; i < array.length; i++)
							System.out.print(array[i] +";");
						
						System.out.println();
						aS.sortieren(array);
						for (int i = 0; i < array.length; i++)
							System.out.print(array[i] +";");
						
				break;
				
				case 2:
					
					System.out.println("String1:");
					String s1 = s.next();
					System.out.println("String2");
					String s2 = s.next();
					if (aS.lexi(s1, s2) == true){
						System.out.println(s2);
						System.out.println(s1);
					}else
						System.out.println(s1);
						System.out.println(s2);
			}
		}
		

	}

}
