enum Day
{
    Monday,Tuesday,Wednesday,Friday;    
}

public class Main{
    public static void main(String[] abs)
    {
       Day a = Day.Tuesday;
       switch(a)
       {
           case Monday:
               {
               System.out.println("Small Sunday");
               break;
           }
           case Tuesday:
               {
               System.out.println("Dry day");
               break;
           }
           case Wednesday:
               {
               System.out.println("Hard day");
               break;
           }
           case Friday:
               {
               System.out.println("Fun day");
               break;
           }
           default:
           {
               System.out.println(" Zero day");
               break;
           }
          
       }
       Day d = Day.Friday;
       if (d == Day.Monday) 
               {
               System.out.println("Small Sunday");
               
           }
           else if (d == Day.Tuesday) 
               {
               System.out.println("Dry day");
              
           }
           else if (d == Day.Wednesday) 
               {
               System.out.println("Hard day");
               
           }
           else if (d == Day.Friday) 
               {
               System.out.println("Fun day");
               
           }
            else
           {
               System.out.println(" Zero day");
               
           }
    }
}