class Student
{
int admno;
String name;
void get(int admno,String name)
{
this.admno=admno;

this.name=name;
}
void show()
{
System.out.println("admno="+admno+"  Name="+name);

}
public static void main(String args[])
{
Student s1=new Student();
s1.get(33345,"ganesh");
s1.show();
}
}