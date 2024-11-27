package CIE;
import java.util.*;
class Student
{
	public String usn;
	public String name; 
	public int sem;
	public void inputStudentDetails() 
	{ 	
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter Name,USN,Semester");
		usn=s.next();
		name=s.next();
		sem=s.nextInt();
	}
	public void displayStudentDetails() 
	{ 
		System.out.println("USN:"+usn);
		System.out.println("Name"+name);
		System.out.println("Semester:"+sem);
	}
}
public class Internals extends Student
{
	public int marks[]=new int[5];
	public void inputCIEMarks()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
			marks[i]=s.nextInt();
	}
}
