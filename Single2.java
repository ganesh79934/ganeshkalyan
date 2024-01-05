 class Student
{
int admno;
String name;
void get(int admno,String  name)
{
this.admno=admno;
this.name=name;
}
void show()
{
System.out.println("Adimission no="+admno);
System.out.println("Name="+name);
}
}
class Marks extends Student
{
int mat,phy,che;
void getMarks(int mat,int phy,int che)
{
this.mat=mat;
this.phy=phy;
this.che=che;
}
void showMarks()
{
System.out.println("Maths ="+mat);
System.out.println("Physics ="+phy);
System.out.println("Chemistry="+che);
}
}
class Result extends Marks
{
void showResult()
{
System.out.println("Total="+(mat+phy+che));
System.out.println("Avereage="+(mat+phy+che)/3);
}
}
class Single
{
public static void main(String agrs[])
{
Result r1=new Result();
r1.get(12345,"ganesh");
r1.getMarks(22,456,66);
r1.show();
r1.showResult();
r1.showMarks();

}
}            