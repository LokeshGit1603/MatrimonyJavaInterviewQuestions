package javainterviewquestions;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givennumber = 0;
		int reversed = 0;
		
		System.out.println("Please Enter the number to reverse");
		
		Scanner scanner = new Scanner(System.in);
		
		givennumber=scanner.nextInt();
		
		while(givennumber!=0) {
		
		reversed = reversed*10;
		reversed=reversed+givennumber%10;
		givennumber=givennumber/10;
		
		
		}
		System.out.println(reversed);
	}

}
