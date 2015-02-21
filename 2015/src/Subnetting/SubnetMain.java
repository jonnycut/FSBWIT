package Subnetting;

import java.util.Scanner;

public class SubnetMain {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Netzwerk netz = new Netzwerk(new IPAdresse(192,168,2,1),new IPAdresse(255,255,255,0));
			System.out.println("IP: " + netz.getIp());
			System.out.println("Netz: "+netz);
			System.out.println(netz.maskToSlash());
			
			splitHosts(3,netz);
			
	
		}
		
	public static void splitHosts(int hosts, Netzwerk net){
		int x =1;
		Netzwerk netNew;
		int oldID=net.getNetID();
		int counter =0;
		
		do{
			
			counter = (int) (Math.pow(2, x)+2);
			x++;
		} while(counter<hosts);
	
		String newMask = 32-x+"";
		
		
		do{
			netNew=new Netzwerk(new IPAdresse(oldID),new IPAdresse(newMask));
			oldID =netNew.getBCInt()+1;
			System.out.println(netNew);
		} while(netNew.getBCInt() != net.getBCInt());
				
		
	}
	
	
	public static void splitNets(int nets, Netzwerk net){
		int x =0;
		Netzwerk netNew;
		int oldID=net.getNetID();
		int counter =0;
		
		while(counter<nets){
			x++;
			counter = (int) (Math.pow(2, x));
			
		}
	
		String newMask = net.maskToSlash()+x+"";
		
		
		for(int i=0;i<nets;i++){
			netNew=new Netzwerk(new IPAdresse(oldID),new IPAdresse(newMask));
			oldID =netNew.getBCInt()+1;
			System.out.println(netNew);
		} 
				
		
	}
}//end class
