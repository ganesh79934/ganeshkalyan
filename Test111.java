import java.io.*;
import java.util.*;
class  Test111
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int admno,mat,phy,che,tot,avg;
		String name;
		System.out.println("Enter admno");
		admno=s.nextInt();
		System.out.println("Enter name");
		name=s.nextInt();
		System.out.println("Enter 3 subject marks");
		mat=s.nextInt();
		phy=s.nextInt();
		che=s.nextInt();
		tot=mat+phy+che;
		avg=tot/3;
		printWrter p1=new printWriter("student.txt");
		p1.println("Adimission no="+admno);
        p1.println("Name="+name);
		p1.println("Maths="+mat);
		p1.println("Physics="+phy);
		p1.println("Chemistry="+che);
		p1.println("TOtal="+tot);
		p1.println("Average="+avg);
	}
}
