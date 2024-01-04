class Sample
{
int a=100;
static int b=50;
void m1()
{
System.out.println("a="+a+"b="+b);
}
static void m2()
{
Sample s=new Sample();
System.out.println("a="+s.a+"b="+b);
}
public static void main(String args[])
{
Sample s1=new Sample();
s1.m1();
s1.m2();
}
}