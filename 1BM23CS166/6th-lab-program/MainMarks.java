import SEE.Externals;
import java.util.*;
class MainMarks
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students:");
		n=s.nextInt();
		Externals e[]=new Externals[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Externals();
			e[i].inputStudentDetails();
			e[i].displayStudentDetails();
			System.out.println("Enter the CIE marks");
			e[i].inputCIEMarks();
			System.out.println("Enter the SEE marks");
			e[i].inputSEEmarks();
			e[i].calculateFinalMarks();
			System.out.println("Your Final marks are");
			e[i].displayFinalMarks();
		}
	}
}
