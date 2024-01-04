import java.util.*;
class Array6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][],i,j,n,m,sum=0;
System.out.print("Enter the size of an matrix");
n=s.nextInt();
a=new int[n][n];
System.out.print("Enter elements");
for(i=0;i<n;i++)
{
for(j=0;j<n;i++)
{
a[i][j]=s.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(i==j)
sum=sum+a[i][j];
}
}
System.out.print("sum of diagonal element is="+sum);
}
}

