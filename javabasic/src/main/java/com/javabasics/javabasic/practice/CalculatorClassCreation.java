package com.javabasics.javabasic.practice;
import java.util.Scanner;
public class CalculatorClassCreation {
  public static void main(String[] args)
Scanner scan = new Scanner(System.in);
		System.out.println(" enter your choice");
		String abc = scan.nextLine();
		System.out.println("enter the numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		
		switch(abc)
		{
		case  "+" :
			int sum = a+b;
			System.out.println(sum);
			break;
			
		case  "-" :
			int diff = a-b;
			System.out.println(diff);
			break;
			
		case  "*" :
			int multiply = a*b;
			System.out.println(multiply);
			break;
			
		case  "/" :
			int divide = a/b;
			System.out.println(divide);
			break;
			
			default :
				System.out.println("invalid");
			
			
			
			
			
			
		}
	
		
		
	}

}

}
