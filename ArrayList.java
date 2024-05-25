
import java.util.*;

public class Main {

        public static void main(String[] args)
        {
            ArrayList<Integer> num = new ArrayList<>();
            ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(45,55,66,88,99));
            num.add(0,5);
            System.out.println(num);
            num.addAll(1,lst1);
            System.out.println(num);
            Collections.sort(num);
            System.out.println(num);
            Collections.shuffle(num);
            System.out.println(num);
            System.out.println(num.get(4));
            num.set(3,77);
            System.out.println(num);
            System.out.println(num.size());
            System.out.println(num);
            num.retainAll(Arrays.asList(5,77,99));
            System.out.println(num);
            num.removeAll(Arrays.asList(5,77));
            System.out.println(num);
            num.add(33);
            System.out.println(num);
            num.clear();
            System.out.println(num);
            System.out.println(num.contains(99));
            System.out.println(num.isEmpty());


        }
    }
