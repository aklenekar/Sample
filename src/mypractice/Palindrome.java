package mypractice;

public class Palindrome {

	public static void main(String[] args) {
		
		int a;
		int b=0;
		
		int c=101;
		
		int temp;
		temp=c;
		
		while(c>0)
		{
			a=c%10;
			b = (b*10)+a;
			c=c/10;
			
		}
		if(temp==b)
		{
			System.out.println("No is Palindrome");
			
		}else
		{
			System.out.println("No is not palindrome");
		}
	}

}
