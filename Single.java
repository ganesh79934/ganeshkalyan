 class First
{
int a=100;
void show()
{
System.out.println("Super demo");
}
}
class Second extends First
{
int a=256;
void show(int a)
{
super.show();
System.out.println(a);
 System.out.println(this.a);
 System.out.println(super.a);
}
}
class Single
{
public static void main(String agrs[])
{
Second s1=new Second();
s1.show(8484);
}
}
 
                            