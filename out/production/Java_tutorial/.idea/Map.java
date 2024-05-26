
import java.util.*;


public class Main {

        public static void main(String[] args)
        {
           HashMap<Integer,String> report = new HashMap<>();
            HashMap<Integer,String> temp = new HashMap<>();

            temp.put(2,"B");
            temp.put(3,"C");
            temp.put(4,"D");
            temp.put(5,"E");
            System.out.println("temp : " + temp);
            report.put(1,"A");
            System.out.println(report);
            report.putAll(temp);
            System.out.println(report);
            System.out.println(report.entrySet());
            System.out.println(report.keySet());
            System.out.println(report.values());
            report.remove(3);
            System.out.println(report);
            report.clear();
            System.out.println(report);

            for(Map.Entry<Integer,String> en : temp.entrySet())
                    {
                        System.out.println("Key : " + en.getKey() +" Value : " + en.getValue());

                    }




        }
    }
