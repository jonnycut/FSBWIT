package Subnetting;

import java.util.Scanner;

public class SubnetMain {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Netzwerk netz = new Netzwerk(new IPAdresse(192,168,2,1),new IPAdresse(255,255,255,0));
			System.out.println("IP: " + netz.getIp());
			System.out.println("Netz: "+netz);
			System.out.println(netz.maskToSlash());
			
			splitHosts(15,netz);
			
	
		}
		
	public static void splitHosts(int hosts, Netzwerk net){
		
		int x =1;
		int anzahl =0;
		Netzwerk netNew;
		int oldID=net.getNetID();
		int counter =1;
		if(hosts==0){
			System.out.println("Das Netz kann nicht für 0 Hosts geteilt werden");
			return;
		}

		
			while(counter<(hosts+2)){
				x++;
				counter = (int) (Math.pow(2, x));
				
			}
	
	
		String newMask = 32-x+"";
		
		
		do{
			
			netNew=new Netzwerk(new IPAdresse(oldID),new IPAdresse(newMask));
			if(netNew.getMask().getIpAdd()<net.getMask().getIpAdd()){
				System.out.println("Das Ausgangsnetz kann nicht in Netze für "+ hosts+" Hosts unterteilt werden");
				System.out.println("Nutzen Sie das Netz:");
				System.out.println(net);
				return;
			}
			oldID =netNew.getBCInt()+1;
			System.out.println(netNew);
			anzahl++;
		} while(netNew.getBCInt() != net.getBCInt());
		System.out.println("Das Netz wurde in "+anzahl+" neue Netze mit jeweils " +netNew.getMaxHosts()+" Hosts unterteilt.");
				
		
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
