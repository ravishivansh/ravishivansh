package com.staticexample;

public class Operation{  
	 int data=50;  
	  static int data11=12;
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 System.out.println(data);
	 System.out.println(data11);
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  