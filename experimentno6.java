import java.util.Scanner;
class Exception
{
	public static void main(String args[])
	{
		int num1, num2;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter First number");
			num1=Integer.parseInt(sc.next());
			System.out.println("Enter Second number");
			num2=Integer.parseInt(sc.next());

			System.out.println("Division= "+(num1/num2));
		}
		catch(NumberFormatException ne)
		{
			System.out.println("number should be numeric value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Num2 should not be zero");
		}
		
		int arr[]={10,20,30};
		System.out.println(arr[0]);
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
		
		String str=null;
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String should not br null");
		}
	}
}
