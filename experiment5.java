interface Vehicles
{
	public void speedUp(int a);
	public void gearChange(int a);
	public void applyBreak();
}
class Bicycle implements Vehicles
{
	private int speed;
	int gear;
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void speedUp(int increament)
	{
		this.speed=this.speed+increament;
	}
	public void gearChange(int change)
	{
		this.gear=change;
	}	

	public void applyBreak()
	{
		this.speed=this.speed-this.speed;
		this.gear=0;
	}
	public void display()
	{
		System.out.println("Bicycle information");
		System.out.println("Speed of Bicycle = "+this.speed);
		System.out.println("Gear of Bicycle= "+ this.gear);
	}
}
class Car implements Vehicles
{
	private int speed;
	int gear;
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void speedUp(int increament)
	{
		this.speed=this.speed+increament;
	}
	public void gearChange(int change)
	{
		this.gear=change;
	}	

	public void applyBreak()
	{
		this.speed=this.speed-this.speed;
		this.gear=0;
	}
	public void display()
	{
		System.out.println("Car information");
		System.out.println("Speed of Car = "+this.speed);
		System.out.println("Gear of Car= "+ this.gear);
	}
}
class Bike implements Vehicles
{
	private int speed;
	int gear;
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void speedUp(int increament)
	{
		this.speed=this.speed+increament;
	}
	public void gearChange(int change)
	{
		this.gear=change;
	}	

	public void applyBreak()
	{
		this.speed=this.speed-this.speed;
		this.gear=0;
	}
	public void display()
	{
		System.out.println("Bike information");
		System.out.println("Speed of Bike = "+this.speed);
		System.out.println("Gear of Bike= "+ this.gear);
	}
}
public class Inerface
{
	public static void main(String args[])
	{
		Bicycle by=new Bicycle ();
		System.out.println("Initial speed "+(by.getSpeed()));
		by.setSpeed(20);
		by.speedUp(5);
		by.gearChange(4);
		by.display();
		System.out.println("After applying breaks");
		by.applyBreak();
		by.display();
		
		System.out.println("");
		Car car=new Car();
		System.out.println("Initial speed "+(car.getSpeed()));
		car.setSpeed(60);
		car.speedUp(20);
		car.gearChange(5);
		car.display();
		System.out.println("After applying breaks");
		car.applyBreak();
		car.display();

		System.out.println("");
		Bike bike=new Bike ();
		System.out.println("Initial speed "+(bike.getSpeed()));
		bike.setSpeed(30);
		bike.speedUp(30);
		bike.gearChange(3);
		bike.display();
		System.out.println("After applying breaks");
		bike.applyBreak();
		bike.display();
	}
}
