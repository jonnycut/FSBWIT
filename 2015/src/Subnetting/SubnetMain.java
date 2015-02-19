package Subnetting;

import java.util.Scanner;

public class SubnetMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Netzwerk netz = new Netzwerk(new IPAdresse("192.168.2.3"),"1");
		System.out.println("IP: " + netz.getIp());
		System.out.println("Netz: "+netz);
		System.out.println(netz.getBC());
		

	}

}
