
import java.util.*;



public class Main {

        public static void main(String[] args) {
            int arr[] = new int[5];
            arr[0] = 1;
            arr[1] = 3;
            arr[2] = 5;
            List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
            Set<Integer> st = new HashSet<>();
            st.addAll(lst);
            System.out.println("ForEach method");
            lst.forEach(n -> System.out.println(n));
            System.out.println("forEach loop");
            for(int n: lst){
                System.out.println(n);
            }
            System.out.println("for loop");
            for(int i=0;i<st.size();i++){
               // System.out.println(st[i]);
            }
            System.out.println("iterator method");
            Iterator ak = lst.iterator();
            while(ak.hasNext()){
               System.out.println(ak.next());
            }


        }
}
