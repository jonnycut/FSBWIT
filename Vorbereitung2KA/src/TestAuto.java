
public class TestAuto {

	public static void main(String[] args) {
		
		String[][] daten = {{"blau", "ABS S 123", "4.2", "1"},
							{"rot", "LL LL 133", "2.4", "2"},
							{"silber", "B CD 99", "6.8", "4"},
							{"schwarz","SE X 69","1.2","2"},
							{"weiß","OA XX 69","3.0","5"} };
		
		Auto[] garage = new Auto[daten.length];
		
		for (int i = 0; i < garage.length; i++){
			garage[i] = new Auto();
			garage[i].setFarbe(daten[i][0]);
			garage[i].setKennzeichen(daten[i][1]);
			garage[i].setHubraum(Double.valueOf(daten[i][2]));
			garage[i].setSitzplaetze(Integer.valueOf(daten[i][3]));		
		}
		System.out.println("Auto           Farbe       KZ    HR    SP");
		
		
		for (int i = 0; i < garage.length; i++){
			System.out.print(garage[i] +";  ");
			System.out.print(garage[i].getFarbe() +"; ");
			System.out.print(garage[i].getKennzeichen() +"; ");
			System.out.print(garage[i].getHubraum() +"; ");
			System.out.print(garage[i].getSitzplaetze() +"; ");
			System.out.println();
		}
		
		
		}

	}


