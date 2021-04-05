package javainterviewquestions;

import java.util.stream.IntStream;

public class FindElementsInArray {	
	
	int[] array = {1,4,7,3,8,6};
	
	int tofind = 7;
	
	boolean found=false;		
	
	public void arraycontainselementornot()
	{

		for (int i : array) {
			if(i==tofind)
			{
				found=true;
			}
			
		}
		
		if(found=true)
		{
			System.out.println("Element Present");
		}
		else
		{
			System.out.println("Element Not Present");
		}
	}

	public void usingIntStream()
	{
		boolean found = IntStream.of(array).anyMatch(element->element==tofind);
		
		if(found)
			System.out.println("Got it");
		else
		System.out.println("Not Got");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsInArray findElementsInArray = new FindElementsInArray();
		/* findElementsInArray.arraycontainselementornot(); */
		findElementsInArray.usingIntStream();
		
		
		

	}

}
