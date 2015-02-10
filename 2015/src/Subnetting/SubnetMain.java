package Subnetting;

import java.util.Scanner;

public class SubnetMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IPAdresse ip = new IPAdresse(s.nextLong());
		System.out.println(ip);

	}

}
