package com.methodoverload1;

import java.util.Scanner;

public class NewCalculator {
	
	
	
	public double  docal(int j,String operator)
	{
    
		double n1, n2,result=0;
        String operation;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        n1 = in. nextDouble();
        System.out.println("Enter second number");
        n2 = in. nextDouble();
        System.out.println("Enter your operation");
        operation = in.next();
        switch (operator)  {
        case "+":
           // System.out.println("Your answer is " + (n1 + n2));
            result=n1 + n2;
            
            break;
        case "-":
        	 System.out.println("Your answer is " + (n1 - n2));
        	result=n1 - n2;
            break;
        case "/":
        	 System.out.println("Your answer is " + (n1 / n2));
        	result=n1 / n2;
            break;
        case "*":
        	 System.out.println("Your answer is " + (n1 * n2));
        	result=n1 * n2;
            break;
        default:
            System.out.println("Enter valid input");

        }

		
		
	
		return result;
	}
	}


