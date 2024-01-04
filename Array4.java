import java.util.*;
class Array4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[],i,n,big;
System.out.print("Enter the size of an array");
n=s.nextInt();
a=new int[n];
System.out.print("Enter n elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
big=a[0];
for(i=0;i<n;i++)
{
if(big<a[i])
big=a[i];
}
System.out.print("big element is="+big);

}
}
