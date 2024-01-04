import java.util.*;
class Array3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[],i,n,sum=0;
float avg;
System.out.print("Enter the size of an array");
n=s.nextInt();
a=new int[n];
System.out.print("Enter n elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
avg=(float)sum/n;
System.out.print("sum of elements="+sum);
System.out.print("avg of elements="+avg);
}
}
