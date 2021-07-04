package com.generic;

public class Exceptionpractice {
	
	static int b =10;
	static int c=15;
	
public static void main(String[] args)  {
	
	
	Exceptionpractice.getExceptions();

	}
	public static void getExceptions()  {
		System.out.println(b);
		
			
		
		
		try {
			//Thread.sleep(5000);
			System.out.println(10/0);
			System.out.println(20/0);
		} catch (ArithmeticException e) {
			 
			e.printStackTrace();
		}catch(Exception g) {
			
			
		}
	finally {
			
		System.out.println(c);
		System.out.println("bye");
		System.out.println("how are you all");
		System.exit(0);
		System.out.println("hello all");
	}
	
	
		
	}
}
///runtime exceptions or unchecked exceptions 
	





	 
