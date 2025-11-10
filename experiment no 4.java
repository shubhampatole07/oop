Import java.util.*;
Abstract class Shape
{
	Abstract public void compute_area(double a, double b);
	Public void calculate_area()
{
}
}
Class triangle extends Shape
{
	Public double base;
	Public double height;
	Abstract public void compute_area(double a, double b)
{
	This.base=a;
	This.height=b;
}
Public void calculate_area()
{
	System.out.println(“Area of Triangle= ”+(0.5*base*height));
}

}
Class rectangle extends Shape
{
Public double length;
	Public double breadth;
	Abstract public void compute_area(double a, double b)
{
	This.lenght=a;
	This.breadth=b;
}
Public void calculate_area()
{
	System.out.println(“Area of Rectangle= ”+(length*breadth));
}

}
Class Abstract
{
	Public static void main(String args[])
	{
		Double base,height;
		Double length,breadth;
		Shape obj1 = new Triangle();
		Scanner sc =new Scanner (System.in);
System.out.println(“Enter base Value”);
		Base=sc.nextDouble();
System.out.println(“Enter Height Value”);
		height=sc.nextDouble();
		obj1. compute_area(base,height);
		obj1. calculate_area();

		Shape obj2 = new Rectangle();
		System.out.println(“Enter lenght Value”);
		lenght=sc.nextDouble();
System.out.println(“Enter breadth Value”);
		breadth=sc.nextDouble();
		obj2. compute_area(length, brteadth);
		obj2. calculate_area();

}
}


/* Steps : 
1. Start 
2. Create an abstract class named shape that contains two double type numbers and an empty method named compute_area(). 
3. Provide two classes named rectangle and triangle such that each one of the classes extends the class Shape. 
4. Each of the inherited class from shape class should provide the implementation for the method compute_area(). 
5. Get the input and calculate the area of rectangle and triangle. 
6. In the fourth separate class, create the objects for the two inherited classes and invoke the methods and display the area values of the different shapes. 
7. Stop.  
*/
