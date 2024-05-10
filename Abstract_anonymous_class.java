abstract class A{
    
    public abstract void show();
    
    public abstract void read();
        
}


public class Main{
    public static void main(String[] a)
    {
      A obj = new A()
      {
          public void show(){                             
              System.out.println("In show anonymous inner class");
          }
          public void read(){
              System.out.println("In read annonymous class");
          }
      };
      obj.show();
      
      obj.read();
    }
}