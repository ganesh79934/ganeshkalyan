 class Student1
{
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
class Marks extends Student1
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
System.out.println("Total="+(mat+phy+che));
System.out.println("Avereage="+(mat+phy+che)/3);
}
}
class Single
{
public static void main(String agrs[])
{
Marks m1=new Marks();
m1.get(12345,"ganesh");
m1.getMarks(22,456,66);
m1.show();

m1.showMarks();

}
}            