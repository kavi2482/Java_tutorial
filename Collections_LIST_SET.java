import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();   //ArrayList and List
        nums.add(3);
        nums.add(5);
        nums.add(9);
        System.out.println(nums.indexOf(5));
        for(int n : nums)
        {
             System.out.println(n);
        }
        System.out.println("***************" ); 
        Set<Integer> res = new HashSet<Integer>();    // HashSet for removing duplicates
        res.add(3);
        res.add(5);
        res.add(9);
        res.add(33);
        res.add(45);
        res.add(3);
        
        for( int e : res){
          System.out.println(e);  
        }
        System.out.println("***************" ); 
        Set<Integer> res1 = new TreeSet<Integer>();   // TreeSet for remove duplicates and return a sorted array
        res1.add(3);
        res1.add(5);
        res1.add(9);
        res1.add(33);
        res1.add(45);
        res1.add(3);
        
        for( int e1 : res1){
          System.out.println(e1);  
        }
        System.out.println("***************" ); 
        Iterator<Integer> values = res1.iterator();   // Iterator used instead of for loop
        while(values.hasNext()){
            System.out.println(values.next());  
        }
        
}
    
}