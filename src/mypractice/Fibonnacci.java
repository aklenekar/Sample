package mypractice;

public class Fibonnacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int d, count =10;
		
		System.out.println(+a);
		System.out.println(+b);
		
		for(int i=0;i<count;i++)
		{
					
			d = a+b;
			System.out.println(+d);
			a=b;
			b=d;
						
			
		}

	}

}
