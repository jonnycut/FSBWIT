package OsterUebung;

public class OsterTest {

	public static void main(String[] args) {
		Liste<Osterhase> hasenStall = new Liste<>();
		
		for(int i=0;i<20;i++){
			hasenStall.add(new Osterhase((int)(Math.random()*51+50)));
		}
		
		System.out.println(hasenStall);
		
		hasenStall.sort();
		System.out.println("\n\nsortiert:\n");
		System.out.println(hasenStall);
		
		hasenStall.sort2(Osterhase.KORB_ORDER);
		System.out.println("\n\n Nach Korbgewicht:\n");
		System.out.println(hasenStall);
		
		

	}

}
