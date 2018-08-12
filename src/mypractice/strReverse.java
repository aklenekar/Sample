package mypractice;

import java.util.Scanner;

public class strReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the string you want to reverse:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String reverse = "";
		
		int len= str.length();
		for(int i= len-1; i>=0; i--)
		{
			reverse = reverse+str.charAt(i);
			
		}
		
		System.out.println("Reverse of string is: "+ reverse);
	

	}

}
