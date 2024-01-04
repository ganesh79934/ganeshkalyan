class Student
 {

int admno;
String name;
void get(int x,int y)
{
admno=x;
name=y;
}
void show()
{
System.out.println("Admission no="+admno+ "name="+name);
}
}
class Test
{
public static void main(String args[]) 
{
   
Student s1=new Student();
s1.get(111,"rrrr");
s1.show();
Student s2=new Student();
s2.get(11222,"ddd");
s2.show();
 }
 }                                    
                                          
    
   