import java.util.*;
class OwnException extends Exception{   // create a custom Exception
    public OwnException(String str){
        super(str);
    };
}
public class Main{
    public static void main(String[] args)
    {
        Scanner ak = new Scanner(System.in);
        int a = ak.nextInt();
        int i = ak.nextInt();
        System.out.println("Enter next set : ");
        int y = ak.nextInt();
        int z = ak.nextInt();
        try{
            int j  = a/i;
            if(j==0){
             throw new OwnException("don't want j as 0");
        }}
        catch(OwnException e){
            System.out.println(e);
        }
            
        
        
        try{
            int res = y/z;
        }
        catch(ArithmeticException e){
            System.out.println("not able to divide by 0 " + e);
        }
        catch(Exception e){
            System.out.println("not able to proccess " + e);
        }
        String str = null;
        try {
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException occurred: " + e.getMessage());
        }
        
    }
}