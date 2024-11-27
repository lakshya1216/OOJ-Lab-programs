package SEE;
import java.util.*;
import CIE.Internals;
public class Externals extends Internals
{
	public int seemarks[]=new int[5];
	public int finalmarks[]=new int[5];
	Scanner s=new Scanner(System.in);
	public void inputSEEmarks()
	{
		for(int i=0;i<5;i++)
			seemarks[i]=s.nextInt();
	}
	public void calculateFinalMarks()
	{
		for(int i=0;i<5;i++)
			finalmarks[i]=(marks[i])+(seemarks[i]/2);
	}
	public void displayFinalMarks()
	{
		for(int i=0;i<5;i++)
			System.out.println(finalmarks[i]);
	}
}
