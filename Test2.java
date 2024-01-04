class Student
 {

int admno;
String name;
void get(int x,String y)
{
admno=x;
name=y;
}
void show()
{
System.out.println("Admission no="+admno+ "name="+name);
}
}
class Test2
{
public static void main(String args[]) 
{
   
Student s1=new Student();
Student s2=new Student();
s1.get(111,"rrrr");
s2.get(11222,"ddd");
s1.show();
s2.show();

 }
 }                                    
                                          
    
   