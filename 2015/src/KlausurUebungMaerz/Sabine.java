package KlausurUebungMaerz;

import java.util.Comparator;

public class Sabine implements Comparable<Sabine> {
	private int gewicht;
	private int groesse;
	private char oberweite;
	
	public Sabine(){
		this.gewicht= (int)(Math.random()*81+70);
		this.groesse=(int)(Math.random()*11+160);
		this.oberweite=(char)(Math.random()*6+'B');
	}
	
	public static final Comparator<Sabine>
		OBERWEITE_ORDER = new Comparator<Sabine>(){
		public int compare(Sabine s1, Sabine s2){
			return s2.oberweite-s1.oberweite;
		}
	};
	
	
	

	
	public int getGewicht() {
		return gewicht;
	}

	public int getGroesse() {
		return groesse;
	}

	public char getOberweite() {
		return oberweite;
	}

	public int compareTo(Sabine sabse2) {
		
		return this.gewicht-sabse2.gewicht;
	}
	
	public String toString(){
		
		return "Gewicht: "+this.gewicht+"\tGroesse: "+this.groesse+"\tOberweite: "+this.oberweite;
	}
	
	

}
