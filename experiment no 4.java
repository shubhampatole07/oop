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
