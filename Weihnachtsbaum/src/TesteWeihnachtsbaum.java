
public class TesteWeihnachtsbaum {

	public static void main(String[] args) {
		
		
		Weihnachtsbaum[] wald = new Weihnachtsbaum[20];
		
		
		for (int i=0; i< 20; i++){
			
			wald[i] = new Weihnachtsbaum();
			System.out.println(wald[i].getGroesse());
			
		}
		
	
		
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
		
		
		
		

	}

}
