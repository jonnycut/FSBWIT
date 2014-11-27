
import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		Rechner r = new Rechner();
		Scanner s = new Scanner(System.in);
		int[] zalte = new int[2];
		
		
		
		System.out.println("Anzal Zeile, Anzahl Spalte:");
		for (int a =0; a<2; a++){
			zalte[a] = s.nextInt();
		}
			
		
		/*
		int[][] array =r.array(zalte[0], zalte[1]);
		
		for (int x = 0; x < array.length; x++){
			for(int i = 0; i < array[x].length -1;i++){
				System.out.print(array[x][i]);
			}
			System.out.println();
		}*/
		System.out.println(r.arrayToString(r.array(zalte[0], zalte[1])));

	}

}
