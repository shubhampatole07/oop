import java.util.*;
public class Generic
{
	static int count=0;

	static void check_palindrome (String x) 
	{ 
		StringBuilder s1=new StringBuilder(x);
		if(x.equals(s1.reverse().toString())) 
		{
			System.out.println(x + " is a palindrome");
			count+=1;

		}
		else 
		{
			System.out.println(x+" is not a palindrome");
		}
	 }

	static void string_op() 
	{
		int n;
		String word;
		ArrayList<String> words=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) 
		{
			word=sc.next();
			words.add(word);
		}
		count=0;
		for(String w:words)
		{
			check_palindrome(w);
		}
		System.out.println("the no of palindrome is= "+count);
	}
	static void even_odd(int x)
	{	
		if(x%2==0)
		{
			System.out.println(x+ " is even number");
		}
		else
		{
			System.out.println(x+ " is odd number");
		}
	}
	static void prime(int x)
	{
		boolean flag=false;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(x+ " is prime number");
			count+=1;
		}
		else
		{
			System.out.println(x+ " is not prime number");
		}

	}
	static void check(int ch , int x)
	{
		switch(ch)
		{
			case 1:even_odd(x);
			break;
			case 2: prime(x);
			break;
		}
	}
	static void number_op()
	{
		int elements,n,choice;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nums=new ArrayList<Integer>();
		System.out.println("Enter the no. of elements");
		n=sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			elements=sc.nextInt();
			nums.add(elements);
		}
		System.out.println("enter your Choice");
		System.out.println("1 even/odd, 2 Prime or not");
		choice=sc.nextInt();
		Iterator itr=nums.iterator();
		count=0;
		while(itr.hasNext())
		{
			check(choice,(int)itr.next());
		}
		if(choice==1)
		{
			System.out.println(" total even number is "+count);
			System.out.println(" total odd number is "+(nums.size()-count));
		}
		else
		{
			System.out.println(" total prime number is "+count);
			System.out.println(" total non prime number is "+(nums.size()-count));
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Type");
		System.out.println("1. String, 2. Integer, ");
		int ch=sc.nextInt();
		if(ch==1)
		{
			string_op();
		}
		else
		{
			number_op();
		}
	}
}
