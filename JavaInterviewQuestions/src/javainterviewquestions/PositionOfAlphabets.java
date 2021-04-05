package javainterviewquestions;

import java.util.Scanner;

public class PositionOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your alphabet");
		
		char givenchar =  scanner.next().charAt(0);
		
		givenchar = Character.toLowerCase(givenchar);
		
		int asciivalue = (int) givenchar;
		
		System.out.println(asciivalue);
		
		int position = asciivalue-96;
		
		System.out.println(position);

	}

}
