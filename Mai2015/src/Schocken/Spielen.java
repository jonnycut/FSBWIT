package Schocken;

import java.util.*;

public class Spielen {

	public static void main(String[] args) {
		Becher spieler1 = new Becher("Kai");
		Becher spieler2 = new Becher("Dennis");
		Scanner s = new Scanner(System.in);
		
		Becher active = spieler1;
		System.out.println(active.name);
		
		for(int j=0;j<2;j++){
			active.print();
			for(int i=0; i<3;i++){
				
				String eingabe = s.next();
				
					
				if(eingabe!= null)
					active.wuerfeln(eingabe);
				if(eingabe.equals("x"))
					break;
				if(i==1){
					System.out.println("3. Wurf = Dunkel");
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
			}else{
				System.out.println("Aktiver Spieler = "+active.name);
			}
		}
	}

}
