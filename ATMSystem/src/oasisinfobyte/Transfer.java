package oasisinfobyte;

import java.util.Scanner;

public class Transfer {
	public  static void transfer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the receiving body:");
        String s=sc.nextLine();
        System.out.println("Enter the account number of the receiving body");
        int num=sc.nextInt();
        System.out.println("Enter the amount to be transferred :");
        int tcash=sc.nextInt();
        if(tcash<=ATM.balance){
            ATM.balance=ATM.balance-tcash;
            ATM.history.add(Integer.toString(tcash));
            ATM.history.add("transferred");
            System.out.println("Amount Rs."+tcash+"/- transferred successfully");
            System.out.println("---------------------------");
        }
        else{
            System.out.println("insufficient balance to transfer the cash");
            System.out.println("---------------------------");
        }
    }
}
	

