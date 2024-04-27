class Student
{
    int rollNo;
    String name;
    int age;
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name  = "Kavi";
        s1.rollNo = 18;
        s1.age = 23;
        
        Student s2 = new Student();
        s2.name = "Ram";
        s2.rollNo = 20;
        s2.age = 21;
        
        Student student[] = new Student[2];
        student[0] = s1;
        student[1] = s2;
       
        
        for(int i = 0;i<student.length;i++)
        {
        System.out.println(student[i].name + ":" + student[i].age);
        }
    }
}