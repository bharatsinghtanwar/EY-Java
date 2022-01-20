package com.bharat.jan20;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		
		System.out.println(Math.abs(-234));
		System.out.println(Math.ceil(95.50));
		System.out.println(Math.floor(85.50));
		System.out.println(Math.round(23.61));
		System.out.println(Math.random()*(500-100)+100); //default - 0.0 to <1.0
		
		System.out.println(Math.max(12, 55));
		System.out.println(Math.min(12,32));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(25));

		System.out.println(Math.log(10));
		System.out.println(Math.log10(10));
		System.out.println(Math.subtractExact(59, 5)); //59-55
		System.out.println(Math.addExact(59, 5));
		System.out.println(Math.incrementExact(55));
		
		
		
		
		
		
		
		
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		
//		System.out.println(Integer.toBinaryString(20));
//		System.out.println(Integer.toOctalString(20));
//		System.out.println(Integer.toHexString(20));
//		System.out.println(Integer.min(34, 12));
//		System.out.println(Integer.max(32, 12));
//		System.out.println(Integer.compare(14,32));
		//min, min
		
		
		
		
		
		
		//buffer string
//		Scanner input = new Scanner(System.in);
//		StringBuffer buffer = new StringBuffer();
		
//		System.out.println(buffer.capacity());
//		buffer.append("Java Complete Reference");
//		System.out.println(buffer);
//		buffer.insert(5, "JDK 11 ");
//		System.out.println(buffer);
//		buffer.delete(5,12);
//		System.out.println(buffer);
//		buffer.deleteCharAt(2);
//		System.out.println(buffer);
//		
//		buffer.reverse();
//		System.out.println(buffer);
		
		
//		System.out.println("Email");
//		String email = input.nextLine();
//		boolean result=email.matches("[A-Za-z][A-Za-z.0-9]{5,25}[@][A-Za-z]{3,5}[.](com|in)"); //com. in
//		if(result) {
//			System.out.println("Valid");
//			
//		}
//		else {
//			System.out.println("Invalid");
//		}
//		System.out.println("Enter employee Details in the below format");
//		System.out.println("id,name,email, mobile, temp, date"); // id-0, name-1... date - 5
//		String details[] = input.nextLine().split(",");
//		System.out.println(details.length);
//		input.close();
//		
//		Employee emp = new Employee(Integer.parseInt(details[0]), details[1], details[2], Long.parseLong(details[3]), Float.parseFloat(details[4]), details[5]);
//		
//		System.out.println(emp); // toString();
		
		
		
		
		
		
		
		
		
		
		
//		
//		String game1 = "cricket";
//		String game2 = "cricket";
//		
//		System.out.println(game1.equals(game2));
//		System.out.println(game1==game2);
//		
//		String game3 = new String("cricket");
//		System.out.println(game1==game3);
//		String ref = "         Java Complete Reference     "; 
		
		//format
//		String result = String.format("%-10s%s", "String", "Handling"); // printf(,), format(,), 10 whilte spaces in between/
//		System.out.println(result);
		
		// 5 stubject = Java * C * C++ * Python * Android
//		String arr[] = {"java", "C", "C++", "Python", "Android"};
//		System.out.println(String.join(" * ", arr));
		
		
		
		//trim - omit whitespaces
//		System.out.println("Before Trim: "+ref.length() + " "+ref);
//		System.out.println("After Trim: "+ref.trim().length()+" "+ref.trim()); // remove white spaces in beginning and nding.
		
		
		//String to char
//		char c[] = ref.toLowerCase().toCharArray();
//		Arrays.sort(c);
//		System.out.println(Arrays.toString(c));
//		System.out.println(String.valueOf(c));
		
		//substring
//		System.out.println(ref.substring(5));
//		System.out.println(ref.substring(5,13));
//		System.out.println(ref.subSequence(5, 13));
//		System.out.println(ref.toUpperCase()); // login - RHS
		//index
//		System.out.println(ref.indexOf('e'));
//		System.out.println(ref.lastIndexOf('e'));
//		System.out.println(ref.indexOf("ef"));
//		System.out.println(ref.lastIndexOf("ef"));
//		
//		String ref2 ="Complete";
//		System.out.println(ref.regionMatches(9, ref2, 4, 4));
//		System.out.println(ref.replaceAll("ete", "EYEYEY"));
				
		
		
	}
}
