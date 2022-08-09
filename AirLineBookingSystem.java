package com.project;

import java.time.LocalDate;
import java.util.Scanner;

public class AirLineBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = ' ';
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO AIRLINE RESERVATION!");
        System.out.println(" ");
        
        
        do {
    	  System.out.println("------------------------------- ");
    	  System.out.println("Choose an option! ");
    	  System.out.println("------------------------------- ");
    	  option = sc.next().charAt(0); 
    	  System.out.println(" ");
    	  
    	  
    	  
    	  switch(option) {
    	  case '1' :
    		  System.out.println("Enter your starting location: ");
              String s1 = sc.next();
              System.out.println("Enter your destination: ");
              String s2 = sc.next();
    		  break;
    	  case '2' :
    		  System.out.println("Enter your Departure Date:  ");
              LocalDate date1 = LocalDate.parse("2022-08-09");
              System.out.println(date1);
              System.out.println("Enter your Return Date: ");
              LocalDate date2 = LocalDate.parse("2022-08-12");
              System.out.println(date2);
    		  /*System.out.println("Enter date: ");
    		  String date_string = "23-05-2022";
    		  String depdate=sc.nextLine();
    		         //Instantiating the SimpleDateFormat class
    		         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
    		         //Parsing the given String to Date object
    		         Date date = formatter.parse(date_string);      
    		         System.out.println("Date value: "+date);*/
    		  break;
    	  case '3' :
    		   System.out.println("Select number of children: ");
    		   String c = sc.next();
               System.out.println("Select number of adults: ");
               String a = sc.next();
               System.out.println("Please make the payment of $100... ");
               int p = sc.nextInt(); 
    		  break;
    	  case '4' :
    		  System.out.println("Click on Book Your Flight..");
    	      System.out.println("Your flight is Booked!");
    	      System.out.println("Thank You and Happy Journey!");
    		  break;
    	  case '5' :
    		  System.out.println("Select---> OneWay Trip Or Return Trip: ");
    		  break;
    		  default:
    			  System.out.println("Invalid option! ");
    			  break;
    			  }
      }
      while(option!=0);
	}
     }


