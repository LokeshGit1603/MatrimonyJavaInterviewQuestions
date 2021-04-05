package javainterviewquestions;

import java.util.Scanner;

public class PrintTrianglePattern {
	
	public void starprint()
	{
		
	System.out.println("Enter the number of star execution");
		
		Scanner scanner = new Scanner(System.in);
		
		int numberofline = scanner.nextInt();
		
		int row = 0;
		int column = 0;
		
		for(row=0;row<=numberofline-1;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void numprint()
	{
		
		System.out.println("Enter the number of number execution");
		
		Scanner scanner = new Scanner(System.in);
		
		int numberofline = scanner.nextInt();
		
		int start=1;
		
		int row=0;
		int column=0;
		
		for(row=0;row<=numberofline-1;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(start+" ");
				start=start+1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PrintTrianglePattern print = new PrintTrianglePattern();
		print.starprint();
		print.numprint();
		

	}

}
