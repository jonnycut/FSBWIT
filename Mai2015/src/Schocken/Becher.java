package Schocken;
import java.util.*;

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
	
	public String wuerfeln(String wuerfel){
		
		switch(wuerfel){
		
		case"a":
			a= (int) (Math.random()*6)+1;
			return "b="+b+" c="+c;
		
		case"b":
			b= (int) (Math.random()*6)+1;
			return "a="+a+" c="+c;
		
		case"c":
			c= (int) (Math.random()*6)+1;
			return "a="+a+" b="+b;
			
		case"ab":
			a= (int) (Math.random()*6)+1;
			b= (int) (Math.random()*6)+1;
			return "c="+c;
		
		case"abc":
			a= (int) (Math.random()*6)+1;
			b= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			return "";
			
		case"bc":
			b= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			return "a="+a;
			
		case"ac":
			a= (int) (Math.random()*6)+1;
			c= (int) (Math.random()*6)+1;
			return "b="+b;
			
		case"d":
			if(a==6&&b==6){
				a=1;
				b=(int) (Math.random()*6)+1;
				return "a="+a+" c="+c;
			}
			if(a==6&&c==6){
				a=1;
				c=(int) (Math.random()*6)+1;
				return "a="+a+" b="+b;
			}
			if(b==6&&c==6){
				b=1;
				c=(int) (Math.random()*6)+1;
				return "a="+a+" b=" +b;
			}
			if(a==6&&b==6&&c==6){
				a=b=1;
				c=(int) (Math.random()*6)+1;
				return "a="+a+" b="+b;
			}
			break;
			
		
		
			
		}
		
		return "";
		
	}

	public int compareTo(Becher b2) {
		int counter =0;
		List<Integer> becher2 = new ArrayList<>();
		becher2.add(b2.getA());
		becher2.add(b2.getB());
		becher2.add(b2.getC());
		
		Collections.sort(becher2);
			
		
		
		
		List<Integer> becher1 = new ArrayList<>();
		becher1.add(this.a);
		becher1.add(this.b);
		becher1.add(this.c);
		
		Collections.sort(becher1);
//		for(int a: becher2){
//			if(a==1)
//				counter++;
//			if(counter ==2)
//				break;
//		}
		
		
		
		if(becher1.get(0)!=becher2.get(0))
			return becher1.get(0)-becher2.get(0);
		else
			if(becher1.get(1)!=becher2.get(1))
				return becher1.get(1)-becher2.get(1);
			else
				return becher1.get(2)-becher2.get(2);
		
	}

}
