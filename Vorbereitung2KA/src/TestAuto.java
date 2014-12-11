
public class TestAuto {

	public static void main(String[] args) {
		
		String[][] daten = {{"blau", "A S 123", "4.2", "1"},
							{"rot", "LL LL 133", "2.4", "2"},
							{"silber", "B CD 99", "6.8", "4"},
							{"schwarz","SE X 69","1.2","2"},
							{"weiß","OA XX 69","3.0","5"},
							{"gelb","ZZ AB 881","2.5","4"}};
		
		Auto[] garage = new Auto[daten.length];
		arraySort  aS = new arraySort(); 
		
		for (int i = 0; i < garage.length; i++){
			garage[i] = new Auto(daten[i][0], daten[i][1], Double.valueOf(daten[i][2]), Integer.valueOf(daten[i][3]), Double.toHexString((Math.random() * 10000)));
					//(Double.toHexString(Math.random() * 100000));
		}
		
		aS.sortierenAuto(garage);
				
		
		for (int i = 0; i < garage.length; i++){
			System.out.println(garage[i]);
		}
		
		
	}

}


