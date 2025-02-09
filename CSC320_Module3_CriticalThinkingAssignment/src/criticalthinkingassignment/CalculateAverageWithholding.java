package criticalthinkingassignment;

import java.util.Scanner;

public class CalculateAverageWithholding {
	   public static void main(String[] args) {

		   float taxRate;
		   float weeklyWithholding;
		   float userIncome;
		   
	      System.out.print("Please input weekly income: ");
	      Scanner scnr = new Scanner(System.in);
	      userIncome = scnr.nextFloat();
	      
	      if (userIncome >= 2500)
	    	  taxRate = 0.30f;
	      
	      else if (userIncome >= 1500)
	    	  taxRate = 0.20f;
	      
	      else if (userIncome >= 500)
	    	  taxRate = 0.15f;
	      
	      else
	    	  taxRate = (float) 0.10;
	      
	      weeklyWithholding = userIncome * taxRate;
	      
	      System.out.print("Weekly witholding: $");
	      System.out.printf("%.2f", weeklyWithholding);

	      scnr.close();

      }
}