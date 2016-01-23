package edu.cmu.ds.lab0;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lis = Integer.parseInt(in.nextLine());
		(new Thread(new Listener(lis))).start();
		
	    System.out.print("Please enter sender's des port: ");
	    int port = Integer.parseInt(in.nextLine());
		(new Thread(new Sender(port))).start();
	}
}
