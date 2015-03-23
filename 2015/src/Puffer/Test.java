package Puffer;

public class Test {

	public static void main(String[] args) {
		Puffer<Integer> p =new Puffer<>(50);
		
		for(int i=0; i<1000;){
			
			int weite = (int)(Math.random()*230);
			for(int x=0; x<=weite ;x++){
				if(p.isFull())break;
				p.schreiben(i);
				i++;
				if(i==1001) break;
			}
			for(int y=0; y<weite;y++){
				if(p.isEmpty()) break;
				System.out.println(p.lesen());
			}
		}
	}

}
