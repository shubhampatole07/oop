class Publication
{
private String title;
public int qty;
private double price;
private int copies;
public String gettitle()
{
return this.title;
}
public void settitle(String title) 
{
this.title=title;
}
public int getcopies() 
{
return this.copies;
} 
public void setcopies(int copies)
{
this.copies=copies;
}
public double getprice() 
{
return this.price;
}
public void setprice(double price) 
{
this.price=price; 
}
Public void sellcopy(int qty)
{
	System.out.println(“Total publication sale= ”+(qty*price));
}
Class Book extends Publication
{
Private String author;
Public int  ordercopies(int pcopies)
{
	Return pcopies;
}
Public void sellcopy(int qty)
{
	System.out.println(“Total ook  sale= ”+(qty* getprice()))’
}

}
Class Magazine extends Publication
{
	Private int orderqty;
	Private string currIssue;
	Public void recvIssue(String newIssue)
{
	Setcopies(orderqty);
	currIssue=newIssue;
}
Public void sellcopy(int qty)
{
	System.out.println(“Total Magazine  sale= ”+(qty*getprice()));
}

}
Class Polymorshism
{
	Public static void main(string args[])
	{
	Publication publication= new Publication();
	publication.setcopies(3);
	System.out.println(publication.getcopies());
	publication.setprice(20.3);
	System.out.println(publication.getprice());
	Publication.sellcopy(2);
	
	Book book1=new Book();
	Int copy=Book1.ordercopies(3);
	System.out.println(“total copies = ”+copy);

	Publication book2= new Book();
	Book2.setprice(10);
	Book2.sellcopy(copy);
	
	Publication magazine= new Magazine();
	Magazine.setprice(30);
	Magazine.sellcopy();
}
}
