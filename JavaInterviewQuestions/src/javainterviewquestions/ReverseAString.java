package javainterviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

	public void bystringbuffer()
	{
		String given = "Lokesh";

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(given);
		
		System.out.println(stringBuffer.reverse());

	}
	
	public void byownlogic()
	{
		String given = "Arun";

		char[] charray = given.toCharArray();

		String reversed = "";

		for(int i=charray.length-1;i>=0;i--)
		{
			reversed=reversed+charray[i];
		}

		System.out.println(reversed);
	}

	public void bycollections()
	{

		String given = "Ramprasath";
		
		char[] array = given.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : array) {
		list.add(character);	
		}
		
		Collections.reverse(list);
		
		ListIterator<Character> iterator = list.listIterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}
	public static void main(String[] args) {

		ReverseAString buffer = new ReverseAString();
		buffer.bystringbuffer();
		buffer.byownlogic();
		buffer.bycollections();
		
	}

}
