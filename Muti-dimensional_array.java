import java.util.*;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ak = new Scanner(System.in);
        int num[][] = new int[5][3];
        for (int i = 0;i<(num.length);i++)
        {
            for (int j = 0;j<num[i].length;j++)
            {
            num[i][j] = (int)(Math.random()*100);
            }
        }
        for(int n[] : num)
        {
            for(int n1 : n)
            {
                System.out.print(" " + n1);
            }
        System.out.println("");
        }
        
    }
}