Class Employee
{
	Protected String Emp_Name;
	Protected String Emp_Address;
	Protected String Emp_Email;
	Protected int Emp_id;
	Protected long Emp_mob;
	
Public void emp_info(String emp_name, String emp_address, String emp_email , int emp_id, long emp_mob)
{
	Emp_name=emp_name;
	Emp_Address=emp_address;
	Emp_Email=emp_email;
	Emp_id=emp_id;
	Emp_mob=emp_mob;
}
Public void display()
{
}
Public void grossSalary()
{
}
Public void netSalary()
{
}
}
Class Programmer extends Employee
{
	Private double bp;
	Public double getbp()
{
	Return this.bp;
}
Public void setbp(double bp)
{
	This.bp=bp;
}
Public void display()
{
	System.out.println(“Programmer info ”);
	System.out.println(“Name= ”+Emp_Name);
	System.out.println(“Address= ”+Emp_Address);
	System.out.println(“Email id= ”+Emp_Email);
System.out.println(“Employee Id = ”+Emp_id);
System.out.println(“Mobile No= ”+ Emp_mob);
}
Public void grossSalary()
{
	System.out.println(“Gross Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100));
}
Public void netSalary()
{
	System.out.println(“net Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100+getbp()*0.1/100));
}
}
Class TeamLead
{
	Private double bp;
	Public double getbp()
{
	Return this.bp;
}
Public void setbp(double bp)
{
	This.bp=bp;
}
Public void display()
{
	System.out.println(“Team Lead info ”);
	System.out.println(“Name= ”+Emp_Name);
	System.out.println(“Address= ”+Emp_Address);
	System.out.println(“Email id= ”+Emp_Email);
System.out.println(“Employee Id = ”+Emp_id);
System.out.println(“Mobile No= ”+ Emp_mob);
}
Public void grossSalary()
{
	System.out.println(“Gross Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100));
}
Public void netSalary()
{
	System.out.println(“net Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100+getbp()*0.1/100));
}

}
Class AsstProjectManager
{
	Private double bp;
	Public double getbp()
{
	Return this.bp;
}
Public void setbp(double bp)
{
	This.bp=bp;
}
Public void display()
{
	System.out.println(“Asst project Manager info ”);
	System.out.println(“Name= ”+Emp_Name);
	System.out.println(“Address= ”+Emp_Address);
	System.out.println(“Email id= ”+Emp_Email);
System.out.println(“Employee Id = ”+Emp_id);
System.out.println(“Mobile No= ”+ Emp_mob);
}
Public void grossSalary()
{
	System.out.println(“Gross Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100));
}
Public void netSalary()
{
	System.out.println(“net Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100+getbp()*0.1/100));
}

}
Class ProjectManager
{
	Private double bp;
	Public double getbp()
{
	Return this.bp;
}
Public void setbp(double bp)
{
	This.bp=bp;
}
Public void display()
{
	System.out.println(“Project Manager info ”);
	System.out.println(“Name= ”+Emp_Name);
	System.out.println(“Address= ”+Emp_Address);
	System.out.println(“Email id= ”+Emp_Email);
System.out.println(“Employee Id = ”+Emp_id);
System.out.println(“Mobile No= ”+ Emp_mob);
}
Public void grossSalary()
{
	System.out.println(“Gross Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100));
}
Public void netSalary()
{
	System.out.println(“net Salary= ”+(bp+getbp()*97/100+ getbp()*12/100+ getbp()*10/100+getbp()*0.1/100));
}

}
Class Inheritance
{
	Public static void main(String arg[])
	{
	Employee programmer1=new Programmer();
	programmer1.emp_Info(“Ram”,”Pune”,ram@gmail.com,2,9416549844);
	programmer1.display();
	
Programmer Programmer2=new Programmer();
Programmer2.setbp(9000);
Programmer2.grossSalary();
Programmer2.netSalary();

Employee Teamlead1=new TeamLead();
	Teamlead1.emp_Info(“Sham”,”Pune”,sham@gmail.com,3,8416549844);
	Teamlead1.display();

	TeamLead tl2= new TeamLead();
tl2.setbp(15000);
tl2.grossSalary();
tl2.netSalary();

Employee apm1=new AsstProjectManager ();
	apm1.emp_Info(“Raj”,”Mum”,raj@gmail.com,4,1654165554);
	apm1.display();

	AsstProjectManager apm2= new AsstProjectManager ();
apm2.setbp(20000);
apm2.grossSalary();
apm2.netSalary();

Employee pm1=new ProjectManager ();
	pm1.emp_Info(“Mahesh”,”Mum”,Mahesh@gmail.com,5,78365962665);
	pm1.display();

	ProjectManager apm2= new ProjectManager ();
pm2.setbp(30000);
pm2.grossSalary();
pm2.netSalary();




}
}


/*Algorithm/Steps: 
1. Start 
2. Create the class Employee with name, Empid, address, mailid, mobileno as data members. 3. Inherit the classes Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. 
4. Add Basic Pay (BP) as the member of all the inherited classes. 
5. Calculate DA as 97% of BP, HRA as 10% of BP, PF as 12% of BP, Staff club fund as 0.1% of BP.
 6. Calculate gross salary and net salary. 
7. Generate payslip for all categories of employees. 
8. Create the objects for the inherited classes and invoke the necessary methods to display the Payslip 
9. Stop*/
