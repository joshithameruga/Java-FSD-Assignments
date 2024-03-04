package abstraction;

import java.util.Scanner;

public class Atm {
	
          public static void main(String[] args) {
	          
        	  Bank service = new BankImpl();
        	  boolean flag=true;
        	  Scanner sc= new Scanner(System.in);
        	  
        	  while(flag) {
        	  System.out.println("welcome to atm");
        	  System.out.println("choose a option");
        	  System.out.println("1.withdraw\n2.deposit\n3.exit");
        	  
        	  int choice =sc.nextInt();
        	  
        		  switch(choice) {
        		  case 1:
        			  service.withDraw();
        			  break;
        		  case 2:
        			  service.deposit();
        			  break;
        		  case 3:
        			  flag=false;
        			  System.out.println("exiting....! thank you");
        			  break;
        		 default:
        			 break;
        		  }
        	  }
        	  
        	
        	  
}
          
          
}
