package oasisinfobyte;

import java.util.Scanner;

public class Deposit {
	
	   static void deposit(){
		   Scanner sc=new Scanner(System.in);
	        System.out.println("----------------");
	        System.out.print("Enter amount to deposit :");
	        int dcash=sc.nextInt();
	        ATM.updatebalance(dcash);
	        ATM.history.add(Integer.toString(dcash));
	        ATM.history.add("Deposit");
	        System.out.println("Amount Rs."+dcash+"/- deposit successful!");
	        System.out.println("---------------------------");
	        ATM.prompt();
	    }

}
