import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Scanner ak = new Scanner(System.in);
    String str = ak.next();
    StringBuffer buffer = new StringBuffer();
    buffer.append(str);
    System.out.println(buffer.capacity());
    buffer.insert(3," Java");
    System.out.println(buffer);
    buffer.delete(5,8);
    System.out.println(buffer);
    buffer.reverse();
    
    System.out.println(buffer);
    String str1 = buffer.toString();
    
    
    System.out.println(str1);
    }
   
}