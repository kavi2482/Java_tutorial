
import java.util.*;


public class Main {

        public static void main(String[] args)
        {
          List<String> lst = new ArrayList<>(Arrays.asList("Hi","Hello","Bye","SeeYou"));
          Comparator<String> com  = new Comparator<String>() {
              @Override
              public int compare(String o1, String o2) {
                  if (o1.length() > o2.length())
                      return 1;
                  else
                      return -1;
              }

          };
          Collections.sort(lst,com);
          System.out.println(lst);            //[Hi, Bye, Hello, SeeYou]


        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(37,54,63,66,72));
        Comparator<Integer> col = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(num,col);
        System.out.println(num);   //[72, 63, 54, 66, 37]
        }
    }
