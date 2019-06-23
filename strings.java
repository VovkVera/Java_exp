package capability.org.ua;

import java.util.*;

//import java.util.stream.IntStream;

public class helloWorld {

	
	static Scanner sc = new Scanner(System.in);
	
	final double SHORTPI = 3.14;
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println("Byte Max: " + Byte.MAX_VALUE);
		System.out.println("float Max: " + Float.MAX_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);
		System.out.println("Long Max: " + Long.MAX_VALUE);
		System.out.println("Integer Max: " + Integer.MAX_VALUE);

		
		float fNum = (float) 1.11111111111111111111;
		float fNum2 = (float) 1.11111111111111111111;
		
		System.out.println(" float sum = "+ (fNum +fNum2));
		
		double db =  1.11111111111111111111;
		double db2 = 1.11111111111111111111;
		
		System.out.println(" float db = "+ (db +db2));
		////
		String favNum = Double.toString(1.467453);
		System.out.println(" Double.toString(1.467453): " +  favNum);
		
		//System.out.println(strInt);
		///
		System.out.println("5 + 4 = "+ (5+4)); 
		System.out.println("5 - 4 = "+ (5-4)); 
		System.out.println("5 * 4 = "+ (5*4)); 
		System.out.println("6 / 4 = "+ (6/4)); 
		System.out.println("6 % 4 = "+ (6%4)); 
		
		System.out.println("-------"); 
		
		System.out.println("5 / 4 = "+ (5/4)); 
		System.out.println("5 / 4 ="+ (5.0/4.0)); 

		int strInt = Integer.parseInt("10");
		
		System.out.println("10++ = "+ (strInt++)); 
		System.out.println("then ++10 = "+ (++strInt)); 
		System.out.println("then 10 +=10   = "+ (strInt+=10)); 
		
		System.out.println("-------------------"); 
		
		System.out.println("Math.PI = "+ Math.PI); 
		System.out.println("Math.max(int) = "+ Math.max(10, 12)); 
		//////
		int minNum = 5;
		int maxNum = 20;
		
		int randNum = minNum +(int)(Math.random()*
				((maxNum-minNum)+1));
		System.out.println("random from 5 to 20  = "+ randNum); 
		///////
		String name = "Vera";
		String wName = name + " "+ "Vovk";
		
		System.out.println(wName); 
		wName+= " is my name";
		
		System.out.println(wName); 
		System.out.println(wName.charAt(0)); 
		System.out.println(wName.contains("V"));
		System.out.println(wName.indexOf("Vovk")); 
		System.out.println(wName.length()); 
		System.out.println("dog equals cat : "+ ("dog".equals("cat"))); 
	    System.out.println("Vera equals VERA : "+ ("Vera".equalsIgnoreCase("VERA")));
		System.out.println(wName.compareTo("ABC"));
		
		System.out.println(wName.replace("Vera", "Vira"));
		
		System.out.println(wName.substring(0,5));

		System.out.println("-------------------"); 
		
		for(String x:wName.split(" "))
			System.out.println(x);

		System.out.println(wName.toLowerCase()); 
		System.out.println(wName.toUpperCase()); 
		
		
		
		StringBuilder sb = new StringBuilder("I'm a string builder");
		
		System.out.println(sb.length()); 
		System.out.println(sb.capacity());
		sb.append(" Yeah");
		System.out.println(sb);
		System.out.println(sb.insert(6, "Big "));
		
		
		
		
	
	}

}
 
