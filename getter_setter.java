class Student
{
    private int rollNo = 12;
    private String name = "kavi";
    
    public int getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Main{
    public static void main(String[] args)
    {
     Student s1 = new Student();
     s1.setName("Ram");
     s1.setRollNo(11);
     System.out.println(s1.getName() + " : " + s1.getRollNo());
    }
}