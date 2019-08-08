package com.methodoverload;

public class NewCalculator {
	
	
	
	public int  docal(int j,String operator)
	{
   
		int i=NewCalculatorDemo.num2;
		int result=0;
		switch (operator)  {
        case "+":
          //  System.out.println("Your answer is " + (i + j));
            result=i+j;
            break;
        case "-":
        	// System.out.println("Your answer is " + (i - j));
        	result=i-j;
            break;
        case "/":
        	// System.out.println("Your answer is " + (i / j));
        	result=i/j;
            break;
        case "*":
        	// System.out.println("Your answer is " + (i * j));
        	result=i*j;
            break;
        default:
            System.out.println("Enter valid input");

		
		
	}
		return result;
	}

}
