package javainterviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumInArray {

	Integer givenArray[] = {91,61,81};

	public void findsmall()
	{
		int smallest = Integer.MAX_VALUE;

		for(int i=0;i<givenArray.length;i++)
		{
			if(givenArray[i]<smallest)
			{
				smallest = givenArray[i];
			}
		}
		System.out.println(smallest);

	}

	public void usingArrays()
	{
		Arrays.sort(givenArray);

		System.out.println(givenArray[0]);
	}

	public void usingCollections()
	{

		List<Integer> list = Arrays.asList(givenArray);
		Collections.sort(list);
		Integer small = list.get(0);
		System.out.println(small);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallestNumInArray smallnum = new SmallestNumInArray();
		/* smallnum.findsmall(); */
		/* smallnum.usingArrays(); */
		smallnum.usingCollections();
	}

}
