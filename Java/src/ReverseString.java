/*
 * ReverseString.java
 * 
 * This program reverses the words in a string
 */
public class ReverseString
{
	private static String sentence = "The quick brown fox jumped over the lazy dog.";
	
	public static void main(String[] args) {
		System.out.println(sentence);
		String[] arr = sentence.split(" ");
		sentence = "";
		for(int i = (arr.length-1); i >= 0; --i )
		{
			sentence += arr[i] + " ";
		}
		System.out.println(sentence);
	}
}
