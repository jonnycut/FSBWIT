package Schocken;

public class Becher implements Comparable {
	String name;
	int a;
	int b;
	int c;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public Becher(String name){
		this.name = name;
		a= (int) (Math.random()*6)+1;
		b= (int) (Math.random()*6)+1;
		c=(int) (Math.random()*6)+1;
	}
	
	public void print(){
		if(a==1&&b==1||a==1&&c==1||b==1&&c==1)
			System.out.println("Schock!!");
		
		if(a+1==b &&b+1==c)
			System.out.println("Straße");
		
		if(a==b&&b==c)
			System.out.println("General");
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void wuerfeln(String wuerfel){

		switch(wuerfel){
		
		case"a":
			a= (int) (Math.random()*6)+1;
			break;
			
		case"ab":
			a= (int) (Math.random()*6)+1;
			b= (int) (Math.random()*6)+1;
			break;
		
		case"abc":
			a= (int) (Math.random()*6)+1;
			b= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			break;
			
		case"bc":
			b= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			break;
			
		case"ac":
			a= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			break;
			
		case"d":
			if(a==6&&b==6)
				a=1;
				b=(int) (Math.random()*6)+1;
			if(a==6&&c==6)
				a=1;
				c=(int) (Math.random()*6)+1;
			if(b==6&&c==6)
				b=1;
				c=(int) (Math.random()*6)+1;
			if(a==6&&b==6&&c==6)
				a=b=1;
				c=(int) (Math.random()*6)+1;
			break;
			
		
		
			
		}
		
		
	}

	public int compareTo(Becher b2) {
		int becher2 = b2.getA()+b2.getB()+b2.getC();
		int becher1 = this.a+this.b+this.c;
		
		
		// TODO Auto-generated method stub
		return becher1 - becher2;
	}

}
