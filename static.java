class Demo
{
    int age;
    static int count = 10;    //static variable
    static int rank;         //static variable
    static                  //static block
    {
      rank = 4;
      System.out.println("inside static block");
    }
    public static void show(Demo obj)   //static method
    {
        System.out.println(obj.age + " : " + count + " Rank : " + rank);
    }
    
}



public class Main
{
    public static void main(String[] args)
    {
      Demo d1 = new Demo();
      d1.age = 21;
     Demo d2 = new Demo();
     d2.age = 30;
     Demo.show(d2);
    }
}