package javainterviewquestions;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the String");
		
Scanner scanner = new Scanner(System.in);

String strname = scanner.next();
		
		char[] chararray = strname.toCharArray();
		
		int length = 0;
		
		for (char c : chararray) {
			
			length++;
			
		}
		System.out.println(length);
	}

}
