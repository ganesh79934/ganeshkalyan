class Array2
{
public static void main(String args[])
{

float a[]={34.2f,35.6f,55.5f,66.8f};
int i;
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}
System.out.print();
for(float x:a)
{
System.out.print(x+" ");
}
System.out.println();
for(i=a.length-1;i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}