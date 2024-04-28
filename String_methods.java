import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Scanner ak = new Scanner(System.in);
    String str = ak.next();
    String[] str1 = str.split(",");
     System.out.println(str1.length);
    for (String n : str1)
    {
        System.out.println(n); 
    }
    System.out.println(str.indexOf(","));
     System.out.println(str.substring(7));
      System.out.println(str.lastIndexOf(","));
       System.out.println(str.replace(",","$"));
        System.out.println(str.toUpperCase());
          System.out.println(str.toLowerCase());
    }
   
}