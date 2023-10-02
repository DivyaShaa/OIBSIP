package play_number;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Play_number {
	
		public static void main(String[] args) throws Exception {
		     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		     Random  random =  new Random();
		     int value=random.nextInt(100);
		     System.out.println("Random number is "+value);
		     int count = 0;
		     for(int i=0;i<10;i++) {
		    	 String choice = "yes";
		    	 while(choice.equals("yes")) {
		    		 System.out.println("Range for guessing the number is between (0 to 100)");
		    		 int num=Integer.parseInt(reader.readLine());
		    		 count++;
		    		 if(num>=101){
		    			 System.out.println("Wrong Input");
		    			 break;
		    		 }
		    		 else if(value>num) {
		    			 System.out.println("Please guess little higher!");
		    			 break;
		    		 }
		    		 else if(value<num) {
		    			 System.out.println("Please guess little lower!");
		    			 break;
		    		 }
		    		 if(value==num) {
		    			 System.out.println("Congratulations you guessed the correct number");
		    			 System.out.println("You guessed in " + count + " tries");
		    			 System.out.println("Do you want to play again(Yes/No)");
		    			 choice=reader.readLine().toLowerCase();
		    			 if(choice.equals("no")) {
		    				 i=10;
		    				 break;
		    			 }
		    	   while(!choice.equals("yes")) {
		    		   System.out.println("Enter the correct input(yes/no)");
		    		   choice=reader.readLine().toLowerCase();
		    	   }
		    	   value=random.nextInt(101);
		    	   System.out.println(value);
		    		 }
		    	 }
		    	 
		     }
		    		 

		}

	}
	

