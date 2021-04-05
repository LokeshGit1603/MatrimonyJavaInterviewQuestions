package javainterviewquestions;

public class Swaptwonumbers {

	public void thridvariable()
	{
		int mysalary = 200;
		int mytlsalary = 500;
		int temp;

		temp=mysalary;
		mysalary=mytlsalary;
		mytlsalary=temp;

		System.out.println("mysalary is "+mysalary);
		System.out.println("mytlsalary is "+mytlsalary);

	}

	public void withoutthridvariable()
	{
		int a = 10;
		int b = 20;

		a=a-b;
		b=a+b;
		a=b-a;

		/*
		 * a=a*b; b=a/b; a=a/b;
		 */

		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);

	}

	public static void main(String[] args) {

		Swaptwonumbers swap = new Swaptwonumbers();
		swap.thridvariable();
		swap.withoutthridvariable();


	}

}
