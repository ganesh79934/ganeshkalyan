import java.util.*;
class Array5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[],i,n;
System.out.print("Enter the size of an array");
n=s.nextInt();
a=new int[n];
System.out.print("Enter n elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the elements before sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]+" ");
}

System.out.print();
Array5.sort(a);
System.out.println("the elements after sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]+" ");
}
}
}
