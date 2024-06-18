import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> str = new ArrayList<>();
        Scanner ak = new Scanner(System.in);


        while(ak.hasNextInt()) {


            if (ak.hasNextInt()) {
                str.add(ak.nextInt());
            } else {
                String input = ak.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }
        ak.close();
        int res = str.stream()
                .filter(n -> n%2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(res);

    }
}





