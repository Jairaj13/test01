package program_3a;

import java.util.Scanner;

public class day_3a_program {

	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, Percentage, Average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Five Subjects Marks : ");
		
		System.out.println("Enter English marks");
		
		english = sc.nextInt();	
		
		System.out.println("Enter chemistry marks");
		
		chemistry = sc.nextInt();	
		
		System.out.println("Enter computer marks");
		
		computers = sc.nextInt();	
		
		System.out.println("Enter physics marks");
		physics = sc.nextInt();	
		
		System.out.println("Enter Maths marks");
		
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	    
	    if(Percentage>=80) 
	    {
	    	System.out.println("You have pass with grade A");
	    }
	    else if( Percentage>=75)
	    {
	    	System.out.println("You have pass with grade B");
	    }
	    else if(Percentage>=60) 
	    {
	    	System.out.println("You have pass with grade C");
	    }
	    else if(Percentage>=45) 
	    {
	    	System.out.println("You have pass with grade D");
	    }
	    else if(Percentage<45) 
	    {
	    	System.out.println("You have fail try again");
	    }
	    
	    
	    
	}
	
}



