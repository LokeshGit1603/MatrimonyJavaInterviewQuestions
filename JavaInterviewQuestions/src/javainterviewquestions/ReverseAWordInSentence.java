package javainterviewquestions;

public class ReverseAWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given = "Hello Man I'm Fine";
		
		String Reversed="";
		
		String[] splitted = given.split(" ");
		
		System.out.println(splitted.length);
		
		for(int i=splitted.length-1;i>=0;i--)
		{
			Reversed = Reversed+splitted[i]+" ";
			
		}
		
		System.out.println(Reversed);


	}

}
