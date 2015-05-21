package Schocken;

import java.util.*;

public class Spielen {

	public static void main(String[] args) {
		Becher spieler1 = new Becher("Kai");
		Becher spieler2 = new Becher("Dennis");
		String ausgabe="";
		Map<Becher, Integer> spielstand = new HashMap<>();
		spielstand.put(spieler1, 0);
		spielstand.put(spieler2, 0);
		
		Scanner s = new Scanner(System.in);
		
		Becher active = spieler1;
		System.out.println(active.name);
		
		for(int j=0;j<2;j++){
			active.print();
			for(int i=0; i<3;i++){
				
				String eingabe = s.next();
				
					
				if(eingabe!= null)
					ausgabe=active.wuerfeln(eingabe);
				if(eingabe.equals("x"))
					break;
				if(i==1){
					System.out.println("3. Wurf = Dunkel - draußen:"+ausgabe);
					break;
				}
				
				active.print();
			}
		
			active = spieler2;
			if(j==1){
				System.out.println("\n\n\n");
				System.out.println(spieler1.name +": \n");
				spieler1.print();
				System.out.println(spieler2.name +": \n");
				spieler2.print();
				if(spieler1.compareTo(spieler2)<0){
					Integer bisher = spielstand.get(spieler1);
					if(bisher==null)
						spielstand.put(spieler1, 1);
					else
						spielstand.put(spieler1, bisher+1);
				}
				
				if(spieler1.compareTo(spieler2)>0){
					Integer bisher = spielstand.get(spieler2);
					if(bisher==null)
						spielstand.put(spieler2, 1);
					else
						spielstand.put(spieler2, bisher+1);
				}
				System.out.println("Spielstand:");
				System.out.println("Spieler1: "+spielstand.get(spieler1));
				System.out.println("Spieler2: "+spielstand.get(spieler2));
				
			}else{
				System.out.println("Aktiver Spieler = "+active.name);
			}
		}
	}

}
