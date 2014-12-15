import java.util.Scanner;


public class TestSort {

	public static void main(String[] args) {
		
		arraySort aS = new arraySort();
		Scanner s = new Scanner(System.in);
		int eingabe = 0;
		
		for (;true;){
			
			System.out.println("1 = Array Sort");
			System.out.println("2 = String Sort");
			System.out.println("3 = Organgenzeugs");
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
				break;
				
				case 3:
					arraySort aR = new arraySort();
					String[][] daten = {{"true", "NegerEier","false","0.1"},
										{"true","Navel", "false","0.5"},
										{"false","Blut","true","0.4"}
									   };
					Orange[] orangen = new Orange[daten.length];
					
					for(int i=0; i < daten.length; i++){
						
							orangen[i] = new Orange(Boolean.parseBoolean(daten[i][0]), daten[i][1], Boolean.parseBoolean(daten[i][2]), Double.parseDouble(daten[i][3]));
					
					
					} //end for	
					
					for(Orange k:orangen) 
						System.out.println(k.getGewicht());  //ende ausgabe unsortiert
					
					aR.obstSort(orangen);
					System.out.println();
					
					for(Orange k: orangen)
						System.out.println(k.getGewicht());
					
					
					break;
					
				} //ende Switch
			} // ende for true
		} //ende Main
		

	} //ende class


