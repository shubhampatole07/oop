import java.io.*;
import java.util.*;

public class StudentsRecords
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addRecords()throws IOException
	{
		PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st.txt",true)));
		String studentName, Address;
		int studentId, RollNo,Class;
		float Marks;
		String s;
		boolean addMore=false;
		do
		{
			System.out.println("Enter Student Name");
			studentName=br.readLine();
			System.out.println("Enter Student ID");
			studentId=Integer.parseInt(br.readLine());
			System.out.println("Enter Roll No");
			RollNo=Integer.parseInt(br.readLine());
			System.out.println("Enter Address");
			Address=br.readLine();
			System.out.println("Enter  Class");
			Class=Integer.parseInt(br.readLine());
			System.out.println("Enter Marks");
			Marks=Float.parseFloat(br.readLine());

			pw.println(studentName+" "+studentId+" " +RollNo+" "+Address+" "+Class+" "+ Marks);
			System.out.println("Record Added Successfully");
			System.out.println("Do you want to add more records? (y/n)");
			s=br.readLine();
			if(s.equalsIgnoreCase("y"))
			{
				addMore=true;
			}
			else
			{
				addMore=false;
			}
		}while(addMore);
		pw.close();
		showMenu();
	}
	public void displayRecords() throws IOException
	{
		try
		{
			BufferedReader file=new BufferedReader(new FileReader("st.txt"));
			String name;
			while((name=file.readLine())!=null)
			{
				System.out.println(name);
				System.out.println(" ");
			}
		file.close();
		showMenu();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Available");
		}
	}
	public void searchRecords()throws IOException
	{
		try
		{
		BufferedReader file=new BufferedReader(new FileReader("st.txt"));
		String name;
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id of student to search");
		String id=sc.next();
		while((name=file.readLine())!=null)
		{
			String line[]=name.split(" ");
			if(id.equalsIgnoreCase(line[1]))
			{
				System.out.println("Record Found");
				System.out.println(name);
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("Record not Found");
	
		}
	file.close();
	showMenu();
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Record not available");
	}

	}
	public void modifyRecords()throws IOException
	{
		try
		{
			BufferedReader file1=new BufferedReader(new FileReader("st.txt"));
			PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true)));
			String name;
			int flag=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter name student to modify record");
			String searchName=sc.next();
			while((name=file1.readLine())!=null)
			{
				String []line=name.split(" ");
				if(searchName.equalsIgnoreCase(line[0]))
				{
					pw.println(name);
					flag=0;
				}
				else
				{
					System.out.println("Record Found");
					System.out.println("Enter the updated marks");
					String updateMarks=sc.next();
					pw.println(line[0]+" "+line[1]+" "+ line[2]+" "+line[3]+" "+line[4]+" "+updateMarks);
					flag=1;
				}
			}
			file1.close();
			pw.close();
			
			File del= new File("st.txt");
			File old= new File("st1.txt");
			File newf= new File("st.txt");
			if(del.delete())
			{
				System.out.println("file deleted sucessfully");
			}
			else
			{	
				System.out.println("Error");
			}
			if(old.renameTo(newf))
			{
				System.out.println("File Rename Sucessfully");
			}
			else
			{	
				System.out.println("Error");
			}
			showMenu();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Record not available");
		}
	}
	
	public void clearRecords(String str)throws IOException
	{
		PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter(str)));
		pw.close();
		System.out.println("All records deleted sucessfully");	
		showMenu();
	}
	public void showMenu()throws IOException
	{
		System.out.println("1 Add Records, 2. Display Records, 3 Search Records,4 Modify Records, 5 clear Records, 6 Exit");
		System.out.println("Enter your choice");
		int choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
			case 1: addRecords();
			break;
			case 2: displayRecords();
			break;
			case 3: searchRecords();
			break;
			case 4:modifyRecords();
			break;
			case 5: clearRecords("st.text");
			break;
			case 6: System.exit(0);
			break;
			default: System.out.println("Enter proper choice");
		}
	}
	public static void main(String args[]) throws IOException
	{
		StudentsRecords call = new StudentsRecords();
		call.showMenu();
	}
}
