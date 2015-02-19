package Subnetting;

import java.util.Scanner;

public class SubnetMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Netzwerk netz = new Netzwerk(new IPAdresse("192.168.2.3"),"24");
		System.out.println("IP: " + netz.getIp());
		System.out.println("Netz: "+netz);
		System.out.println(netz.maskToSlash());
		splitHosts(200,netz);
		

	}
	
public static void splitHosts(int hosts, Netzwerk net){
	int x =1;
	Netzwerk netNew;
	int oldID=net.getNetID();
	int counter =0;
	while(counter<hosts){
		x++;
		counter = (int) (Math.pow(2, x)+2);
		
	}
//	String newMask=(net.maskToSlash()+x)+"";
	String newMask = 32-x+"";
	
	do{
		netNew=new Netzwerk(new IPAdresse(oldID),newMask);
		oldID =netNew.getBCInt()+1;
		System.out.println(netNew);
	} while(netNew.getBCInt() != net.getBCInt());
			
	
}
}
