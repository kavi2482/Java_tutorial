import java.util.*;
class Demo{
    int count;
    static String name;
    static{
        name = "Kavi";
    }
    public Demo()                        //Default constructor
    {
        
    }
    public Demo(int count,String name)   //Parameterized constructor
    {
        this.count = count;
        this.name = name;
    }
    public Demo(String name)              //method overloading
    {
        this.name = name;
        this.count = 50;
    }
    public int getResult(){
        System.out.println(" *** " + name + " *** " );
        return 100*count;
    }
}

public class Main{
    public static void main(String[] args)

{
 Scanner ak = new Scanner(System.in);
 int a = ak.nextInt();
 String name = ak.next();
 Demo s1 = new Demo(a,name);
 Demo s2 = new Demo(name);
 Demo s3 = new Demo();
 System.out.println("Count : " + s1.getResult());
 System.out.println("Count : " + s2.getResult());
 System.out.println("Count : " + s3.getResult());

}
}