package stringEx;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		System.out.println("Please enter some text");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] letters = input.toCharArray();
		
		int Count = 0;
		
		for(char c : letters) {
			switch (c) {
			case 'a':
			
			case 'e':
			
			case 'i':

			case 'o':

			case 'u':
				
				Count++;
				

				break;
				default:
				
				//No count increment.
			}
		}
		
		System.out.println("Number of vowels in String[" + input + "] is : " + Count);
	}
}
