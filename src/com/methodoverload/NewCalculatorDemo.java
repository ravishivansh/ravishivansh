package com.methodoverload;

public class NewCalculatorDemo {
	
	
	 static  int num2=0;
	public static void main(String[] args) {
		
		
		
		num2=Integer.parseInt(args[0]);
		//num2=Double.parseDouble(args[0]);
		
		/*Scanner num2 = new Scanner(System.in);
        System.out.println("Enter first number");
        n1 = num2. nextDouble();
*/
		
		//NewCalculatorDemo ND=new NewCalculatorDemo();
		
		NewCalculator calculator=new NewCalculator();
		int result1=calculator.docal(3,"+");
		System.out.println("Addition of Two Numbers-->"+num2+"+"+"3"+" is "+(result1));
		               
		int result2=calculator.docal(1,"-");
		
		System.out.println("Substraction of Two Numbers-->"+num2+"-"+"1"+" is "+(result2));
		
        int result3=calculator.docal(3,"*");
        
        System.out.println("Multiplication of Two Numbers-->"+num2+"*"+"3"+" is "+(result3));
        
        int result4=calculator.docal(4,"/");
        System.out.println("Division of Two Numbers(Rounded value)-->"+num2+"/"+"4"+" is "+(result4));
		
      int  result=result1+result2+result3+result4;
      
    //  System.out.println("Overall value of Computation is "+(result));

    		   
		
		
	}

}
