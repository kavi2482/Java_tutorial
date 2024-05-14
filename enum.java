enum Day
{
    Monday,Tuesday,Wednesday;    
}

public class Main{
    public static void main(String[] abs)
    {
        Day a = Day.Wednesday;
        System.out.println(a);
        Day[] b = Day.values();  //give all the values in enum
        for (Day n:b)
        {
            System.out.println(n +":" + n.ordinal()); //ordinal function give postion of the constant
        }
    }
}