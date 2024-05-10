class A{
    int count;
    public void show()
    {
        System.out.println("in Show method");
    }
    static class B
    {
        public void read()
        {
            System.out.println("in read method");
        }
    }
}


public class Main{
    public static void main(String[] a)
    {
      A obj = new A()
      {
          public void show(){                             //anonymous inner class that over ride the method in A class
              System.out.println("In anonymous inner class");
          }
      };
      obj.show();
      System.out.println(obj.count);
     
      A.B obj1 = new A.B();    // if static is not mentioned in method => A.B obj1 =obj.new B();
      obj1.read();
    }
}