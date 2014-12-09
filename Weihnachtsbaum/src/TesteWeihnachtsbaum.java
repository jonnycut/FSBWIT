import java.util.Scanner;


public class TesteWeihnachtsbaum {

	public static void main(String[] args) {
		
		
		Weihnachtsbaum[] wald = new Weihnachtsbaum[20];
		Scanner s = new Scanner(System.in);
		
		
		
		for (int i=0; i< 20; i++){
			
			wald[i] = new Weihnachtsbaum();
			System.out.println(wald[i].getGroesse());
			
		}
		
		System.out.println("Sortierung aufsteigend: 1");
		System.out.println("Sortierung absteigend: 2");
		System.out.println("Sortierung Insert: 3");
		int auswahl = s.nextInt();
		
			switch (auswahl) {
				case 1:
					
					Weihnachtsbaum[] sortBaum = new Weihnachtsbaum[20];
					
					for (int g = 0; g < 20; g++){
						int kleinStelle =0;
						double kleinster = 1.80;
						Weihnachtsbaum kleinsterB = null;
					
						for (int i = 0, j= 0; i < wald.length; i++ ){
							
							if (wald[i] != null){ 
								if (wald[i].getGroesse() < kleinster){
									
									kleinster = wald[i].getGroesse();
									kleinsterB = wald[i];
									kleinStelle = i;
									
								}
								
							}
						}
						
						wald[kleinStelle]=null;
						sortBaum[g] = kleinsterB;
						
					}
					System.out.println("Der kleinste ist " + sortBaum[0].getGroesse());
					for (Weihnachtsbaum k:sortBaum){
						System.out.println(k.getGroesse());
					}
					break;
					
				case 2:
					
					Weihnachtsbaum[] sortBaumAb = new Weihnachtsbaum[20];
					
					for (int g = 0; g < 20; g++){
						int groessteStelle = 0;
						double groesster = 1.10;
						Weihnachtsbaum groessterB = null;
						
						for (int i= 0 ; i < wald.length; i ++){
							
							if (wald[i] != null){
								if (wald[i].getGroesse() > groesster){
									groesster = wald[i].getGroesse();
									groessterB = wald[i];
									groessteStelle = i;
								}
							}
						}
						wald[groessteStelle] = null;
						sortBaumAb[g] = groessterB;
						
					}
					System.out.println("Der groesste ist: " +sortBaumAb[0].getGroesse());
					for (Weihnachtsbaum k:sortBaumAb){
						
						System.out.println(k.getGroesse());
					}
					break;
				
				case 3:
					
					Weihnachtsbaum[] sortBaumInsert = new Weihnachtsbaum[20];
					
					for(int g = 0; g < wald.length; g++){
						
							Weihnachtsbaum puffer = null;
							sortBaumInsert[g] = wald[g];
							
							for (int i = g; i > 0; i--){
								if (sortBaumInsert[i].getGroesse() < sortBaumInsert[i -1].getGroesse()){
									puffer = sortBaumInsert[i];
									sortBaumInsert[i] = sortBaumInsert[i-1];
									sortBaumInsert[i-1] = puffer;
									
								}
							}
						
					}
					for (Weihnachtsbaum k: sortBaumInsert){
						System.out.println(k.getGroesse());
					}
					
		}
			
		

	}


}

	
