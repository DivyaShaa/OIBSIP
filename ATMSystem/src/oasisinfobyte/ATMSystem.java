package oasisinfobyte;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.*;

public class ATMSystem {
		
		    static  void register(){
		        Scanner sc=new Scanner(System.in);
		        System.out.println("---------------------------");
		        System.out.println("Enter your name :");
		        ATM.name=sc.nextLine();
		        System.out.println("Enter username :");
		        String user=sc.nextLine();
		        System.out.println("Enter password :");
		        String pass=sc.nextLine();
		        System.out.println("Enter your Account number :");
		        ATM.accnumber=sc.nextLine();
		        System.out.println("REGISTRATION SUCCESSFULL!");
		        System.out.println("---------------------------");
		        ATM.prompt();
		        while(true){
		            display(ATM.name);
		            int choice=sc.nextInt();
		            if(choice==1){
		                login(user,pass);
		                break;
		            }
		            else {
		                if(choice==2){
		                    System.exit(0);
		                }
		                else{
		                    System.out.println("Bad value! Enter again!");
		                }
		            }
		        }
		    }
		    static void display(String name){}
		    static void login(String user,String pass){}
		    static void withdraw(){
		        Scanner sc=new Scanner(System.in);
		        System.out.println("----------------");
		        System.out.println("Enter amount to withdraw :");
		        int wcash=sc.nextInt();
		        if(wcash<=ATM.balance){
		            ATM.balance=ATM.balance-wcash;
		            ATM.history.add(Integer.toString(wcash));
		            ATM.history.add("Withdraw");
		            System.out.println("Amount Rs"+wcash+"/-withdraw successfully");
		            System.out.println("---------------------------");
		        }
		        else{
		            System.out.println("insufficient balance to withdraw the cash");
		            System.out.println("---------------------------");
		        }
		        ATM.prompt();
		    }
}
	

